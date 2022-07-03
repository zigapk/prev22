package prev.phase.all;

import prev.Compiler;
import prev.common.report.Report;
import prev.data.asm.AsmInstr;
import prev.data.asm.AsmLABEL;
import prev.data.asm.AsmOPER;
import prev.data.asm.Code;
import prev.data.lin.LinDataChunk;
import prev.data.mem.MemTemp;
import prev.phase.Phase;
import prev.phase.asmgen.AsmGen;
import prev.phase.asmgen.ExprGenerator;
import prev.phase.imclin.ImcLin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Vector;

public class All extends Phase {
    private final HashMap<MemTemp, Integer> regs;
    private final int REG_COUNT;

    public All(HashMap<MemTemp, Integer> registers, int nregs) {
        super("all");
        this.regs = registers;
        this.REG_COUNT = nregs;
    }

    private Vector<String> bootstrap() {
        Vector<String> result  = new Vector<>();

        // SP = reg $254 (stack pointer)
        // FP = reg $253 (frame pointer)
        // HP = reg $252 (heap pointer)

        result.add("SP\tGREG\t#4000000000000000");
        result.add("FP\tGREG\t0");
        result.add("\n");

        // Static data segment (constants)
        result.add("\tLOC\tData_Segment");

        // Set current address as base address for data segment
        result.add("\tGREG\t@");

        // Input and output buffers
        result.add("InSize\tIS\t2");
        result.add("InBuffer\tOCTA\t0");
        result.add("\tLOC\tInBuffer+InSize");
        result.add("BufferPosition\tOCTA\t@");
        result.add("InArgs\tOCTA\tInBuffer,InSize");
        result.add("OutBuffer \tOCTA\t0");
        result.add("\tLOC\tOutBuffer+InSize");
        result.add("OutBufferPosition\tOCTA\t@");
        result.add("\n");

        for (LinDataChunk dataChunk : ImcLin.dataChunks()) {
            if (dataChunk.init == null) {
                // Non-string data
                StringBuilder builder = new StringBuilder(dataChunk.label.name + "\tOCTA\t");
                for (int i = 0; i < dataChunk.size; i += 8) {
                    if (i > 0)
                        builder.append(",");
                    builder.append("0");
                }
                result.add(builder.toString());
            } else {
                // This is a string (escape with null terminator).
                result.add(dataChunk.label.name + "\tOCTA\t\"" + dataChunk.init.substring(1, dataChunk.init.length() - 1).replaceAll("\"", "\",34,\"") + "\",0");
            }
        }
        result.add("\n");

        // Heap after all the static data, initialized to @ (current position).
        result.add("HP\tGREG\t@");

        // Start program at #100.
        result.add("\tLOC\t#100");

        // Main label for mmix
        result.add("Main\tPUSHJ\t$" + this.REG_COUNT + ",_main");

        // Store the result to the $255 and halt (this wil set the right return code).
        result.add("\tLDO\t$255,$254,0");
        result.add("\tTRAP\t0,Halt,0");
        result.add("\n");

        return result;
    }

    private Vector<String> stdLib() {
        Vector<String> result  = new Vector<>();

        // _new
        result.add("_new\tSTO $252,$254,0");
        result.add("\tLDO $0,$254,8");
        result.add("\tMUL $0,$0,8");
        result.add("\tADD $252,$252,$0");
        result.add("\tPOP 0,0");
        result.add("\n");

        // _del
        // Pop and do nothing.
        result.add("_del\tPOP\t" + this.REG_COUNT + ",0");
        result.add("\n");

        // _putChar
        result.add("_putChar\tLDA\t$255,OutBuffer");
        result.add("\tLDO\t$0,SP,8");
        result.add("\tSTB\t$0,$255,0");
        result.add("\tTRAP\t0,Fputs,StdOut");
        result.add("\tPOP\t0,0");
        result.add("\n");

        // _getChar
        result.add("_getChar\tLDA\t$0,InBuffer");
        result.add("\tSET\t$1,0");
        result.add("\tSTO\t$1,$0,0");
        result.add("\tLDA\t$255,InArgs");
        result.add("\tTRAP\t0,Fgets,StdIn");
        result.add("\tLDB\t$1,$0,0");
        result.add("\tSTO\t$1,SP,0");
        result.add("\tPOP\t0,0");
        result.add("\n");

        return result;
    }

    // Converts code to string.
    private Vector<String> c2s(Code code) {
        Vector<String> result  = new Vector<>();
        AsmLABEL lastLabel = null;
        for (AsmInstr instr : code.instrs) {
            if (instr instanceof AsmLABEL) {
                if (lastLabel != null) {
                    // Add NOOP (SWYM)
                    result.add(lastLabel.toString(this.regs) + "\tSWYM 0,0,0");
                }
                lastLabel = (AsmLABEL) instr;
            } else {
                if (lastLabel != null) {
                    result.add(lastLabel.toString(this.regs) + "\t" + instr.toString(this.regs));
                    lastLabel = null;
                } else {
                    result.add("\t" + instr.toString(this.regs));
                }
            }
        }

        return result;
    }

    private void injectPrologue(Code code) {
        Vector<AsmInstr> prologue = new Vector<>();

        // Temp as $0 to store the store constants during prologue/epilogue.
        MemTemp temp = new MemTemp();
        this.regs.put(temp, 0);

        // Start of function label
        prologue.add(new AsmLABEL(code.frame.label));

        // Store old FP
        long oldFP = code.frame.locsSize + 8;
        prologue.addAll(ExprGenerator.loadConst(temp, oldFP));
        prologue.add(new AsmOPER("SUB $0,SP,$0", null, null, null));
        prologue.add(new AsmOPER("STO FP,$0,0", null, null, null));

        // Store retAddr
        prologue.add(new AsmOPER("SUB $0,$0,8", null, null, null));
        prologue.add(new AsmOPER("GET $1,rJ", null, null, null));
        prologue.add(new AsmOPER("STO $1,$0,0", null, null, null));

        // Set FP
        prologue.add(new AsmOPER("SET FP,SP", null, null, null));
        // Set SP
        long frameSize = code.frame.size + code.tempSize;
        prologue.addAll(ExprGenerator.loadConst(temp, frameSize));
        prologue.add(new AsmOPER("SUB SP,SP,$0", null, null, null));

        // Jump to body
        prologue.add(new AsmOPER("JMP " + code.entryLabel.name, null, null, null));

        // Inject into code
        code.instrs.addAll(0, prologue);
    }

    private void injectEpilogue(Code code) {
        Vector<AsmInstr> epilogue = new Vector<>();

        // Temp as $0 to store the store constants during prologue/epilogue.
        MemTemp temp = new MemTemp();
        this.regs.put(temp, 0);

        // End of function label
        epilogue.add(new AsmLABEL(code.exitLabel));

        // Store return value
        Vector<MemTemp> used = new Vector<>();
        used.add(code.frame.RV);
        epilogue.add(new AsmOPER("STO `s0,FP,0", used, null, null));

        // SET SP = FP
        epilogue.add(new AsmOPER("SET SP,FP", null, null, null));

        // Load old FP
        long oldFP = code.frame.locsSize + 8;
        epilogue.addAll(ExprGenerator.loadConst(temp, oldFP));
        epilogue.add(new AsmOPER("SUB $0,SP,$0", null, null, null));
        epilogue.add(new AsmOPER("LDO FP,$0,0", null, null, null));

        // Load retAddr to rJ from function frame
        epilogue.add(new AsmOPER("SUB $0,$0,8", null, null, null));
        epilogue.add(new AsmOPER("LDO $0,$0,0", null, null, null));
        epilogue.add(new AsmOPER("PUT rJ,$0", null, null, null));
        epilogue.add(new AsmOPER("POP " + this.REG_COUNT + ",0", null, null, null));
        // Inject into code
        code.instrs.addAll(epilogue);
    }

    public Vector<String> getCode() {
        Vector<String> result = new Vector<>();
        for (Code code : AsmGen.codes) {
            if (code.frame.label.name.equals("_getChar") || code.frame.label.name.equals("_putChar")) {
                continue;
            }
            injectPrologue(code);
            injectEpilogue(code);
            result.addAll(c2s(code));
        }

        return result;
    }

    public void compile() {
        try {
            System.out.print("Writing output to file: ");
            System.out.println(Compiler.cmdLineArgValue("--dst-file-name"));

            File out = new File(Compiler.cmdLineArgValue("--dst-file-name"));
            BufferedWriter output = new BufferedWriter(new FileWriter(out));


            for (String instr : bootstrap()) {
                output.write(instr + "\n");
            }

            for (String instr : stdLib()) {
                output.write(instr + "\n");
            }

            for (String instr : getCode()) {
                output.write(instr + "\n");
            }

            output.close();
        } catch (Exception e) {
            throw new Report.Error("Could not compile!");
        }
    }
}
