package FactoryPattern;

public class Server extends Computer {
	private String ram;
	private String cpu;
	

	public Server(String Ram, String Cpu) {
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
