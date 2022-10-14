package expression.binary;

import expression.Expression;

public class Sum extends BinaryExpression {
	
	public Sum(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}

	@Override
	public int eval() {
		return getExpression1().eval() + getExpression2().eval();
	}

}
