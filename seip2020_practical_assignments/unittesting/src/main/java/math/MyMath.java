package math;

/**
* The MyMath provides the calculation of the factorial of an integer and the checks if
* a number is prime
*
* @author  Despoina Sfetsori
* @version 1.0
* @since   2020-04-23
*/

public class MyMath {
	
	/**
	 * Reads an integer and returns its factorial
	 * @param n an integer
	 * @return the factorial
	 * @exception IllegalArgumentException when the given file integer does not belong
	 * in the interval (0,12)
	 */
	
	public int factorial (int n) {
		int f = n;
		if (n >= 0 && n <= 12) {
			if ( n == 0) {
				return 1;
			} else {
				f = f * factorial(n-1);
				return f;
				}
			} else {
				throw new IllegalArgumentException("n should be 0 > n > 12");
		}
	}
	
	/**
	 * Reads an integer and returns true if the number is prime, false otherwise
	 * @param n an integer
	 * @return true of the number is prime, or false
	 * @exception IllegalArgumentException when the given file integer is less than 2
	 */
	
	public  boolean isPrime(int n) {
		if (n >= 2) {
			double div = n / 2;
			 for (int i=2; i<=div; i++) {  
				 if (n % i == 0) {   
					 return false;
				 }
			 }
		} else {
			throw new IllegalArgumentException("n should be n >= 2");
		}
		return true;
	}
	
}
