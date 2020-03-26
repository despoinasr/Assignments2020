/**
* The HistogramGenerator program implements an application that
* generates an histogram chart from a list of numbers.
*
* @author  Despoina Sfetsori 
* @version 1.0
* @since   2020-03-26
*/

package gradeshistogram;

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
	
	public static void generateChart(int[] dataValues) {
		XYSeriesCollection dataset = new XYSeriesCollection();
		XYSeries data = new XYSeries("random values");
		for (int i = 0; i < dataValues.length; i++) {
			data.add(i, dataValues[i]);
		}
		dataset.addSeries(data);

		boolean legend = false; 
		boolean tooltips = false; 
		boolean urls = false;
		JFreeChart chart = ChartFactory.createXYLineChart("Histogram", "frequency", "grades", dataset,
				PlotOrientation.VERTICAL, legend, tooltips, urls);
		ChartFrame frame = new ChartFrame("Histogram", chart);
		frame.pack();
		frame.setVisible(true);
	}

}
