package FactoryPattern;

public class Subtract implements Calculate {

	@Override
	public void calculate(Double a, Double b) {
		System.out.println("Sub : "+ (a-b));
		
	}

}
