package duck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> ducks = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();
    public void add(Quackable quackable){
        ducks.add(quackable);
        for (Observer observer : observers) {
            quackable.registerObserver(observer);
        }
    }
    public void quack(){
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        for (Quackable duck : ducks) {
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Quackable duck : ducks) {
            duck.notifyObserver();
        }
    }
}
