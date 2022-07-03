package prev.phase.asmgen;

import java.util.*;

import prev.Compiler;
import prev.common.report.Report;
import prev.data.mem.*;
import prev.data.imc.code.expr.*;
import prev.data.imc.visitor.*;
import prev.data.asm.*;

/**
 * Machine code generator for expressions.
 */
public class ExprGenerator implements ImcVisitor<MemTemp, Vector<AsmInstr>> {
    public MemTemp visit(ImcBINOP binOp, Vector<AsmInstr> instructions) {
        MemTemp reg = new MemTemp();

        Vector<MemTemp> used = new Vector<>();
        used.add(binOp.fstExpr.accept(this, instructions));
        used.add(binOp.sndExpr.accept(this, instructions));

        Vector<MemTemp> def = new Vector<>();
        def.add(reg);

        switch (binOp.oper) {
            // easier cases
            case ADD -> instructions.add(new AsmOPER("ADD `d0,`s0,`s1", used, def, null));
            case SUB -> instructions.add(new AsmOPER("SUB `d0,`s0,`s1", used, def, null));
            case MUL -> instructions.add(new AsmOPER("MUL `d0,`s0,`s1", used, def, null));
            case DIV -> instructions.add(new AsmOPER("DIV `d0,`s0,`s1", used, def, null));
            case OR -> instructions.add(new AsmOPER("OR `d0,`s0,`s1", used, def, null));
            case AND -> instructions.add(new AsmOPER("AND `d0,`s0,`s1", used, def, null));
            // modulo
            case MOD -> {
                instructions.add(new AsmOPER("DIV `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("GET `d0,rR", null, def, null));
            }
            // comparisons (first compare returns -1, 0 or 1)
            // this is then transformed into 0 or 1
            case EQU -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("ZSZ `d0,`s0,1", def, def, null));
            }
            case NEQ -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("AND `d0,`s0,1", def, def, null));
            }
            case LTH -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("ZSN `d0,`s0,1", def, def, null));
            }
            case GTH -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("ZSP `d0,`s0,1", def, def, null));
            }
            case LEQ -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("ZSNP `d0,`s0,1", def, def, null));
            }
            case GEQ -> {
                instructions.add(new AsmOPER("CMP `d0,`s0,`s1", used, def, null));
                instructions.add(new AsmOPER("ZSNN `d0,`s0,1", def, def, null));
            }
            default -> throw new Report.Error("Unknown binary operation " + binOp.oper);
        }
        return reg;
    }

    public MemTemp visit(ImcCALL call, Vector<AsmInstr> instructions) {
        // prologue
        for (int i = 0; i < call.args.size(); i++) {
            ImcExpr arg = call.args.get(i);
            Long off = call.offs.get(i);

            MemTemp argTemp = arg.accept(this, instructions);
            Vector<MemTemp> used = new Vector<>();
            used.add(argTemp);

            instructions.add(new AsmOPER("STO `s0,$254," + off, used, null, null));
        }

        // body
        final int NUM_REGS = 8;
        instructions.add(new AsmOPER("PUSHJ " + NUM_REGS + "," + call.label.name, null, null, null));

        // epilogue
        MemTemp ret = new MemTemp();
        Vector<MemTemp> defs = new Vector<>();
        defs.add(ret);

        instructions.add(new AsmOPER("LDO `d0,$254,0", null, defs, null));
        return ret;
    }

    public static Vector<AsmInstr> loadConst(MemTemp temp, long value) {
        Vector<AsmInstr> instructions = new Vector<>();

        Vector<MemTemp> used = new Vector<>();
        used.add(temp);

        Vector<MemTemp> defs = new Vector<>();
        defs.add(temp);

        // First load the absolute value and then negate it.
        long abs = Math.abs(value);

        // Get all for 8 bit parts of the long (l0 = LSB, l3 = MSB).
        int l0 = (int) (abs & 0xFFFF);
        int l1 = (int) ((abs >> 16) & 0xFFFF);
        int l2 = (int) ((abs >> 32) & 0xFFFF);
        int l3 = (int) ((abs >> 48) & 0xFFFF);

        // Set register.
        instructions.add(new AsmOPER("SETL `d0" + l0, null, defs, null));
        if (l1 != 0) instructions.add(new AsmOPER("INCML `d0," + l1, used, defs, null));
        if (l2 != 0) instructions.add(new AsmOPER("INCMH `d0," + l2, used, defs, null));
        if (l3 != 0) instructions.add(new AsmOPER("INCH `d0," + l3, used, defs, null));

        // Negate if needed.
        if (value < 0) {
            instructions.add(new AsmOPER("NEG `d0,`s0", used, defs, null));
        }
        return instructions;
    }

    public MemTemp visit(ImcCONST constant, Vector<AsmInstr> instructions) {
        MemTemp reg = new MemTemp();
        instructions.addAll(loadConst(reg, constant.value));
        return reg;
    }


    public MemTemp visit(ImcMEM mem, Vector<AsmInstr> instructions) {
        MemTemp temp = new MemTemp();
        MemTemp addr = mem.addr.accept(this, instructions);

        Vector<MemTemp> used = new Vector<>();
        Vector<MemTemp> defs = new Vector<>();

        used.add(addr);
        defs.add(temp);

        instructions.add(new AsmMOVE("LDO `d0,`s0,0", used, defs));

        return temp;
    }

    public MemTemp visit(ImcNAME name, Vector<AsmInstr> instructions) {
        MemTemp reg = new MemTemp();
        Vector<MemTemp> defs = new Vector<>();
        defs.add(reg);

        // Load address/label Y to register X.
        instructions.add(new AsmOPER("LDA `d0," + name.label.name, null, defs, null));
        return reg;
    }

    public MemTemp visit(ImcSEXPR sExpr, Vector<AsmInstr> instructions) {
        instructions.addAll(sExpr.stmt.accept(new StmtGenerator(), null));
        return sExpr.expr.accept(this, instructions);
    }

    public MemTemp visit(ImcTEMP temp, Vector<AsmInstr> instructions) {
        return temp.temp;
    }

    public MemTemp visit(ImcUNOP unOp, Vector<AsmInstr> instructions) {
        MemTemp reg = new MemTemp();

        Vector<MemTemp> used = new Vector<>();
        used.add(unOp.subExpr.accept(this, instructions));

        Vector<MemTemp> defs = new Vector<>();
        defs.add(reg);

        // Negate ints and booleans differently.
        switch (unOp.oper) {
            case NOT -> instructions.add(new AsmOPER("XOR `d0,`s0,1", used, defs, null));
            case NEG -> instructions.add(new AsmOPER("NEG `d0,`s0", used, defs, null));
        }

        return reg;
    }
}
