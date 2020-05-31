package codeanalyzer;

import java.io.IOException;

public class Strcomp extends AnalyzerType {

	public Strcomp(Calculate calType) {
		super(calType);
	}
	
	@Override 
	public int calculateMetrics(String filepath, SourceFileReader fileReader) throws IOException {
		return this.calType.calculateStrcomp(filepath, fileReader);
		
	}

}

