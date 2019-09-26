package duck;

public class DuckSimulator {
    void simulate(AbstractDuckFactory duckFactory){
        Observer observer = new QuackLogist();
        Flock flock = new Flock();
        flock.registerObserver(observer);
        flock.add(duckFactory.createMallardDuck());
        flock.add(duckFactory.createRubberDuck());
        flock.add(duckFactory.createRedHeadDuck());
        flock.add(duckFactory.createDuckCall());
        flock.add(new QuackCounter(new GooseAdapter(new Goose())));
        simulate(flock);
        System.out.println("quack times = "+QuackCounter.getCount());
    }
    void simulate(Quackable duck){
        duck.quack();
    }

    public static void main(String[] args) {
        new DuckSimulator().simulate(new CountingDuckFactory());
    }
}
