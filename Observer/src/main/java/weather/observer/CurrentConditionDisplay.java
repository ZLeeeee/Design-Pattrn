package weather.observer;

import weather.subject.Subject;

public class CurrentConditionDisplay implements Observer,Displayable {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject subject;
	public void subscribe(Subject subject){
		this.subject = subject;
		subject.registerObservers(this);
	}
	@Override
	public void update(float temp,float humidity,float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("temp: "+temp+" humidity: "+humidity+" pressure: "+pressure );
	}
}
