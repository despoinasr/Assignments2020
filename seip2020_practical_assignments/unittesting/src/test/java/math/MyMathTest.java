package math;

import org.junit.Test;

import math.MyMath;

public class MyMathTest {
	
	MyMath mm = new MyMath();

	@Test(expected=IllegalArgumentException.class)
	public void test_factorial_negative() {
		mm.factorial(-2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_factorial_postive_outOfRange() {
		mm.factorial(20);
	}
	
}
