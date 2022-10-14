package expression.unary;

import expression.Expression;

public class Factorial extends UnaryExpression {

	public Factorial(Expression expression) {
		super(expression);
	}

	@Override
	public int eval() {
		return computeFactorial(getExpression().eval());
	}

	private int computeFactorial(int value) {
		if(value == 0) return 1;
		
		return value * computeFactorial(value-1);
	}

}
