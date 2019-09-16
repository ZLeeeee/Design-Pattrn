package weather.subject;

import weather.observer.Observer;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConcreteSubject implements Subject {
	private float temp;
	private float pressure;
	private float humidity;
	private final Set<Observer> observers = new HashSet<>();
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp,humidity,pressure);
		}
	}

	@Override
	public void registerObservers(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObservers(Observer observer) {
		observers.remove(observer);
	}
	public void measureStatementChange(){
		notifyObservers();
	}
	public void setMeasureStatus(float temp,float humidity,float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measureStatementChange();
	}
}
