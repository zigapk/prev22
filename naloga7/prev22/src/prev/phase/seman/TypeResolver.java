package prev.phase.seman;

import java.util.*;

import prev.common.report.*;
import prev.data.ast.tree.*;
import prev.data.ast.tree.decl.*;
import prev.data.ast.tree.expr.*;
import prev.data.ast.tree.stmt.*;
import prev.data.ast.tree.type.*;
import prev.data.ast.visitor.*;
import prev.data.typ.*;

/**
 * Type resolver.
 * <p>
 * Type resolver computes the values of {@link SemAn#declaresType},
 * {@link SemAn#isType}, and {@link SemAn#ofType}.
 */
public class TypeResolver extends AstFullVisitor<SemType, TypeResolver.Mode> {

    public enum Mode {
        HEAD, BODY
    }

    private HashMap<SemRec, SymbTable> symTables = new HashMap<>();

    // GENERAL PURPOSE

    @Override
    public SemType visit(AstTrees<? extends AstTree> trees, Mode arg) {
        for (AstTree t : trees) {
            if (t instanceof AstTypeDecl d) {
                SemAn.declaresType.put(d, new SemName(d.name));
            }
        }

        for (AstTree t : trees) {
            if (t instanceof AstTypeDecl) {
                t.accept(this, arg);
            }
        }

        for (AstTree t : trees) {
            if (t instanceof AstVarDecl) {
                t.accept(this, arg);
            }
        }

        for (AstTree t : trees) {
            if (t instanceof AstFunDecl d) {
                for (AstParDecl par : d.pars) {
                    par.accept(this, arg);
                }

                d.type.accept(this, arg);
                SemType type = SemAn.isType.get(d.type).actualType();

                if (!(type instanceof SemVoid) && !(type instanceof SemBool) && !(type instanceof SemInt) && !(type instanceof SemChar) && !(type instanceof SemPtr)) {
                    throw new Report.Error(d, "Function return type is wrong.");
                }

                SemAn.isType.put(d.type, type);
            }
        }

        for (AstTree t : trees) {
            if (t instanceof AstFunDecl d) {
                if (d.expr != null) {
                    d.expr.accept(this, arg);
                    SemType typeExpression = SemAn.ofType.get(d.expr).actualType();
                    SemType typeType = SemAn.isType.get(d.type).actualType();

                    if (!typeExpression.getClass().equals(typeType.getClass())) {
                        throw new Report.Error(d, "Return type does not match the function type.");
                    }
                }
            }
        }
        return null;
    }

    // DECLARATIONS

    @Override
    public SemType visit(AstCompDecl compDecl, Mode arg) {
        compDecl.type.accept(this, arg);
        return null;
    }

    @Override
    public SemType visit(AstParDecl parDecl, Mode arg) {
        parDecl.type.accept(this, arg);

        SemType type = SemAn.isType.get(parDecl.type).actualType();
        if (!(type instanceof SemBool) && !(type instanceof SemInt) && !(type instanceof SemChar) && !(type instanceof SemPtr)) {
            throw new Report.Error(parDecl, "Invalid parameter type.");
        }

        SemAn.isType.put(parDecl.type, type);

        return null;
    }

    @Override
    public SemType visit(AstTypeDecl typeDecl, Mode arg) {
        typeDecl.type.accept(this, arg);

        SemName name = SemAn.declaresType.get(typeDecl);
        SemType type = SemAn.isType.get(typeDecl.type);
        name.define(type);
        return null;
    }

    @Override
    public SemType visit(AstVarDecl varDecl, Mode arg) {
        varDecl.type.accept(this, arg);

        SemType type = SemAn.isType.get(varDecl.type);

        if (type instanceof SemVoid) {
            throw new Report.Error(varDecl, "Unexpected variable type.");
        }

        SemName name = new SemName(varDecl.name);
        name.define(type);
        SemAn.isType.put(varDecl.type, type);

        return null;
    }

    // EXPRESSIONS

    @Override
    public SemType visit(AstArrExpr arrExpr, Mode arg) {
        if (arrExpr.arr != null) arrExpr.arr.accept(this, arg);
        if (arrExpr.idx != null) arrExpr.idx.accept(this, arg);

        assert arrExpr.idx != null;
        assert arrExpr.arr != null;

        if (!(SemAn.ofType.get(arrExpr.idx) instanceof SemInt)) {
            throw new Report.Error(arrExpr, "Array index should be an integer.");
        }

        SemType type = SemAn.ofType.get(arrExpr.arr).actualType();
        SemAn.ofType.put(arrExpr, ((SemArr) type).elemType.actualType());

        SemAn.isAddr.put(arrExpr, SemAn.isAddr.get(arrExpr.arr));
        return null;
    }

    @Override
    public SemType visit(AstAtomExpr atomExpr, Mode arg) {
        switch (atomExpr.type) {
            case INT -> SemAn.ofType.put(atomExpr, new SemInt());
            case CHAR -> SemAn.ofType.put(atomExpr, new SemChar());
            case BOOL -> SemAn.ofType.put(atomExpr, new SemBool());
            case VOID -> SemAn.ofType.put(atomExpr, new SemVoid());
            case POINTER -> {
                if (atomExpr.value.equals("nil")) SemAn.ofType.put(atomExpr, new SemPtr(new SemVoid()));
                else if (atomExpr.value.equals("none")) SemAn.ofType.put(atomExpr,new SemVoid());
                else SemAn.ofType.put(atomExpr, new SemPtr(null));
            }
            case STRING -> SemAn.ofType.put(atomExpr, new SemPtr(new SemChar()));
        }

        SemAn.isAddr.put(atomExpr, false);

        return null;
    }

    @Override
    public SemType visit(AstBinExpr binExpr, Mode arg) {
        if (binExpr.fstExpr != null) binExpr.fstExpr.accept(this, arg);
        if (binExpr.sndExpr != null) binExpr.sndExpr.accept(this, arg);

        assert binExpr.sndExpr != null;
        assert binExpr.fstExpr != null;

        switch (binExpr.oper) {
            case OR, AND -> {
                if (!(SemAn.ofType.get(binExpr.sndExpr).actualType() instanceof SemBool)) {
                    throw new Report.Error(binExpr, "Logical expression must be of type bool");
                }

                SemAn.ofType.put(binExpr, new SemBool());
            }
            case SUB, ADD, MOD, MUL, DIV -> {
                if (!(SemAn.ofType.get(binExpr.sndExpr).actualType() instanceof SemInt)) {
                    throw new Report.Error(binExpr, "This expression should be of type int.");
                }
                SemAn.ofType.put(binExpr, new SemInt());
            }
            case LEQ, LTH, GEQ, GTH, EQU, NEQ -> {
                if (SemAn.ofType.get(binExpr.fstExpr).actualType().getClass().equals(SemAn.ofType.get(binExpr.sndExpr).actualType().getClass())) {
                    SemType type = SemAn.ofType.get(binExpr.fstExpr).actualType();
                    boolean equality = binExpr.oper == AstBinExpr.Oper.EQU || binExpr.oper == AstBinExpr.Oper.NEQ;

                    // TODO: tale pogoj je mogoce narobe
                    if ((!(type instanceof SemBool) && !equality) && !(type instanceof SemChar) && !(type instanceof SemInt) && !(type instanceof SemPtr)) {
                        throw new Report.Error(binExpr, "Invalid type for a equality expression.");
                    }
                    SemAn.ofType.put(binExpr, new SemBool());
                } else {
                    throw new Report.Error(binExpr, "Left and right side of the equality expression should have matching types.");
                }
            }
        }

        SemAn.isAddr.put(binExpr, false);
        return null;
    }

    @Override
    public SemType visit(AstCallExpr callExpr, Mode arg) {
        AstFunDecl d = (AstFunDecl) SemAn.declaredAt.get(callExpr);

        if (callExpr.args.size() != d.pars.size()) {
            throw new Report.Error(callExpr, "Argument count does not match. " + d.pars.size() + " expected, " + callExpr.args.size() + " found.");
        }

        for (int i = 0; i < callExpr.args.size(); i++) {
            AstExpr callArg = callExpr.args.get(i);
            AstParDecl parameter = d.pars.get(i);

            callArg.accept(this, arg);

            if (!(SemAn.ofType.get(callArg).getClass().equals(SemAn.isType.get(parameter.type).getClass()))) {
                throw new Report.Error(callArg, "Argument type at index " + i + " does not match the expected type.");
            }
        }

        SemAn.ofType.put(callExpr, SemAn.isType.get(d.type).actualType());
        SemAn.isAddr.put(callExpr, false);

        return null;
    }

    @Override
    public SemType visit(AstCastExpr castExpr, Mode arg) {
        assert castExpr.expr != null;
        assert castExpr.type != null;

        castExpr.expr.accept(this, arg);
        castExpr.type.accept(this, arg);

        SemType expressionType = SemAn.ofType.get(castExpr.expr).actualType();
        SemType type = SemAn.isType.get(castExpr.type).actualType();

        if (!(expressionType instanceof SemInt) && !(expressionType instanceof SemChar) && !(expressionType instanceof SemPtr)) {
            throw new Report.Error(castExpr, "Expression to be cast must be of type int, char or pointer.");
        }

        if (!(type instanceof SemInt) && !(type instanceof SemChar) && !(type instanceof SemPtr)) {
            throw new Report.Error(castExpr, "Cast type must be one of int, char or pointer.");
        }

        SemAn.ofType.put(castExpr, SemAn.isType.get(castExpr.type).actualType());
        SemAn.isAddr.put(castExpr, SemAn.isAddr.get(castExpr.expr));

        return null;
    }

    @Override
    public SemType visit(AstNameExpr nameExpr, Mode arg) {
        AstDecl d = SemAn.declaredAt.get(nameExpr);

        if (d instanceof AstParDecl) {
            SemAn.ofType.put(nameExpr, SemAn.isType.get(((AstParDecl) d).type).actualType());
        } else if (d instanceof AstVarDecl) {
            SemAn.ofType.put(nameExpr, SemAn.isType.get(((AstVarDecl) d).type).actualType());
        } else {
            throw new Report.Error(nameExpr, "Name expression found is neither variable declaration nor parameter declaration.");
        }

        SemAn.isAddr.put(nameExpr, true);
        return null;
    }

    @Override
    public SemType visit(AstPfxExpr pfxExpr, Mode arg) {
        assert pfxExpr.expr != null;
        pfxExpr.expr.accept(this, arg);

        switch (pfxExpr.oper) {
            case ADD, SUB -> {
                SemType type = SemAn.ofType.get(pfxExpr.expr).actualType();
                if (!(type instanceof SemInt)) {
                    throw new Report.Error(pfxExpr, "Addition/subtraction can only be applied to integers.");
                }
                SemAn.ofType.put(pfxExpr, type);
            }
            case NOT -> {
                SemType type = SemAn.ofType.get(pfxExpr.expr).actualType();
                if (!(type instanceof SemBool)) {
                    throw new Report.Error(pfxExpr, "Negation can only be applied to integers.");
                }
                SemAn.ofType.put(pfxExpr, type);
            }
            case PTR -> SemAn.ofType.put(pfxExpr, SemAn.ofType.get(pfxExpr.expr).actualType());
            case NEW -> {
                SemType type = SemAn.ofType.get(pfxExpr.expr).actualType();
                if (!(type instanceof SemInt)) {
                    throw new Report.Error(pfxExpr, "New can only apply to integers.");
                }
                SemAn.ofType.put(pfxExpr, new SemPtr(new SemVoid()));
            }
            case DEL -> {
                SemType type = SemAn.ofType.get(pfxExpr.expr).actualType();
                if (!(type instanceof SemPtr)) {
                    throw new Report.Error(pfxExpr, "Del can only apply to pointers.");
                }
                SemAn.ofType.put(pfxExpr, new SemVoid());
            }
        }

        SemAn.isAddr.put(pfxExpr, false);
        return null;
    }

    @Override
    public SemType visit(AstRecExpr recExpr, Mode arg) {
        assert recExpr.rec != null;
        assert recExpr.comp != null;
        recExpr.rec.accept(this, arg);

        SemType type = SemAn.ofType.get(recExpr.rec);

        if (!(type instanceof SemRec)) {
            throw new Report.Error(recExpr, "Record expression should be of type rec.");
        }

        try {
            AstCompDecl compDecl = (AstCompDecl) symTables.get(type).fnd(recExpr.comp.name);
            SemAn.ofType.put(recExpr, SemAn.isType.get(compDecl.type).actualType());
            SemAn.declaredAt.put(recExpr.comp, compDecl);
            SemAn.isAddr.put(recExpr, SemAn.isAddr.get(recExpr.rec));
        } catch (SymbTable.CannotFndNameException __) {
            throw new Report.Error(recExpr, "Valid component could not be found.");
        }
        return null;
    }

    @Override
    public SemType visit(AstSfxExpr sfxExpr, Mode arg) {
        assert sfxExpr.expr != null;
        sfxExpr.expr.accept(this, arg);

        SemType type = SemAn.ofType.get(sfxExpr.expr);

        if (!(type instanceof SemPtr)) {
            throw new Report.Error(sfxExpr.expr, "Expected expression of type pointer.");
        }

        SemAn.ofType.put(sfxExpr, ((SemPtr) type).baseType.actualType());
        SemAn.isAddr.put(sfxExpr, true);

        return null;
    }

    @Override
    public SemType visit(AstStmtExpr stmtExpr, Mode arg) {
        AstStmt last = null;
        for (AstStmt stmt : stmtExpr.stmts) {
            stmt.accept(this, arg);
            last = stmt;
        }

        if (last == null) {
            throw new Report.Error(stmtExpr, "Statements should have a count greater that 0.");
        }

        SemAn.ofType.put(stmtExpr, SemAn.ofType.get(last));
        SemAn.isAddr.put(stmtExpr, false);
        return null;
    }

    @Override
    public SemType visit(AstWhereExpr whereExpr, Mode arg) {
        assert whereExpr.expr != null;
        assert whereExpr.decls != null;

        whereExpr.decls.accept(this, arg);
        whereExpr.expr.accept(this, arg);

        SemAn.ofType.put(whereExpr, SemAn.ofType.get(whereExpr.expr));
        SemAn.isAddr.put(whereExpr, false);

        return null;
    }

    // STATEMENTS

    @Override
    public SemType visit(AstAssignStmt assignStmt, Mode arg) {
        assert assignStmt.dst != null;
        assert assignStmt.src != null;
        assignStmt.dst.accept(this, arg);
        assignStmt.src.accept(this, arg);

        SemType dstType = SemAn.ofType.get(assignStmt.dst);
        SemType srcType = SemAn.ofType.get(assignStmt.src);

        if (!dstType.getClass().equals(srcType.getClass())) {
            throw new Report.Error(assignStmt, "Left and right sides of assignment must have matching types.");
        }

        if (!(srcType instanceof SemBool) && !(srcType instanceof SemChar) && !(srcType instanceof SemInt) && !(srcType instanceof SemPtr)) {
            throw new Report.Error(assignStmt, "Invalid assignment type.");
        }

        SemAn.ofType.put(assignStmt, new SemVoid());

        return null;
    }

    @Override
    public SemType visit(AstExprStmt exprStmt, Mode arg) {
        assert exprStmt.expr != null;
        exprStmt.expr.accept(this, arg);
        SemAn.ofType.put(exprStmt, SemAn.ofType.get(exprStmt.expr).actualType());
        return null;
    }

    @Override
    public SemType visit(AstIfStmt ifStmt, Mode arg) {
        assert ifStmt.cond != null;
        assert ifStmt.thenStmt != null;
        assert ifStmt.elseStmt != null;
        ifStmt.cond.accept(this, arg);
        ifStmt.thenStmt.accept(this, arg);
        ifStmt.elseStmt.accept(this, arg);

        if (!(SemAn.ofType.get(ifStmt.cond) instanceof SemBool)) {
            throw new Report.Error(ifStmt.cond, "Condition inside if statement should be of type bool.");
        }

        SemAn.ofType.put(ifStmt, new SemVoid());

        return null;
    }

    @Override
    public SemType visit(AstWhileStmt whileStmt, Mode arg) {
        assert whileStmt.cond != null;
        assert whileStmt.bodyStmt != null;
        whileStmt.cond.accept(this, arg);
        whileStmt.bodyStmt.accept(this, arg);

        if (!(SemAn.ofType.get(whileStmt.cond) instanceof SemBool)) {
            throw new Report.Error(whileStmt.cond, "Condition inside while statement should be of type bool.");
        }

        SemAn.ofType.put(whileStmt, new SemVoid());
        return null;
    }

    // TYPES

    @Override
    public SemType visit(AstArrType arrType, Mode arg) {
        if (arrType.elemType != null) arrType.elemType.accept(this, arg);
        if (arrType.numElems != null) arrType.numElems.accept(this, arg);

        // Sanity checks.
        assert arrType.elemType != null;
        assert arrType.numElems != null;

        if (!((SemAn.isType.get(arrType.elemType)) instanceof SemVoid)) {
            if (SemAn.ofType.get(arrType.numElems) instanceof SemInt) {
                long n = Integer.parseInt(((AstAtomExpr) arrType.numElems).value);

                if (n > 0 && n <= Math.pow(2, 63) - 1) {
                    SemType type = new SemArr(SemAn.isType.get(arrType.elemType), n);
                    SemAn.isType.put(arrType, type);
                } else {
                    throw new Report.Error(arrType,"Array index must be between 0 and 2^63 - 1.");
                }
            } else {
                throw new Report.Error(arrType,"Array index must be an integer.");
            }
        } else {
            throw new Report.Error(arrType.elemType, "Invalid array type.");
        }
        return null;
    }

    @Override
    public SemType visit(AstAtomType atomType, Mode arg) {
        switch (atomType.type) {
            case INT -> SemAn.isType.put(atomType, new SemInt());
            case CHAR -> SemAn.isType.put(atomType, new SemChar());
            case VOID -> SemAn.isType.put(atomType, new SemVoid());
            case BOOL -> SemAn.isType.put(atomType, new SemBool());
            default -> throw new Report.Error(atomType, "Unknown type.");
        }

        return null;
    }

    @Override
    public SemType visit(AstNameType nameType, Mode arg) {
        SemAn.isType.put(nameType, (SemAn.declaresType.get((AstTypeDecl) SemAn.declaredAt.get(nameType))));
        return null;
    }

    @Override
    public SemType visit(AstPtrType ptrType, Mode arg) {
        if (ptrType.baseType != null) {
            ptrType.baseType.accept(this, arg);

            SemAn.isType.put(ptrType, new SemPtr(SemAn.isType.get(ptrType.baseType)));
        }
        return null;
    }

    @Override
    public SemType visit(AstRecType recType, Mode arg) {
        Vector<SemType> compTypes = new Vector<SemType>();

        SymbTable rec = new SymbTable();

        for (AstCompDecl comp : recType.comps) {
            try {
                comp.accept(this, arg);
                SemType type = SemAn.isType.get(comp.type);

                if (type instanceof SemVoid) {
                    throw new Report.Error(comp, "Component can't be of type void.");
                } else {
                    rec.ins(comp.name, comp);
                    compTypes.add(type);
                }
            } catch (SymbTable.CannotInsNameException e) {
                throw new Report.Error(comp, "Can't redefine component.");
            }
        }

        SemRec semRec = new SemRec(compTypes);

        symTables.put(semRec, rec);
        SemAn.isType.put(recType, semRec);
        return null;
    }

}
