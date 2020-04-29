package math;


import java.util.ArrayList;

import io.FileIO;


/**
* The ArrayOpearations provides the implementation of the search of primes in a file
*
* @author  Despoina Sfetsori
* @version 1.0
* @since   2020-04-23
*/

public class ArrayOperations {
	
	/**
	 * Reads a file that contains numbers line by line 
	 * and returns an array of the prime integers found in the file.
	 * @param fileIo is an object of the FileIO class
	 * @param filepath the file that contains the numbers
	 * @param myMath is an object of the MyMath class
	 * @return an array of numbers
	 */
	
	public int[] findPrimesInFile(FileIO fileIo, String filepath, MyMath myMath) {
		int[] array = fileIo.readFile(filepath);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			if (myMath.isPrime(array[i])) {
				list.add(array[i]);
			}
		}
		int[] primeArray = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			primeArray[i] = list.get(i);
		}
		return primeArray;
	}

}
