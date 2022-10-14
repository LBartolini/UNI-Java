package expression.binary;

import expression.Expression;

public class Multiplication extends BinaryExpression {

	public Multiplication(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int eval() {
		return getExpression1().eval() * getExpression2().eval();
	}

}
