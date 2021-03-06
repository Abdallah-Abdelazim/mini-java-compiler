package mjc.core.parser;

import mjc.core.parser.interfaces.IIdentifier;
import mjc.core.parser.interfaces.IMainClass;
import mjc.core.parser.interfaces.IStatement;

public class MainClass implements IMainClass {
	/*
	 	MainClass ::= �class� Identifier �{� �public� �static� �void� �main� �(� �String� �[� �]�
		Identifier �)� �{� Statement �}� �}�
	 * */
	
	IIdentifier identifierClassName;
	IIdentifier identifierMainArg;
	IStatement statement;	

	public MainClass(IIdentifier identifierClassName,
			IIdentifier identifierMainArg, IStatement statement) {
		this.identifierClassName = identifierClassName;
		this.identifierMainArg = identifierMainArg;
		this.statement = statement;
	}


	@Override
	public String getValue() {
		return "class "
				+ (identifierClassName!=null? identifierClassName.getValue(): "identifierClassName==null") 
				+ "{\npublic static void main(String [] " + (identifierMainArg!=null? identifierMainArg.getValue(): "identifierMainArg==null")
				+ ") {\n" + (statement!=null? statement.getValue(): "statement==null") + "}\n}";
	}

}
