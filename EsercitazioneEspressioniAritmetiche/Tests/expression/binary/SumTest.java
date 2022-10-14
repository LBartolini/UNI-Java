package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class SumTest {

	@Test
	public void testEvalBetweenConstants() {
		BinaryExpression sum = new Sum(new Constant(10), 
				new Constant(20));
		
		assertEquals(30, sum.eval());
	}
	
	@Test
	public void testEvalBetweenExpression() {
		BinaryExpression sum = new Sum(new Constant(10), 
				new Sum(new Constant(10), new Constant(20)));
		
		assertEquals(40, sum.eval());
	}

}
