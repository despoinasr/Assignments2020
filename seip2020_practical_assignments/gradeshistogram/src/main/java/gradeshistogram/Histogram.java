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
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Histogram {

	/**
	   * This is the main method which makes use of generateChart method.
	   * @param args gives the file name.
	   * @return Nothing.
	   * @exception java.lang.NullPointerException on input error.
	   */
	public static void main(String[] args) {
		File file = new File(args[0]);   
		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		List<Integer> data = new ArrayList<Integer>();
		while (scanner.hasNext()) {
		    if (scanner.hasNextInt()) {
		        data.add(scanner.nextInt());
		    } 
		    else {
		        scanner.next();
		    }
		}
       HistogramGenerator.generateChart(data);

	}

}
