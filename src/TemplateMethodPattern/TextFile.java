package TemplateMethodPattern;

public class TextFile extends DataProcessor{
	
	@Override
	protected void processData() {
		System.out.println("Process Text Data");
	}

	@Override
	protected void readData() {
		System.out.println("Read Text Data");

	}

} 
