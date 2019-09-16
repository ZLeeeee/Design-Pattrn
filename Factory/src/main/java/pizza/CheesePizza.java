package pizza;

public class CheesePizza implements Pizza {
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
