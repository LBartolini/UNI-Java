package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class FactorialTest {

	@Test
	public void testEval() {
		UnaryExpression factorial = new Factorial(new Constant(4));
		
		assertEquals(24, factorial.eval());
	}

}
