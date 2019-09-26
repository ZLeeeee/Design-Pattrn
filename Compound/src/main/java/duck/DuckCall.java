package duck;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("kwak!");
        notifyObserver();
    }
    private Observable observable = new Observable(this);

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
