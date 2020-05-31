package codeanalyzer;

import java.io.IOException;

public interface Calculate {
	
	public int calculateRegex(String filepath, SourceFileReader fileReader) throws IOException;
	
	public int calculateStrcomp(String filepath, SourceFileReader fileReader) throws IOException;
	
	public int calculateNull(String filepath, SourceFileReader fileReader) throws IOException;
}
