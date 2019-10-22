package TemplateMethodPattern;


/*
 * Subclasses decide how to implement steps in an algorithm
 * Here algorithm is we should follow the order of methods like first read, process and save
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("---- Read Excel File ----");
		DataProcessor obj = new ExcelFile();
		obj.parseSaveData();
		
		System.out.println("---- Read Text File ----");
		obj = new TextFile();
		obj.parseSaveData();

	}

}
