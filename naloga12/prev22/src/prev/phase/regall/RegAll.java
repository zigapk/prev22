package prev.phase.regall;

import java.util.*;

import prev.data.mem.*;
import prev.data.asm.*;
import prev.phase.*;
import prev.phase.asmgen.*;

/**
 * Register allocation.
 */
public class RegAll extends Phase {

    private int REG_COUNT = 8;
    private int FP_REG = 253;

    /**
     * Mapping of temporary variables to registers.
     */
    public final HashMap<MemTemp, Integer> tempToReg = new HashMap<MemTemp, Integer>();

    public RegAll(int nregs) {
        super("regall");
        this.REG_COUNT = nregs;
    }

    public void allocate() {
        for (Code code : AsmGen.codes) {
            HashMap<MemTemp, HashSet<MemTemp>> g = graph(code);
            HashMap<MemTemp, HashSet<MemTemp>> simplified = new HashMap<>(g);

            LinkedList<MemTemp> taken = new LinkedList<>();
            LinkedList<Boolean> status = new LinkedList<>();

            // Simplify the graph.
            while (taken.size() < g.size()) {
                boolean spill = true;
                LinkedList<MemTemp> toRemove = new LinkedList<>();
                for (Map.Entry<MemTemp, HashSet<MemTemp>> current : simplified.entrySet()) {
                    if (current.getValue().size() < REG_COUNT) {
                        taken.add(current.getKey());
                        status.add(false);
                        spill = false;
                        toRemove.add(current.getKey());
                    }
                }

                // Spill if necessary.
//                System.out.println(taken.size() + " " + g.size() + " " + spill);
                if (taken.size() < g.size() && spill) {
                    taken.add(simplified.keySet().iterator().next());
                    status.add(true);
                    toRemove.add(simplified.keySet().iterator().next());
                }

                // Remove the spilled nodes.
                for (MemTemp temp : toRemove) {
                    simplified.remove(temp);
                }
            }

            // Select the registers.
            while (taken.size() > 0) {
                MemTemp temp = taken.removeLast();
                boolean spill = status.removeLast();

                // Handle frame pointer.
                if (temp == code.frame.FP) {
                    tempToReg.put(temp, FP_REG);
                    continue;
                }

                boolean[] usedRegs = new boolean[REG_COUNT];
                for (MemTemp used : g.get(temp)) {
                    if (tempToReg.containsKey(used) && tempToReg.get(used) != FP_REG) {
                        usedRegs[tempToReg.get(used)] = true;
                    }
                }

                boolean spilled = spill;
                for (int i = 0; i < REG_COUNT; i++) {
                    if (!usedRegs[i]) {
                        tempToReg.put(temp, i);
                        spilled = false;
                        break;
                    }
                }

                if (spilled) {
                    System.out.println("SPILLED");
                }
            }

            // Remove redundant sets (SET $X, $X).
            code.instrs.removeIf(instr -> instr instanceof AsmMOVE && Objects.equals(tempToReg.get(instr.defs().firstElement()), tempToReg.get(instr.uses().firstElement())));
        }
    }

    public HashMap<MemTemp, HashSet<MemTemp>> graph(Code code) {
        HashMap<MemTemp, HashSet<MemTemp>> g = new HashMap<>();
        g.put(code.frame.FP, new HashSet<>());
        g.put(code.frame.RV, new HashSet<>());

        for (AsmInstr instr : code.instrs) {
            if (instr.defs().size() > 0) {
                g.put(instr.defs().firstElement(), new HashSet<>());
            }

            for (MemTemp temp1 : instr.in()) {
                if (!g.containsKey(temp1)) {
                    g.put(temp1, new HashSet<>());
                }

                for (MemTemp temp2 : instr.in()) {
                    if (temp1 != temp2) {
                        g.get(temp1).add(temp2);
                    }
                }

                Set<MemTemp> outputs = instr.out();
                outputs.addAll(instr.defs());

                for (MemTemp t1 : outputs) {
                    if (!g.containsKey(t1)) {
                        g.put(t1, new HashSet<>());
                    }

                    for (MemTemp t2 : outputs) {
                        if (t1 != t2) {
                            g.get(t1).add(t2);
                        }
                    }
                }
            }

        }
        return g;
    }

    public void log() {
        if (logger == null)
            return;
        for (Code code : AsmGen.codes) {
            logger.begElement("code");
            logger.addAttribute("entrylabel", code.entryLabel.name);
            logger.addAttribute("exitlabel", code.exitLabel.name);
            logger.addAttribute("tempsize", Long.toString(code.tempSize));
            code.frame.log(logger);
            logger.begElement("instructions");
            for (AsmInstr instr : code.instrs) {
                logger.begElement("instruction");
                logger.addAttribute("code", instr.toString(tempToReg));
                logger.begElement("temps");
                logger.addAttribute("name", "use");
                for (MemTemp temp : instr.uses()) {
                    logger.begElement("temp");
                    logger.addAttribute("name", temp.toString());
                    logger.endElement();
                }
                logger.endElement();
                logger.begElement("temps");
                logger.addAttribute("name", "def");
                for (MemTemp temp : instr.defs()) {
                    logger.begElement("temp");
                    logger.addAttribute("name", temp.toString());
                    logger.endElement();
                }
                logger.endElement();
                logger.begElement("temps");
                logger.addAttribute("name", "in");
                for (MemTemp temp : instr.in()) {
                    logger.begElement("temp");
                    logger.addAttribute("name", temp.toString());
                    logger.endElement();
                }
                logger.endElement();
                logger.begElement("temps");
                logger.addAttribute("name", "out");
                for (MemTemp temp : instr.out()) {
                    logger.begElement("temp");
                    logger.addAttribute("name", temp.toString());
                    logger.endElement();
                }
                logger.endElement();
                logger.endElement();
            }
            logger.endElement();
            logger.endElement();
        }
    }

}
