package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class MultiplicationTest {

	@Test
	public void testEval() {
		BinaryExpression mul = new Multiplication(new Constant(2), new Constant(5));
		
		assertEquals(10, mul.eval());
	}

}
