package prev.phase.imcgen;

import java.util.*;

import prev.data.ast.tree.*;
import prev.data.ast.tree.decl.*;
import prev.data.ast.tree.expr.*;
import prev.data.ast.tree.stmt.*;
import prev.data.ast.visitor.*;
import prev.data.imc.code.expr.*;
import prev.data.imc.code.stmt.*;
import prev.data.mem.*;
import prev.data.typ.SemChar;
import prev.data.typ.SemType;
import prev.phase.memory.*;
import prev.phase.seman.SemAn;

public class CodeGenerator extends AstNullVisitor<Object, Stack<MemFrame>> {
    @Override
    public Object visit(AstTrees<?> trees, Stack<MemFrame> frames) {
        if (frames == null) {
            frames = new Stack<>();
        }
        for (AstTree tree : trees) {
            if (tree instanceof AstFunDecl) {
                tree.accept(this, frames);
            }
        }
        return null;
    }

    // EXPRESSIONS
    @Override
    public Object visit(AstFunDecl funDecl, Stack<MemFrame> memFrames) {
        memFrames.push(Memory.frames.get(funDecl));
        if (funDecl.expr != null) {
            funDecl.expr.accept(this, memFrames);
        }
        memFrames.pop();
        return null;
    }

    // 1, 2, 3
    @Override
    public ImcExpr visit(AstAtomExpr atomExpr, Stack<MemFrame> memFrames) {
        long res = 0;
        switch (atomExpr.type) {
            case BOOL -> res = atomExpr.value.equalsIgnoreCase("true") ? 1 : 0;
            case INT -> res = Long.parseLong(atomExpr.value);
            case VOID, POINTER -> {
                if (atomExpr.value.equals("nil")) res = 0;
            }
            case CHAR -> res = atomExpr.value.charAt(1);
            case STRING -> {
                MemAbsAccess m = Memory.strings.get(atomExpr);
                ImcGen.exprImc.put(atomExpr, new ImcNAME(m.label));
            }
        }
        ImcGen.exprImc.put(atomExpr, new ImcCONST(res));
        return null;
    }

    // 4
    @Override
    public ImcExpr visit(AstPfxExpr pfxExpr, Stack<MemFrame> memFrames) {
        pfxExpr.expr.accept(this, memFrames);

        ImcExpr e = ImcGen.exprImc.get(pfxExpr.expr);
        Vector<Long> offsets = new Vector<>();
        Vector<ImcExpr> args = new Vector<>();

        ImcUNOP.Oper o;
        switch (pfxExpr.oper) {
            case NOT -> o = ImcUNOP.Oper.NOT;
            case SUB -> o = ImcUNOP.Oper.NEG;
            case ADD -> {
                ImcGen.exprImc.put(pfxExpr, e);
                return null;
            }
            case PTR -> {
                if (e instanceof ImcMEM) ImcGen.exprImc.put(pfxExpr, ((ImcMEM) e).addr);
                return null;
            }
            case NEW -> {
                MemLabel l = new MemLabel("new");
//                offsets.add(0L);
//                args.add(new ImcCONST(0));

                ImcExpr ie = ImcGen.exprImc.get(pfxExpr.expr);
//                offsets.add(8L);
                offsets.add(0L);
                args.add(ie);

                ImcGen.exprImc.put(pfxExpr, new ImcCALL(l, offsets, args));
                return null;
            }
            case DEL -> {
                MemLabel l = new MemLabel("del");
//                offsets.add(0L);
//                args.add(new ImcCONST(0));

                ImcExpr ie = ImcGen.exprImc.get(pfxExpr.expr);
//                offsets.add(8L);
                offsets.add(0L);
                args.add(ie);

                ImcGen.exprImc.put(pfxExpr, new ImcCALL(l, offsets, args));
                return null;
            }
            default -> {
                return null;
            }
        }

        ImcGen.exprImc.put(pfxExpr, new ImcUNOP(o, e));
        return null;
    }

    // 5
    @Override
    public ImcExpr visit(AstBinExpr binExpr, Stack<MemFrame> memFrames) {
        binExpr.fstExpr.accept(this, memFrames);
        binExpr.sndExpr.accept(this, memFrames);
        ImcBINOP.Oper o;

        switch (binExpr.oper) {
            case OR -> o = ImcBINOP.Oper.OR;
            case AND -> o = ImcBINOP.Oper.AND;
            case EQU -> o = ImcBINOP.Oper.EQU;
            case NEQ -> o = ImcBINOP.Oper.NEQ;
            case LTH -> o = ImcBINOP.Oper.LTH;
            case GTH -> o = ImcBINOP.Oper.GTH;
            case LEQ -> o = ImcBINOP.Oper.LEQ;
            case GEQ -> o = ImcBINOP.Oper.GEQ;
            case ADD -> o = ImcBINOP.Oper.ADD;
            case SUB -> o = ImcBINOP.Oper.SUB;
            case MUL -> o = ImcBINOP.Oper.MUL;
            case DIV -> o = ImcBINOP.Oper.DIV;
            case MOD -> o = ImcBINOP.Oper.MOD;
            default -> {
                return null;
            }
        }

        ImcGen.exprImc.put(binExpr, new ImcBINOP(o, ImcGen.exprImc.get(binExpr.fstExpr), ImcGen.exprImc.get(binExpr.sndExpr)));
        return null;
    }

    // 6
    @Override
    public ImcExpr visit(AstSfxExpr sfxExpr, Stack<MemFrame> memFrames) {
        sfxExpr.expr.accept(this, memFrames);
        ImcExpr e = ImcGen.exprImc.get(sfxExpr.expr);
        ImcGen.exprImc.put(sfxExpr, new ImcMEM(e));
        return null;
    }

    // 9
    @Override
    public ImcExpr visit(AstNameExpr nameExpr, Stack<MemFrame> memFrames) {
        AstDecl a = SemAn.declaredAt.get(nameExpr);
        MemAccess m = null;

        if (a instanceof AstVarDecl || a instanceof AstParDecl) {
            m = Memory.accesses.get((AstMemDecl) a);
        }

        ImcExpr ie = null;
        if (m instanceof MemAbsAccess) {
            ImcNAME in = new ImcNAME(((MemAbsAccess) m).label);
            ie = new ImcMEM(in);
        }

        if (m instanceof MemRelAccess) {
            ImcExpr name = new ImcTEMP(memFrames.peek().FP);
            for (int i = 0; i < (memFrames.size() - ((MemRelAccess) m).depth - 1); ++i) {
                name = new ImcMEM(name);
            }

            ImcBINOP binop = new ImcBINOP(ImcBINOP.Oper.ADD, name, new ImcCONST(((MemRelAccess) m).offset));
            ie = new ImcMEM(binop);
        }

        ImcGen.exprImc.put(nameExpr, ie);
        return null;
    }

    @Override
    public ImcExpr visit(AstVarDecl varDecl, Stack<MemFrame> memFrames) {
        return null;
    }

    @Override
    public ImcExpr visit(AstParDecl parDecl, Stack<MemFrame> memFrames) {
        return null;
    }

    // 10
    @Override
    public ImcExpr visit(AstArrExpr arrExpr, Stack<MemFrame> memFrames) {
        arrExpr.arr.accept(this, memFrames);
        arrExpr.idx.accept(this, memFrames);

        ImcExpr e = ImcGen.exprImc.get(arrExpr.idx);
        ImcExpr arr = ImcGen.exprImc.get(arrExpr.arr);
        SemType t = SemAn.ofType.get(arrExpr);
        ImcBINOP idx = new ImcBINOP(ImcBINOP.Oper.MUL, e, new ImcCONST(t.size()));

        if (arr instanceof ImcMEM) {
            ImcBINOP binop = new ImcBINOP(ImcBINOP.Oper.ADD, ((ImcMEM) arr).addr, idx);
            ImcGen.exprImc.put(arrExpr, new ImcMEM((binop)));
        }
        return null;
    }

    // 11
    @Override
    public ImcExpr visit(AstRecExpr recExpr, Stack<MemFrame> memFrames) {
        recExpr.rec.accept(this, memFrames);
        recExpr.comp.accept(this, memFrames);

        ImcExpr e = ImcGen.exprImc.get(recExpr.rec);
        if (e instanceof ImcMEM) {
            AstDecl astDecl = SemAn.declaredAt.get(recExpr.comp);
            MemAccess m = Memory.accesses.get((AstMemDecl) astDecl);
            if (m instanceof MemRelAccess) {
                ImcBINOP o = new ImcBINOP(ImcBINOP.Oper.ADD, ((ImcMEM) e).addr, new ImcCONST(((MemRelAccess) m).offset));
                ImcGen.exprImc.put(recExpr, new ImcMEM(o));
            }
        }
        return null;
    }

    // 12
    @Override
    public ImcExpr visit(AstCallExpr callExpr, Stack<MemFrame> memFrames) {
        AstDecl astDecl = SemAn.declaredAt.get(callExpr);

        if (astDecl instanceof AstFunDecl) {
            MemFrame memFrame = Memory.frames.get((AstFunDecl) astDecl);

            Vector<Long> offsets = new Vector<>();
            offsets.add(0L);
            Vector<ImcExpr> args = new Vector<>();

            if (memFrame == memFrames.peek()) {
                args.add(new ImcMEM(new ImcTEMP(memFrames.peek().FP)));
            } else if (memFrame.depth == 0) {
                args.add(new ImcCONST(0L));
            } else {
                args.add(new ImcTEMP(memFrames.peek().FP));
            }

            for (AstExpr arg : callExpr.args) {
                arg.accept(this, memFrames);

                SemType t = SemAn.ofType.get(arg);
                offsets.add(t.size() + offsets.lastElement());
                args.add(ImcGen.exprImc.get(arg));
            }

            ImcGen.exprImc.put(callExpr, new ImcCALL(memFrame.label, offsets, args));
        }
        return null;
    }

    // 13
    @Override
    public ImcExpr visit(AstStmtExpr stmtExpr, Stack<MemFrame> memFrames) {
        Vector<ImcStmt> stmts = new Vector<>();

        for (int i = 0; i < stmtExpr.stmts.size(); i++) {
            stmtExpr.stmts.get(i).accept(this, memFrames);
            stmts.add(ImcGen.stmtImc.get(stmtExpr.stmts.get(i)));
        }

        AstStmt astStmt = stmtExpr.stmts.get(stmtExpr.stmts.size() - 1);

        if (astStmt instanceof AstExprStmt) {
            ImcSEXPR expr = new ImcSEXPR(new ImcSTMTS(stmts), ImcGen.exprImc.get(((AstExprStmt) astStmt).expr));
            ImcGen.exprImc.put(stmtExpr, expr);
        } else {
            stmts.add(ImcGen.stmtImc.get(stmtExpr.stmts.get(stmtExpr.stmts.size() - 1)));
            ImcSEXPR expr = new ImcSEXPR(new ImcSTMTS(stmts), new ImcCONST(0L));
            ImcGen.exprImc.put(stmtExpr, expr);
        }
        return null;
    }

    // 15, 16
    @Override
    public ImcExpr visit(AstCastExpr castExpr, Stack<MemFrame> memFrames) {
        castExpr.type.accept(this, memFrames);
        castExpr.expr.accept(this, memFrames);

        SemType t = SemAn.isType.get(castExpr.type);
        ImcExpr e = ImcGen.exprImc.get(castExpr.expr);

        if (t.actualType() instanceof SemChar) {
            ImcBINOP binop = new ImcBINOP(ImcBINOP.Oper.MOD, e, new ImcCONST(256));
            ImcGen.exprImc.put(castExpr, binop);
        } else {
            ImcGen.exprImc.put(castExpr, e);
        }
        return null;
    }

    // 17
    @Override
    public ImcExpr visit(AstWhereExpr whereExpr, Stack<MemFrame> memFrames) {
        whereExpr.decls.accept(this, memFrames);
        whereExpr.expr.accept(this, memFrames);

        ImcExpr e = ImcGen.exprImc.get(whereExpr.expr);
        ImcGen.exprImc.put(whereExpr, e);
        return null;
    }

    // 1
    @Override
    public ImcStmt visit(AstExprStmt exprStmt, Stack<MemFrame> memFrames) {
        exprStmt.expr.accept(this, memFrames);
        ImcGen.stmtImc.put(exprStmt, new ImcESTMT(ImcGen.exprImc.get(exprStmt.expr)));
        return null;
    }

    // 2
    @Override
    public ImcStmt visit(AstAssignStmt assignStmt, Stack<MemFrame> memFrames) {
        assignStmt.dst.accept(this, memFrames);
        assignStmt.src.accept(this, memFrames);

        ImcExpr d = ImcGen.exprImc.get(assignStmt.dst);
        ImcExpr s = ImcGen.exprImc.get(assignStmt.src);
        ImcGen.stmtImc.put(assignStmt, new ImcMOVE(d, s));
        return null;
    }

    // 3, 4
    @Override
    public ImcStmt visit(AstIfStmt ifStmt, Stack<MemFrame> memFrames) {
        ifStmt.cond.accept(this, memFrames);
        ifStmt.thenStmt.accept(this, memFrames);
        ifStmt.elseStmt.accept(this, memFrames);


        Vector<ImcStmt> stmts = new Vector<>();

        MemLabel lTrue = new MemLabel();
        MemLabel lFalse = new MemLabel();
        MemLabel lEnd = new MemLabel();

        stmts.add(new ImcCJUMP(ImcGen.exprImc.get(ifStmt.cond), lTrue, lFalse));
        stmts.add(new ImcLABEL(lTrue));
        stmts.add(ImcGen.stmtImc.get(ifStmt.thenStmt));
        stmts.add(new ImcJUMP(lEnd));
        stmts.add(new ImcLABEL(lFalse));
        stmts.add(ImcGen.stmtImc.get(ifStmt.elseStmt));
        stmts.add(new ImcLABEL(lEnd));

        ImcGen.stmtImc.put(ifStmt, new ImcSTMTS(stmts));
        return null;
    }

    // 5, 6
    @Override
    public ImcStmt visit(AstWhileStmt whileStmt, Stack<MemFrame> memFrames) {
        whileStmt.cond.accept(this, memFrames);
        whileStmt.bodyStmt.accept(this, memFrames);

        Vector<ImcStmt> stmts = new Vector<>();

        MemLabel lStart = new MemLabel();
        MemLabel lLoop = new MemLabel();
        MemLabel lEnd = new MemLabel();

        stmts.add(new ImcLABEL(lStart));
        stmts.add(new ImcCJUMP(ImcGen.exprImc.get(whileStmt.cond), lLoop, lEnd));
        stmts.add(new ImcLABEL(lLoop));
        stmts.add(ImcGen.stmtImc.get(whileStmt.bodyStmt));
        stmts.add(new ImcJUMP(lStart));
        stmts.add(new ImcLABEL(lEnd));

        ImcGen.stmtImc.put(whileStmt, new ImcSTMTS(stmts));
        return null;
    }
}
