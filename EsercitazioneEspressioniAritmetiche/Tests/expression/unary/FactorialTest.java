package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class FactorialTest {

	@Test
	public void testEval() {
		assertEquals(24, new Factorial(new Constant(4)).eval());
	}

}
