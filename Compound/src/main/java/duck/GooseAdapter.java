package duck;

public class GooseAdapter implements Quackable {
    public GooseAdapter(Goose goose){
        this.goose = goose;
    }
    private Goose goose;
    @Override
    public void quack() {
        goose.honk();notifyObserver();
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
