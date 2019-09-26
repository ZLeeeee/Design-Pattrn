package duck;

public class RedHeadDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("quack!");notifyObserver();
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
