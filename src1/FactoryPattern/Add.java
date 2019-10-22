package FactoryPattern;

public class Add implements Calculate {

	@Override
	public void calculate(Double a, Double b) {
		System.out.println("Add : "+ (a+b));		
	}

}
