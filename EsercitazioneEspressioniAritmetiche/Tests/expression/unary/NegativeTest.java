package expression.unary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class NegativeTest {

	@Test
	public void testEval() {
		assertEquals(-10, new Negative(new Constant(10)).eval());
	}

}
