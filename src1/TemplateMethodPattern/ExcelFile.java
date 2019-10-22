package TemplateMethodPattern;

public class ExcelFile extends DataProcessor{

	@Override
	protected void processData() {
		System.out.println("Process Excel Data");
	}

	@Override
	protected void readData() {
		System.out.println("Read Excel Data");

	}

}
