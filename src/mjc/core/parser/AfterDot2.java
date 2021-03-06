package mjc.core.parser;

import mjc.core.parser.interfaces.IAfterDot;
import mjc.core.parser.interfaces.IExpressionArgu;
import mjc.core.parser.interfaces.IIdentifier;

public class AfterDot2 implements IAfterDot {
	// AfterDot ::= Identifier "(" ExpressionArgu ")"
	IIdentifier identifier;
	IExpressionArgu expressionArgu;
	
	public AfterDot2(IIdentifier identifier, IExpressionArgu expressionArgu) {
		this.identifier = identifier;
		this.expressionArgu = expressionArgu;
	}

	@Override
	public String gtValue() {
		return (identifier!=null? identifier.getValue(): "identifier==null")+"("+
				(expressionArgu!=null? expressionArgu.getValue():"expressionArgu==null")+")";
	}
}
