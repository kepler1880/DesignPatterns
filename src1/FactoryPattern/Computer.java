package FactoryPattern;

public abstract class Computer {
	
	public abstract String getRam();
	public abstract String getCPU();
	
	@Override
	public String toString() {
		return "Computer [getRam()=" + getRam() + ", getCPU()=" + getCPU() + "]";
	}

}
