package duck;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
