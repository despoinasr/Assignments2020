package math;

import io.FileIO;

public class ArrayOperations {
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] array = fileIo.readFile(filepath);
		int x = 0;
		for (int i = 0; i < array.length; i++) {
			if (myMath.isPrime(array[i])) {
				x++;
			}
		}
		int[] primeArray = new int[x];
		x = 0;
		for (int i = 0; i < array.length; i++) {
			if (myMath.isPrime(array[i])) {
				primeArray[x] = array[i];
				x++;
			}
		}
		return primeArray;
	}

}
