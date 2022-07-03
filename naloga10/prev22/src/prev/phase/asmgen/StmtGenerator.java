package prev.phase.asmgen;

import java.util.*;

import prev.data.imc.code.expr.*;
import prev.data.imc.code.stmt.*;
import prev.data.imc.visitor.*;
import prev.data.lin.LinCodeChunk;
import prev.data.mem.*;
import prev.data.asm.*;
import prev.common.report.*;

/**
 * Machine code generator for statements.
 */
public class StmtGenerator implements ImcVisitor<Vector<AsmInstr>, Object> {
    public Vector<AsmInstr> visit(ImcCJUMP cJump, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();

        MemTemp condTemp = cJump.cond.accept(new ExprGenerator(), instructions);

        Vector<MemLabel> jumps = new Vector<>();
        jumps.add(cJump.posLabel);
        jumps.add(cJump.negLabel);

        Vector<MemTemp> used = new Vector<>();
        used.add(condTemp);

        // Add the actual jump.
        instructions.add(new AsmOPER("BNZ `s0," + cJump.posLabel.name, used, null, jumps));

        return instructions;
    }

    public Vector<AsmInstr> visit(ImcESTMT eStmt, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();
        eStmt.expr.accept(new ExprGenerator(), instructions);
        return instructions;
    }

    public Vector<AsmInstr> visit(ImcJUMP jump, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();

        // The jump.
        Vector<MemLabel> jumps = new Vector<>();
        jumps.add(jump.label);

        // If the jump is a return from the function, use the frame return value.
        Vector<MemTemp> used = new Vector<>();
        if (arg instanceof LinCodeChunk && jump.label == ((LinCodeChunk) arg).exitLabel) {
            used.add(((LinCodeChunk) arg).frame.RV);
        }

        instructions.add(new AsmOPER("JMP " + jump.label.name, used, null, jumps));
        return instructions;
    }

    public Vector<AsmInstr> visit(ImcLABEL label, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();
        instructions.add(new AsmLABEL(label.label));
        return instructions;
    }

    public Vector<AsmInstr> visit(ImcMOVE move, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();
        Vector<MemTemp> used = new Vector<>();
        Vector<MemTemp> defs = new Vector<>();

        if (!(move.dst instanceof ImcMEM) && !(move.src instanceof ImcMEM)) {
            // Reg->reg move.
            MemTemp src = move.src.accept(new ExprGenerator(), instructions);
            MemTemp dst = move.dst.accept(new ExprGenerator(), instructions);
            used.add(src);
            defs.add(dst);

            // Move from reg to reg.
            instructions.add(new AsmMOVE("SET `d0,`s0", used, defs));
        } else if (move.dst instanceof ImcMEM && move.src instanceof ImcMEM) {
            // Load from mem and store to mem.
            MemTemp srcTemp = ((ImcMEM) move.src).addr.accept(new ExprGenerator(), instructions);
            MemTemp dstTemp = ((ImcMEM) move.dst).addr.accept(new ExprGenerator(), instructions);

            MemTemp temp = new MemTemp();
            defs.add(temp);
            used.add(srcTemp);

            // Do the work.
            instructions.add(new AsmOPER("LDO `d0,`s0,0", used, defs, null));
            used.add(dstTemp);
            instructions.add(new AsmOPER("STO `s0,`s1,0", used, null, null));
        } else if (move.src instanceof ImcMEM) {
            MemTemp srcTemp = ((ImcMEM) move.src).addr.accept(new ExprGenerator(), instructions);
            MemTemp dstTemp = move.dst.accept(new ExprGenerator(), instructions);

            defs.add(dstTemp);
            used.add(srcTemp);
            instructions.add(new AsmOPER("LDO `d0,`s0,0", used, defs, null));
        } else {
            MemTemp srcTemp = move.src.accept(new ExprGenerator(), instructions);
            MemTemp dstTemp = ((ImcMEM) move.dst).addr.accept(new ExprGenerator(), instructions);

            used.add(srcTemp);
            used.add(dstTemp);

            instructions.add(new AsmOPER("STO `s0,`s1,0", used, null, null));
        }

        return instructions;
    }

    public Vector<AsmInstr> visit(ImcSTMTS stmts, Object arg) {
        Vector<AsmInstr> instructions = new Vector<>();
        for (ImcStmt statement : stmts.stmts) {
            instructions.addAll(statement.accept(this, arg));
        }
        return instructions;
    }
}
