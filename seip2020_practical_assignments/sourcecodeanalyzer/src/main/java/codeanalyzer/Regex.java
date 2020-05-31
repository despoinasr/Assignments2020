package codeanalyzer;

import java.io.IOException;

public class Regex extends AnalyzerType{
	
	public Regex(Calculate calType) {
		super(calType);
	}
	
	@Override 
	public int calculateMetrics(String filepath, SourceFileReader fileReader) throws IOException {
		return this.calType.calculateRegex(filepath, fileReader);
		
	}

}
