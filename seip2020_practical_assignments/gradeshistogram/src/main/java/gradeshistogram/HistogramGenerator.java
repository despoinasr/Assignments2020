/**
* The HistogramGenerator program implements an application that
* generates an histogram chart from a list of numbers.
*
* @author  Despoina Sfetsori 
* @version 1.0
* @since   2020-03-26
*/

package gradeshistogram;

import java.util.ArrayList;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class HistogramGenerator {

	/**
	   * This method is used to generate a chart. 
	   * @param dataValues This is the list with the data used to generate the chart.
	   * @return Nothing.
	   */
	
	public static void generateChart(List<Integer> dataValues) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries frequencies = new XYSeries("random values");
		
		ArrayList<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < dataValues.size(); i++) {
			if (!data.contains(dataValues.get(i))) {
				data.add(dataValues.get(i));				
			}
		}
		
		
		for (int i = 0; i < data.size(); i++) {
			frequencies.add((double) data.get(i), (double) calculateFrequency(data.get(i), dataValues));
		}
		dataset.addSeries(frequencies);


		boolean legend = false; 
		boolean tooltips = false; 
		boolean urls = false;
		JFreeChart chart = ChartFactory.createXYLineChart("Histogram", "grades", "frequency", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);
		ChartFrame frame = new ChartFrame("Histogram", chart);
		frame.pack();
		frame.setVisible(true);
	}
	/**
	   * This method is used to calculate the frequency of each grade.
	   * @param a This the grade.
	   * @param dataValues This is the list with the data used to generate the chart.
	   * @return counter This is the frequency.
	   */
	
	public static int calculateFrequency(Integer a, List<Integer> dataValues) {
		int counter = 0;
		for (int i=0; i<dataValues.size(); i++) {
			if (dataValues.get(i)==a) {
				counter++;
			}
		}
		return counter;
	}
				
}
