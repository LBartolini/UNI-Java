package expression.unary;

import expression.Expression;

public abstract class UnaryExpression implements Expression {
	
	private Expression expression;
	
	public UnaryExpression(Expression expression) {
		this.expression = expression;
	}
	
	public Expression getExpression() {
		return expression;
	}

}
