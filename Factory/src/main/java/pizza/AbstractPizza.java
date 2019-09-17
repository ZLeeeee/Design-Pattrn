package pizza;

public abstract class AbstractPizza implements Pizza {
    Cheese cheese;
    Dough dough;
    Sauce sauce;
    abstract void prePare();
    @Override
    public void bake() {
        System.out.println("CheesePizza baked");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza boxed");
    }
}
