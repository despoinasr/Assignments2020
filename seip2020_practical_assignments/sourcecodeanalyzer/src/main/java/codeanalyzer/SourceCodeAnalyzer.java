package codeanalyzer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Analyzes the contents of a Java source code file 
 * and calculates the following metrics: loc = lines of code,
 * nom = number of methods, and noc=number of classes. 
 * The current functionality supports two types of source code analysis,
 * namely regex (with the use of regular expressions) and 
 * strcomp (with the use of string comparison).
 * This class deliberately contains code smells and violations of design principles. 
 * @author agkortzis
 *
 */
public class SourceCodeAnalyzer {
	
	private SourceFileReaderFactory frFactory;
	private SourceFileReader fileReader;
	private AnalyzerTypeFactory atFactory;
	
	public SourceCodeAnalyzer(String fileReaderType) {
		this.fileReader = frFactory.createFileReader(fileReaderType);
	}
	
	public Map<String, Integer> metrics(String type, String filepath) throws IOException {
		Map<String, Integer> metrics = new HashMap<>();
		Calculate loc = new CalculateLOC();
		Calculate noc = new CalculateNOC();
		Calculate nom = new CalculateNOM();
		
		AnalyzerType loctype = atFactory.createAnalyzerType(type, loc);
		AnalyzerType noctype = atFactory.createAnalyzerType(type, noc);
		AnalyzerType nomtype = atFactory.createAnalyzerType(type, nom);
		
		int locnum = loctype.calculateMetrics(filepath, fileReader);
		int nocnum = noctype.calculateMetrics(filepath, fileReader);
		int nomnum = nomtype.calculateMetrics(filepath, fileReader);
		
		metrics.put("loc", locnum);
		metrics.put("noc", nocnum);
		metrics.put("nom", nomnum);
		
		return metrics;
		
	}
		
	
}
