/**
* The Histogram program implements an application that
* reads a list of numbers from the command line and generates an histogram chart.
*
* @author  Despoina Sfetsori 
* @version 1.0
* @since   2020-03-26
*/
package gradeshistogram;

import java.io.File;
import java.util.Scanner;

public class Histogram {

	/**
	   * This is the main method which makes use of generateChart method.
	   * @param args Unused.
	   * @return Nothing.
	   * @exception java.lang.ArrayIndexOutOfBoundsException or java.lang.NullPointerException on input error.
	   */
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File(args[0]));

		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		int size = sc.nextInt();
        int[] data = new int[size];

       for(int i =0; i<size; i++)
       {
           data[i] = sc.nextInt();
       }
       HistogramGenerator.generateChart(data);

	}

}
