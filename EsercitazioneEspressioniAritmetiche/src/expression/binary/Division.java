package expression.binary;

import expression.Expression;

public class Division extends BinaryExpression {

	public Division(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int eval() {
		return getExpression1().eval() / getExpression2().eval();
	}

}
