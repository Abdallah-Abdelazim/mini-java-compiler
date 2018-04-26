package mjc.core.parser;

import mjc.core.parser.interfaces.IExpression;

public class Expression4 implements IExpression {
	// Expression ::= "false" Expression
	IExpression expression;

	public Expression4(IExpression expression) {
		this.expression = expression;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "false" + expression.getValue();
	}
}