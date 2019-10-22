package StrategyPattern;

public class Peacock extends Bird{
	@Override
	public void display() {
		System.out.println("Peacock display");
		
	}
	
	public Peacock() {
		fBeh = new flyHigh();
		twBeh= new chirpLow();
	}
	
}
