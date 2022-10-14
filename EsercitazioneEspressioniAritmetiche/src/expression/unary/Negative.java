package expression.unary;

import expression.Expression;

public class Negative extends UnaryExpression {

	public Negative(Expression expression) {
		super(expression);
	}

	@Override
	public int eval() {
		// TODO Auto-generated method stub
		return -1*getExpression().eval();
	}

}
