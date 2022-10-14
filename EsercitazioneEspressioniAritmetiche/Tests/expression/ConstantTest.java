package expression;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstantTest {

	@Test
	public void testEval() {
		assertEquals(10, new Constant(10).eval());
	}

}
