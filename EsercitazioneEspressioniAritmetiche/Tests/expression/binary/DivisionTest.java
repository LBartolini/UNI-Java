package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class DivisionTest {

	@Test
	public void testEval() {
		BinaryExpression division = new Division(new Constant(10), new Constant(3));
		
		assertEquals(3, division.eval());
	}
	
	@Test
	public void testEvalBadPath() {
		BinaryExpression division = new Division(new Constant(10), new Constant(0));
		
		try {
			division.eval();
			fail();
		}catch (ArithmeticException e) {}
	}

}
