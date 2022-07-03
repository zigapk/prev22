package prev.phase.imclin;

import java.util.*;

import prev.data.mem.*;
import prev.data.imc.code.expr.*;
import prev.data.imc.code.stmt.*;
import prev.data.imc.visitor.*;

/**
 * Expression canonizer.
 */
public class ExprCanonizer implements ImcVisitor<ImcExpr, Vector<ImcStmt>> {
    public ImcExpr visit(ImcBINOP imcBinop, Vector<ImcStmt> stmts) {
        ImcExpr first = imcBinop.fstExpr.accept(this, stmts);
        MemTemp t1 = new MemTemp();
        stmts.add(new ImcMOVE(new ImcTEMP(t1), first));
        ImcExpr second = imcBinop.sndExpr.accept(this, stmts);
        MemTemp t2 = new MemTemp();
        stmts.add(new ImcMOVE(new ImcTEMP(t2), second));
        MemTemp result = new MemTemp();
        stmts.add(new ImcMOVE(new ImcTEMP(result), new ImcBINOP(imcBinop.oper, new ImcTEMP(t1), new ImcTEMP(t2))));
        return new ImcTEMP(result);
    }

    public ImcExpr visit(ImcCALL imcCall, Vector<ImcStmt> stmts) {
        Vector<ImcExpr> canonArgs = new Vector<ImcExpr>();
        for (ImcExpr arg : imcCall.args) {
            ImcExpr canonArg = arg.accept(this, stmts);
            MemTemp temp = new MemTemp();
            stmts.add(new ImcMOVE(new ImcTEMP(temp), canonArg));
            canonArgs.add(new ImcTEMP(temp));
        }
        MemTemp temp = new MemTemp();
        stmts.add(new ImcMOVE(new ImcTEMP(temp), new ImcCALL(imcCall.label, imcCall.offs, canonArgs)));
        return new ImcTEMP(temp);
    }

    public ImcExpr visit(ImcCONST imcConst, Vector<ImcStmt> stmts) {
        return new ImcCONST(imcConst.value);
    }

    public ImcExpr visit(ImcMEM imcMEM, Vector<ImcStmt> stmts) {
        ImcExpr addr = imcMEM.addr.accept(this, stmts);
        MemTemp addrT = new MemTemp();
        stmts.add(new ImcMOVE(new ImcTEMP(addrT), new ImcMEM(addr)));
        return new ImcTEMP(addrT);
    }

    public ImcExpr visit(ImcNAME imcName, Vector<ImcStmt> stmts) {
        return new ImcNAME(imcName.label);
    }

    public ImcExpr visit(ImcSEXPR imcSExpr, Vector<ImcStmt> stmts) {
        stmts.addAll(imcSExpr.stmt.accept(new StmtCanonizer(), null));
        return imcSExpr.expr.accept(this, stmts);
    }

    public ImcExpr visit(ImcTEMP imcTemp, Vector<ImcStmt> stmts) {
        return new ImcTEMP(imcTemp.temp);
    }

    public ImcExpr visit(ImcUNOP imcUnop, Vector<ImcStmt> stmts) {
        ImcExpr subExpr = imcUnop.subExpr.accept(this, stmts);
        return new ImcUNOP(imcUnop.oper, subExpr);
    }
}
