package FactoryPattern;

public class PC extends Computer{
	private String ram;
	private String cpu;
	

	public PC(String Ram, String Cpu) {
		this.ram=Ram;
		this.cpu=Cpu;
	}

	@Override
	public String getRam() {		
		return this.ram;
	}

	@Override
	public String getCPU() {		
		return this.cpu;
	}

}
