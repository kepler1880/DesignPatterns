package SingletonPattern;

public class TestLogger {
	
	public static void main(String args[]) {
		
		System.out.println("--------- Singleton--------");
		
		Logger obj1=Logger.getInstance();
		Logger obj2=Logger.getInstance();
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("-------Non Singleton-------");
		
		TestLogger obj3=new TestLogger();
		TestLogger obj4=new TestLogger();
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
		
		System.out.println("--------- Singleton double checking--------");
		
		DoubleCheckedLockingSingleton t= DoubleCheckedLockingSingleton.getInstance();
		DoubleCheckedLockingSingleton t1= DoubleCheckedLockingSingleton.getInstance();
		
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		
		System.out.println("-------enum Singleton-------");

		
		EasySingleton e= EasySingleton.INSTANCE;
		EasySingleton e1= EasySingleton.INSTANCE;
		
		System.out.println(e.hashCode());
		System.out.println(e1.hashCode());


	}
}
