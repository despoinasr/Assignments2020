package codeanalyzer;

import codeanalyzer.SourceFileReader;

public class SourceFileReaderFactory {
	
	public SourceFileReader createFileReader(String type) {
		SourceFileReader fileReader;
		if (type.equals("local")) {
			fileReader = new LocalTypeReader();
		} else if (type.equals("web")) {
			fileReader = new WebTypeReader();
		} else if (type.equals(null)) {
			fileReader = new NullTypeReader();
		} else {
			throw new IllegalArgumentException("Unknown type" +type);
		}
		
		return fileReader;
		
	}

}
