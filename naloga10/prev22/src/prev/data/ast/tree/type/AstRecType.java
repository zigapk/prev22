package prev.data.ast.tree.type;

import prev.common.report.*;
import prev.data.ast.tree.*;
import prev.data.ast.tree.decl.*;
import prev.data.ast.visitor.*;

/**
 * Record type.
 */
public class AstRecType extends AstNode implements AstType {

	/** Components. */
	public final AstTrees<AstCompDecl> comps;

	/**
	 * Constructs a record type.
	 * 
	 * @param location The location.
	 * @param comps    The components.
	 */
	public AstRecType(Location location, AstTrees<AstCompDecl> comps) {
		super(location);
		this.comps = comps;
	}

	@Override
	public <Result, Arg> Result accept(AstVisitor<Result, Arg> visitor, Arg arg) {
		return visitor.visit(this, arg);
	}

}
