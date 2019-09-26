package duck;

public class QuackLogist implements Observer {
    @Override
    public void update(QuackObservable observable) {
        System.out.println("Duck :"+observable+" just quacked");
    }
}
