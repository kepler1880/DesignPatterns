package ObserverPattern;

public interface IObservable {
	public void addObserver(IObservers iob);
	public void removeObserver(IObservers iob);
	public void notifyObserver();

}
