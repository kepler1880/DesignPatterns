package common;

public class overriding {
	public static void main (String args[]) {
		A obj =new B();
		System.out.println("output : "+obj.methodA());
		//System.out.println("output : "+obj.methodB()); error bcoz it will only take properties of A not B
		
		B obj1 =new B();
		System.out.println("B output : "+obj1.methodB());
	}
	
}

//covariantmethod overriding
class A{
	public Object methodA(){
		System.out.println("Object MethodA");
		return 0;
	}
	
	

}

class B extends A{
	public Integer methodA(){
		System.out.println("Integer MethodA");
		return 1;
	}
	public int methodB(){
		System.out.println("Integer MethodB");
		return 10;
	}

}

