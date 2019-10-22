package FactoryPattern;

/**
 * @author Srilalitha
 */

/*
 * Always program to an interface
 * type of the object is decided by separtae factory class
 */

public class CalculateFactory {
	
	Calculate obj = null;

	public Calculate getCalculate(String type) {
		if (type.equalsIgnoreCase("add")) {
			obj = new Add();
		}else if(type.equalsIgnoreCase("sub")) {
			obj = new Subtract();
		}else {
			System.out.println("No object");
		}
		return obj;
	}
	
}
