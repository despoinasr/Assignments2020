package math;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import math.ArithmeticOperations;

public class ArithmeticOperationsTest {
	
	ArithmeticOperations operations = new ArithmeticOperations();
	int max = Integer.MAX_VALUE;

	@Test(expected=ArithmeticException.class)
	public void test_getdivide_zero() {
		operations.divide(5,0);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test_getdivide_bothzero() {
		operations.divide(0,0);
	}
	
	@Test
	public void test_getdivide_zeronumerator() {
		operations.divide(0,3);
	}

	@Test
	public void test_getdivide_notzero() {
		Assert.assertEquals(5, operations.divide(10,2), 0);
	}
	
	@Test
	public void test_multiply_positive_int() {
		Assert.assertEquals(10, operations.multiply(2, 5), 0);
	}
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void  test_multiply_negative_int() {
		thrown.expect(IllegalArgumentException.class);
		operations.multiply(-2, 5);
	}
	
	@Test
	public void test_multiply_max_value() {
		thrown.expect(IllegalArgumentException.class);
		operations.multiply(max, 2);
	}
	
	@Test
	public void test_mulitply_zero_y() {
		Assert.assertEquals(0, operations.multiply(5,0), 0);
	}
}
