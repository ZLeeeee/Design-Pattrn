package pizza;

public class NewYorkCheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("NewYorkCheesePizza baked");
    }

    @Override
    public void cut() {
        System.out.println("NewYorkCheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("NewYorkCheesePizza boxed");
    }
}
