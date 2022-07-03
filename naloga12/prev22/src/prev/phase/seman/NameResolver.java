package prev.phase.seman;

import prev.common.report.*;
import prev.data.ast.tree.*;
import prev.data.ast.tree.decl.*;
import prev.data.ast.tree.expr.*;
import prev.data.ast.tree.type.*;
import prev.data.ast.visitor.*;

/**
 * Name resolver.
 * <p>
 * Name resolver connects each node of a abstract syntax tree where a name is
 * used with the node where it is declared. The only exceptions are a record
 * field names which are connected with its declarations by type resolver. The
 * results of the name resolver are stored in
 * {@link prev.phase.seman.SemAn#declaredAt}.
 */
public class NameResolver extends AstFullVisitor<Object, NameResolver.Mode> {

    public enum Mode {
        HEAD, BODY
    }

    private final SymbTable symbTable = new SymbTable();

    // GENERAL PURPOSE

    @Override
    public Object visit(AstTrees<? extends AstTree> trees, Mode arg) {
        // First pass
        for (AstTree t : trees) {
            if (t instanceof AstDecl d) {
                d.accept(this, Mode.HEAD);
            } else {
                t.accept(this, null);
            }
        }

        // Second pass
        for (AstTree t : trees) {
            if (t instanceof AstDecl d) {
                d.accept(this, Mode.BODY);
            } else {
                t.accept(this, null);
            }
        }
        return null;
    }

    // DECLARATIONS

    @Override
    public Object visit(AstFunDecl funDecl, Mode arg) {
        switch (arg) {
            case HEAD -> {
                try {
                    symbTable.ins(funDecl.name, funDecl);
                } catch (SymbTable.CannotInsNameException e) {
                    throw new Report.Error(funDecl, "Can't redefine '" + funDecl.name + "'.");
                }
                for (AstTree t : funDecl.pars) {
					t.accept(this, Mode.BODY);
				}
                funDecl.type.accept(this, null);
			}
            case BODY -> {
				symbTable.newScope();
				for (AstTree t : funDecl.pars) {
					t.accept(this, Mode.HEAD);
				}
                if (funDecl.expr != null) {
                    funDecl.expr.accept(this, null);
                }
				symbTable.oldScope();
			}
        }
        return null;
    }

    @Override
    public Object visit(AstParDecl parDecl, Mode arg) {
        switch (arg) {
			case HEAD -> {
				try {
					symbTable.ins(parDecl.name, parDecl);
				} catch (SymbTable.CannotInsNameException e) {
					throw new Report.Error(parDecl, "Can't redefine '" + parDecl.name + "'.");
				}
			}
			case BODY -> {
				parDecl.type.accept(this, null);
			}
		}
        return null;
    }

    @Override
    public Object visit(AstTypeDecl typeDecl, Mode arg) {
        switch (arg) {
			case HEAD -> {
				try {
					symbTable.ins(typeDecl.name, typeDecl);
				} catch (SymbTable.CannotInsNameException e) {
					throw new Report.Error(typeDecl, "Can't redefine '" + typeDecl.name + "'.");
				}
			}
			case BODY -> {
				typeDecl.type.accept(this, null);
			}
		}
        return null;
    }

    @Override
    public Object visit(AstVarDecl varDecl, Mode arg) {
        switch (arg) {
			case HEAD -> {
				try {
					symbTable.ins(varDecl.name, varDecl);
				} catch (SymbTable.CannotInsNameException e) {
					throw new Report.Error(varDecl, "Can't redefine '" + varDecl.name + "'.");
				}
			}
			case BODY -> {
				varDecl.type.accept(this, null);
			}
		}
        return null;
    }

    // EXPRESSIONS

    @Override
    public Object visit(AstCallExpr callExpr, Mode arg) {
        try {
            AstDecl d = symbTable.fnd(callExpr.name);
            if (!(d instanceof AstFunDecl))
                throw new Report.Error(callExpr, "'" + callExpr.name + "' is not a function.");
            SemAn.declaredAt.put(callExpr, d);
        } catch (SymbTable.CannotFndNameException e) {
            throw new Report.Error(callExpr, "Unknown function '" + callExpr.name + "'.");
        }
        if (callExpr.args != null) {
            callExpr.args.accept(this, arg);
        }
        return null;
    }

    @Override
    public Object visit(AstNameExpr nameExpr, Mode arg) {
        try {
            AstDecl d = symbTable.fnd(nameExpr.name);
            if (!(d instanceof AstMemDecl))
                throw new Report.Error(nameExpr, "'" + nameExpr.name + "' is not a variable.");
            SemAn.declaredAt.put(nameExpr, d);
        } catch (SymbTable.CannotFndNameException e) {
            throw new Report.Error(nameExpr, "Unknown variable '" + nameExpr.name + "'.");
        }
        return null;
    }

    @Override
    public Object visit(AstWhereExpr whereExpr, Mode arg) {
        symbTable.newScope();
        whereExpr.decls.accept(this, arg);
        whereExpr.expr.accept(this, arg);
        symbTable.oldScope();

        return null;
    }

    @Override
    public Object visit(AstRecExpr recExpr, Mode mode) {
        recExpr.rec.accept(this, mode);
        return null;
    }

    // STATEMENTS

    @Override
    public Object visit(AstNameType nameType, Mode arg) {
        try {
            AstDecl d = symbTable.fnd(nameType.name);
            if (!(d instanceof AstTypeDecl))
                throw new Report.Error(nameType, "'" + nameType.name + "' is not a type.");
            SemAn.declaredAt.put(nameType, d);
        } catch (SymbTable.CannotFndNameException e) {
            throw new Report.Error(nameType, "Unknown type '" + nameType.name + "'.");
        }
        return null;
    }

}
