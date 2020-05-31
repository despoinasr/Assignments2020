package codeanalyzer;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateLOC implements Calculate {
	
	public int calculateRegex(String filepath, SourceFileReader fileReader) throws IOException {
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile("((//.*)|(/\\*.*)|(\\*+.*))");
	    Matcher nonCodeLinesMatcher = pattern.matcher(sourceCode);

	    int nonCodeLinesCounter = 0;
	    while (nonCodeLinesMatcher.find()) {
	       nonCodeLinesCounter++;
	    }
			
	    int sourceFileLength = sourceCode.split("\n").length;
	    int loc =  sourceFileLength - nonCodeLinesCounter;
	        
        return loc;
	}
	
	public int calculateStrcomp(String filepath, SourceFileReader fileReader) throws IOException {
		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
		int nonCodeLinesCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim().trim(); //clear all leading and trailing white spaces
			if (line.startsWith("//") || line.startsWith("/*") || line.startsWith("*") || line.equals("{") || line.equals("}") || line.equals(""))
				nonCodeLinesCounter++;
		}
		int loc = sourceCodeList.size() - nonCodeLinesCounter;
		return loc;
	}
	
	public int calculateNull(String filepath, SourceFileReader fileReader) throws IOException {
		return -1;
	}
	

}
