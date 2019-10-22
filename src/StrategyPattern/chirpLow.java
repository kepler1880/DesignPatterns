package StrategyPattern;

public class chirpLow implements TweetBehaviour{

	@Override
	public void tweet() {
		System.out.println("chirpLow");		
	}

}
