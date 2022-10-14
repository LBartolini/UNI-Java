package expression.binary;

import expression.Expression;

public abstract class BinaryExpression implements Expression {
	
	private Expression expression1, expression2;

	public BinaryExpression(Expression expression1, Expression expression2) {
		this.expression1 = expression1;
		this.expression2 = expression2;
	}

	public Expression getExpression1() {
		return expression1;
	}

	public Expression getExpression2() {
		return expression2;
	}
	
}
