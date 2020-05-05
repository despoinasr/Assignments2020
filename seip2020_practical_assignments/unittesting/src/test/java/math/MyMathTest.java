package math;

import org.junit.Assert;
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
	
	@Test
	public void test_isPrime_prime() {
		Assert.assertEquals(true,mm.isPrime(7));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void test_isPrime_invalid() {
		mm.isPrime(1);
	}
	
	@Test
	public void test_isPrime_notprime() {
		Assert.assertEquals(false,mm.isPrime(4));
	}
	
}
