package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class SubtractionTest {

	@Test
	public void testEval() {
		assertEquals(5, new Subtraction(new Constant(10), new Constant(5)).eval());
	}

}
