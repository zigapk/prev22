package prev.phase.imclin;

import java.util.*;

import prev.common.report.*;
import prev.data.mem.*;
import prev.data.imc.code.expr.*;
import prev.data.imc.code.stmt.*;
import prev.data.imc.visitor.*;

/**
 * Statement canonizer.
 */
public class StmtCanonizer implements ImcVisitor<Vector<ImcStmt>, Object> {
    public Vector<ImcStmt> visit(ImcCJUMP imcCJump, Object visArg) {
        Vector<ImcStmt> result = new Vector<>();
        ImcExpr condition = imcCJump.cond.accept(new ExprCanonizer(), result);
        result.add(new ImcCJUMP(condition, imcCJump.posLabel, imcCJump.negLabel));
        return result;
    }

    public Vector<ImcStmt> visit(ImcESTMT imcEStmt, Object visArg) {
        if (imcEStmt.expr instanceof ImcCALL) {
            Vector<ImcStmt> result = new Vector<>();
            ImcCALL call = (ImcCALL) imcEStmt.expr;
            Vector<ImcExpr> args = new Vector<>();

            for (ImcExpr arg : call.args) {
                ImcExpr canonizedArg = arg.accept(new ExprCanonizer(), result);
                args.add(canonizedArg);
            }
            result.add(new ImcESTMT(new ImcCALL(call.label, call.offs, args)));
            return result;
        }

        Vector<ImcStmt> result = new Vector<>();
        ImcExpr expr = imcEStmt.expr.accept(new ExprCanonizer(), result);
        result.add(new ImcESTMT(expr));
        return result;
    }

    public Vector<ImcStmt> visit(ImcJUMP imcJump, Object visArg) {
        Vector<ImcStmt> result = new Vector<>();
        result.add(new ImcJUMP(imcJump.label));
        return result;
    }

    public Vector<ImcStmt> visit(ImcLABEL imcLabel, Object visArg) {
        Vector<ImcStmt> result = new Vector<>();
        result.add(new ImcLABEL(imcLabel.label));
        return result;
    }

    public Vector<ImcStmt> visit(ImcMOVE imcMove, Object visArg) {
        /*if (imcMove.dst instanceof ImcMEM) {
            System.out.println("a");
            Vector<ImcStmt> result = new Vector<>();
            ImcExpr dest = imcMove.dst.accept(new ExprCanonizer(), result);
            MemTemp destTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(destTemp), dest));

            ImcExpr src = imcMove.src.accept(new ExprCanonizer(), result);
            MemTemp srcTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(srcTemp), src));
            result.add(new ImcMOVE(new ImcMEM(new ImcTEMP(destTemp)), new ImcTEMP(srcTemp)));
            return result;
        }

        if (imcMove.dst instanceof ImcTEMP) {
            System.out.println("b");
            Vector<ImcStmt> result = new Vector<>();
            MemTemp destTemp = ((ImcTEMP) imcMove.dst).temp;
            ImcExpr src = imcMove.src.accept(new ExprCanonizer(), result);
            MemTemp srcTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(srcTemp), src));
            result.add(new ImcMOVE(new ImcTEMP(destTemp), new ImcTEMP(srcTemp)));
            return result;
        }

        throw new Report.Error("Invalid destination of MOVE statement");*/

        if (imcMove.dst instanceof ImcMEM) {
            Vector<ImcStmt> result = new Vector<>();
            ImcExpr dstExpr = ((ImcMEM) (imcMove.dst)).addr.accept(new ExprCanonizer(), result);
            MemTemp dstTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(dstTemp), dstExpr));
            ImcExpr srcExpr = imcMove.src.accept(new ExprCanonizer(), result);
            MemTemp srcTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(srcTemp), srcExpr));
            result.add(new ImcMOVE(new ImcMEM(new ImcTEMP(dstTemp)), new ImcTEMP(srcTemp)));
            return result;
        }
        if (imcMove.dst instanceof ImcTEMP) {
            Vector<ImcStmt> result = new Vector<>();
            MemTemp dstTemp = ((ImcTEMP) (imcMove.dst)).temp;
            ImcExpr srcExpr = imcMove.src.accept(new ExprCanonizer(), result);
            MemTemp srcTemp = new MemTemp();
            result.add(new ImcMOVE(new ImcTEMP(srcTemp), srcExpr));
            result.add(new ImcMOVE(new ImcTEMP(dstTemp), new ImcTEMP(srcTemp)));
            return result;
        }
        throw new Report.InternalError();
    }

    public Vector<ImcStmt> visit(ImcSTMTS imcStmts, Object visArg) {
        Vector<ImcStmt> result = new Vector<>();
        for (ImcStmt stmt : imcStmts.stmts) {
            result.addAll(stmt.accept(this, null));
        }
        return result;
    }
}
