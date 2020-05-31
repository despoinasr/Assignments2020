package codeanalyzer;

import java.io.IOException;

public abstract class AnalyzerType {
	
	protected Calculate calType;
	
	public AnalyzerType(Calculate calType) {
		this.calType = calType;
	}

	public abstract int calculateMetrics(String filepath, SourceFileReader fileReader) throws IOException;
	
}
