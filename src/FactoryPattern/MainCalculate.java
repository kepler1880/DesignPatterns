package FactoryPattern;

public class MainCalculate {

	public static void main(String[] args) {
		CalculateFactory factory= new CalculateFactory();
		Calculate obj= factory.getCalculate("add");
		obj.calculate(10.0, 20.0);
		obj= factory.getCalculate("sub");
		obj.calculate(10.0, 20.0);
	}

}
