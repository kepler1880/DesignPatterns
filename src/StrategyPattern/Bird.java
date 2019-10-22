package StrategyPattern;

public abstract class Bird {
	FlyBehaviour fBeh;
	TweetBehaviour twBeh;
	
	/*public Bird(FlyBehaviour fb,TweetBehaviour tb ) {
		this.fBeh=fb;
		this.twBeh=tb;		
	}*/
	
	public void performFly() {
		fBeh.fly();
	}
	
	public void performTweet() {
		twBeh.tweet();
	}
	
	public abstract void display() ;
	public void swim() {
		System.out.println("Swim");
	}
}
