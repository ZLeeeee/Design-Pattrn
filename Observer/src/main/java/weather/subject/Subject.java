package weather.subject;

import weather.observer.Observer;

public interface Subject {
	void notifyObservers();
	void registerObservers(Observer observer);
	void removeObservers(Observer observer);
}
