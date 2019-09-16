import weather.observer.CurrentConditionDisplay;
import weather.subject.ConcreteSubject;

public class Test {
	public static void main(String[] args) {
		ConcreteSubject concreteSubject = new ConcreteSubject();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
		currentConditionDisplay.subscribe(concreteSubject);
		concreteSubject.setMeasureStatus(11,22,33);
	}
}
