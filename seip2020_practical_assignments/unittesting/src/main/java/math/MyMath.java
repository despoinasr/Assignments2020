package math;

public class MyMath {
	
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

}
