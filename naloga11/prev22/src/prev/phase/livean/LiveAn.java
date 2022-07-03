package prev.phase.livean;

import prev.data.mem.*;
import prev.data.asm.*;
import prev.phase.*;
import prev.phase.asmgen.*;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Liveness analysis.
 */
public class LiveAn extends Phase {

	public LiveAn() {
		super("livean");
	}

	public void compLifetimes() {
		for (Code code : AsmGen.codes) {
			analyzeCode(code);
		}
	}

	public void analyzeCode(Code code) {
		// Find immediate (initial) successors.
		HashMap<MemLabel, Integer> succs = new HashMap<>();
		for (int i = 0; i < code.instrs.size(); i++) {
			AsmInstr instr = code.instrs.get(i);
			if (instr instanceof AsmLABEL) {
				succs.put(((AsmLABEL)instr).label, i);
			}
		}

		// Remove everything from operators.
		for (int i = 0; i < code.instrs.size(); i++) {
			AsmInstr current = code.instrs.get(i);
			if (!(current instanceof AsmOPER oper)) continue; // skip all non-operators

			oper.removeAllFromIn();
			oper.removeAllFromOut();
		}

		boolean notDone = true;
		while (notDone) {
			notDone = false;

			// Loop over all instructions but the last one.
			for (int i = 0; i < code.instrs.size() - 1; i++) {
				AsmInstr current = code.instrs.get(i);
				if (!(current instanceof AsmOPER oper)) continue; // skip all non-operators

				HashSet<MemTemp> prevIn = oper.in();
				HashSet<MemTemp> prevOut = oper.out();

				// Compute the new out set.
				HashSet<MemTemp> newOut = new HashSet<>();
				if (oper.jumps().size() < 1) {
					if (i + 1 < code.instrs.size()) {
						// Only one direct successor (i+1th instruction).
						newOut.addAll(code.instrs.get(i + 1).in());
					}
				} else {
					// Multiple successors.
					for (MemLabel label : oper.jumps()) {
						Integer line = succs.get(label);
						if (line == null) {
							continue;
						}

						if (line < code.instrs.size()) {
							newOut.addAll(code.instrs.get(line).in());
						}
					}
				}

				oper.addOutTemp(newOut);

				// Compute the new in set.
				HashSet<MemTemp> newIn = new HashSet<>();
				newIn.addAll(oper.out());
				newIn.removeAll(oper.defs());
				newIn.addAll(oper.uses());
				oper.addInTemps(newIn);

				// Do we need another pass?
				notDone = notDone || !newIn.equals(prevIn) || !newOut.equals(prevOut);
			}

		}
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
				logger.addAttribute("code", instr.toString());
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
