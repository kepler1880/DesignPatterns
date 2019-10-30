package ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements IObservable {
	
	private ArrayList<IObservers> observers;
	private int temparature = 30;
	
	public WeatherStation() {
		observers= new ArrayList<>();
	}

	@Override
	public void addObserver(IObservers iob) {
		observers.add(iob);	
	}

	@Override
	public void removeObserver(IObservers iob) {
		int i=observers.indexOf(iob);
		if(i>0)
		observers.remove(i);			
	}

	@Override
	public void notifyObserver() {
		for( IObservers list:observers)
			list.update();
	}
	
	public int getTemperature() {
		return this.temparature;
	}

}
