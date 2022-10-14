package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class DivisionTest {

	@Test
	public void testEval() {
		assertEquals(3, new Division(new Constant(10), new Constant(3)).eval());
	}
	
	@Test
	public void testEvalBadPath() {
		try {
			new Division(new Constant(10), new Constant(0)).eval();
			fail();
		}catch (ArithmeticException e) {}
	}

}
