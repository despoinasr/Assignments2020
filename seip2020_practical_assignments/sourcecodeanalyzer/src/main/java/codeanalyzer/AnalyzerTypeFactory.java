package codeanalyzer;

public class AnalyzerTypeFactory {
	
	public AnalyzerType createAnalyzerType(String type, Calculate caltype) {
		AnalyzerType analyzer;
		if (type.equals("regex")) {
			analyzer = new Regex(caltype);
		} else if (type.equals("strcomp")) {
			analyzer = new Strcomp(caltype);
		} else {
			analyzer = new Null(caltype);
		}
		
		return analyzer;
	}

}
