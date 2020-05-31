package codeanalyzer;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateNOC implements Calculate {
	
	public int calculateRegex(String filepath, SourceFileReader fileReader) throws IOException {
		String sourceCode = fileReader.readFileIntoString(filepath);
		Pattern pattern = Pattern.compile(".*\\s*class\\s+.*"); 
        Matcher classSignatures = pattern.matcher(sourceCode);

        int classCounter = 0;
        while (classSignatures.find()) {
        	classCounter++;
        }
		return classCounter;
	}
	
	public int calculateStrcomp(String filepath, SourceFileReader fileReader) throws IOException {
		List<String> sourceCodeList = fileReader.readFileIntoList(filepath);
		int classCounter = 0;
		for (String line : sourceCodeList) {
			line = line.trim(); //remove leading and trailing white spaces
			if ((line.startsWith("class ") || line.contains(" class ")) && line.contains("{")) {
				classCounter++;
			}
		}
		return classCounter; 
	}
	
	public int calculateNull(String filepath, SourceFileReader fileReader) throws IOException {
		return -1;
	}

}
