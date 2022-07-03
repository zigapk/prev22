package prev.phase.memory;

import prev.data.ast.tree.decl.*;
import prev.data.ast.tree.expr.*;
import prev.data.ast.tree.type.*;
import prev.data.ast.visitor.*;
import prev.data.typ.*;
import prev.data.mem.*;
import prev.phase.seman.SemAn;

/**
 * Computing memory layout: frames and accesses.
 */
public class MemEvaluator extends AstFullVisitor<Object, MemEvaluator.Context> {

    /**
     * The context {@link MemEvaluator} uses while computing function frames and
     * variable accesses.
     */
    protected abstract class Context {
    }

    private class FunctionContext extends Context {
        public int depth = 0;
        public long locSize = 0;
        public long argSize = 0;
        public long parSize = new SemPtr(new SemVoid()).size();
    }

    private class RecordContext extends Context {
        public long compSize = 0;
    }

    @Override
    public Object visit(AstFunDecl funDecl, Context prevCtx) {
        FunctionContext ctx = new FunctionContext();
        if (prevCtx != null) {
            ctx.depth = ((FunctionContext) prevCtx).depth + 1;
//            System.out.println("depth: " + ctx.depth);
        }

        if (funDecl.pars != null) {
            funDecl.pars.accept(this, ctx);
        }

        if (funDecl.type != null) {
            funDecl.type.accept(this, ctx);
        }

        if (funDecl.expr != null) {
            funDecl.expr.accept(this, ctx);
        }

        MemFrame memFrame = new MemFrame(
                prevCtx == null ? new MemLabel(funDecl.name) : new MemLabel(), // decides which label to use
                ctx.depth,
                ctx.locSize,
                ctx.argSize
        );

        Memory.frames.put(funDecl, memFrame);

        return memFrame;
    }

    @Override
    public Object visit(AstCallExpr callExpr, Context prevCtx) {
        /*if (callExpr.args != null) {
            callExpr.args.accept(this, prevCtx);
        }

        long s = 8;
        assert callExpr.args != null;
        for (AstExpr e : callExpr.args) {
            s += SemAn.ofType.get(e).actualType().size();
        }

        FunctionContext ctx = (FunctionContext) prevCtx;
        ctx.argSize = Math.max(ctx.argSize, s);
        long returnSize = SemAn.ofType.get(callExpr).actualType().size();
        ctx.argSize = Math.max(ctx.argSize, returnSize);

        return null;*/

        if (callExpr.args != null) {
            callExpr.args.accept(this, prevCtx);
        }

        FunctionContext fCtx = (FunctionContext) prevCtx;

        long total = 0;
        for (AstExpr argument : callExpr.args) {
            SemType semType = SemAn.ofType.get(argument);
            total += semType.size();
        }

        total += new SemPtr(new SemVoid()).size();
        fCtx.argSize = Math.max(fCtx.argSize, total);
        return null;
    }

    @Override
    public Object visit(AstParDecl parDecl, Context prevContext) {
        if (parDecl.type != null) {
            parDecl.type.accept(this, prevContext);
        }

        FunctionContext ctx = (FunctionContext) prevContext;
        assert parDecl.type != null;
        long s = SemAn.isType.get(parDecl.type).actualType().size();
        Memory.accesses.put(parDecl,
                new MemRelAccess(
                        s,
                        ctx.parSize,
                        ctx.depth + 1)
        );

        ((FunctionContext) prevContext).parSize += s;
        return null;
    }

    @Override
    public Object visit(AstVarDecl varDecl, Context prevContext) {
        if (varDecl.type != null) {
            varDecl.type.accept(this, prevContext);
        }

        assert varDecl.type != null;
        long s = SemAn.isType.get(varDecl.type).actualType().size();

        MemAccess memAccess;

        if (prevContext == null) {
            memAccess = new MemAbsAccess(s, new MemLabel(varDecl.name));
        } else {
            FunctionContext ctx = (FunctionContext) prevContext;
            memAccess = new MemRelAccess(s, -s - ctx.locSize, ctx.depth + 1);
            ctx.locSize += s;
        }
        return Memory.accesses.put(varDecl, memAccess);
    }

    @Override
    public Object visit(AstPfxExpr pfxExpr, Context prevContext) {
        if (pfxExpr.oper == AstPfxExpr.Oper.DEL || pfxExpr.oper == AstPfxExpr.Oper.NEW) {
            FunctionContext ctx = (FunctionContext) prevContext;
            ctx.argSize = Math.max(ctx.argSize, 8);
        }
        return null;
    }

    @Override
    public Object visit(AstAtomExpr atomExpr, MemEvaluator.Context prevCtx) {
        if (atomExpr.type == AstAtomExpr.Type.STRING) {
//            String value = atomExpr.value.substring(1, atomExpr.value.length() - 1).replace("\\\"", "\"");
            String value = atomExpr.value.replace("\\\"", "\"");
            Memory.strings.put(
                    atomExpr,
                    new MemAbsAccess(
                            new SemChar().size() * (value.length() + 1),
                            new MemLabel(),
                            value
                    )
            );
        }
        return null;
    }

    @Override
    public SemType visit(AstAtomType atomType, MemEvaluator.Context prevCtx) {
        return SemAn.isType.get(atomType);
    }

    @Override
    public SemType visit(AstRecType recType, MemEvaluator.Context prevCtx) {
        RecordContext recCtx = new RecordContext();
        for (AstCompDecl comp : recType.comps) {
            comp.accept(this, recCtx);
        }
        return null;
    }

    @Override
    public SemType visit(AstNameType nameType, MemEvaluator.Context prevCtx) {
        return SemAn.isType.get(nameType);
    }

    @Override
    public Object visit(AstCompDecl compDecl, Context prevCtx) {
        if (compDecl.type != null) {
            compDecl.type.accept(this, prevCtx);
        }

        assert compDecl.type != null;
        long s = SemAn.isType.get(compDecl.type).actualType().size();
        RecordContext ctx = (RecordContext) prevCtx;
        MemRelAccess memAccess = new MemRelAccess(s, ctx.compSize, 0);
        ctx.compSize += s;

        return Memory.accesses.put(compDecl, memAccess);
    }
}
