package duck;

public class QuackCounter implements Quackable {
    private Quackable duck;
    private static int count = 0;
    public QuackCounter(Quackable duck){
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        count++;
    }
    public static int getCount(){
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        duck.notifyObserver();
    }
}
