package codeanalyzer;

import java.io.IOException;
import java.util.List;

public class NullTypeReader implements SourceFileReader {
	
	public NullTypeReader() {
	}
	
	@Override
	public List<String> readFileIntoList(String filepath) throws IOException {
		return null;
	}
	
	@Override
	public String readFileIntoString(String filepath) throws IOException {
		return null;
	}

}
