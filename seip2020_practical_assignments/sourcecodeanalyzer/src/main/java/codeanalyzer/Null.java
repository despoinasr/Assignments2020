package codeanalyzer;

import java.io.IOException;

public class Null extends AnalyzerType {
	
	public Null(Calculate calType) {
		super(calType);
	}
	
	@Override 
	public int calculateMetrics(String filepath, SourceFileReader fileReader) throws IOException {
		return this.calType.calculateNull(filepath, fileReader);
		
	}

}

