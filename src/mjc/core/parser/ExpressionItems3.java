package mjc.core.parser;

import mjc.core.parser.interfaces.IExpression;
import mjc.core.parser.interfaces.IExpressionItems;

public class ExpressionItems3 implements IExpressionItems {
	// ExpressionItems::= "==" Expression
	IExpression expression;

	public ExpressionItems3(IExpression expression) {
		super();
		this.expression = expression;
	}

	@Override
	public String getValue() {
		return " == " + (expression!=null? expression.getValue(): "expression==null");
	}
}
