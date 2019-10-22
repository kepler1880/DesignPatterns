package TemplateMethodPattern;

public abstract class DataProcessor {
	
	public void parseSaveData() {
		readData();
		processData();
		saveData();
	}

	protected abstract void processData();

	protected abstract void readData();

	public void saveData() {
		System.out.println("Save Data");
	}
	
}
