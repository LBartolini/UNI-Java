package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class NegativeTest {

	@Test
	public void testEval() {
		UnaryExpression negative = new Negative(new Constant(10));
		
		assertEquals(-10, negative.eval());
	}

}
