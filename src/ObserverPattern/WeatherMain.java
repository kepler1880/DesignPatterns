package ObserverPattern;

public class WeatherMain {

	public static void main(String[] args) {
		WeatherStation ws= new WeatherStation();
		PhoneDisplay dis= new PhoneDisplay(ws);
		ws.
		ws.addObserver(dis);
		ws.notifyObserver();		
	}
}
