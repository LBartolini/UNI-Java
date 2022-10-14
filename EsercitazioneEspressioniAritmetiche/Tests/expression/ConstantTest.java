package expression;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstantTest {

	@Test
	public void testEval() {
		Expression constant = new Constant(10);
		
		assertEquals(10, constant.eval());
	}

}
