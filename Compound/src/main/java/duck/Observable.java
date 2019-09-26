package duck;

import java.util.ArrayList;
import java.util.List;


public class Observable implements QuackObservable {
    List<Observer> observers = new ArrayList<>();
    QuackObservable duck;
    public Observable(QuackObservable quackObservable){
        this.duck = quackObservable;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(duck);
        }
    }
}
