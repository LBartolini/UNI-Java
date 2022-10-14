package expression.binary;

import static org.junit.Assert.*;

import org.junit.Test;

import expression.Constant;

public class SumTest {

	@Test
	public void testEvalBetweenConstants() {
		assertEquals(30, new Sum(new Constant(10), 
				new Constant(20)).eval());
	}
	
	@Test
	public void testEvalBetweenExpression() {
		assertEquals(40, new Sum(new Constant(10), 
				new Sum(new Constant(10), new Constant(20))).eval());
	}

}
