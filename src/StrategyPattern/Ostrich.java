package StrategyPattern;

public class Ostrich extends Bird {

	@Override
	public void display() {
		System.out.println("Ostrich Display");
	}
	
	public Ostrich() {
		fBeh= new flyAir();
		twBeh= new chirpLow();
	}

}
