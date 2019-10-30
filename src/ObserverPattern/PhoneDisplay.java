package ObserverPattern;

public class PhoneDisplay implements IObservers {
	
	WeatherStation station ;
	
	public PhoneDisplay(WeatherStation station) {
		this.station=station;
		//station.addObserver(this);
	}

	@Override
	public void update() {
		station.getTemperature();
	}

}
