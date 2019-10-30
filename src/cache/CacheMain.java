package cache;

public class CacheMain {
	public static void main(String args[]) throws Exception{

		InMemoryCache inMem= new InMemoryCache();
		inMem.add("100", "Lalitha", 5000);
		inMem.add("200", "Jittu", 4000);
		inMem.add("300", "Bishnu", 6000);
		System.out.println(inMem.get("100"));
		System.out.println(inMem.get("200"));
		System.out.println(inMem.get("300"));
		Thread.currentThread().sleep(4000);
		System.out.println(inMem.get("100"));
		System.out.println(inMem.get("200"));
		System.out.println(inMem.get("300"));


	}
}
