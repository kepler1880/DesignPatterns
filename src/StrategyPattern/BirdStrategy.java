package StrategyPattern;

public class BirdStrategy {

	public static void main(String args[]) {
		
		System.out.println("------ Peacock-------");
		Bird peacock= new Peacock();
		peacock.display();
		peacock.performFly();
		peacock.performTweet();
		peacock.swim();
		
		System.out.println("------ Ostrich-------");
		Bird ostrich= new Ostrich();
		ostrich.display();
		ostrich.performFly();
		ostrich.performTweet();
		ostrich.swim();
	}
}
