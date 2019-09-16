package pizza;

public class NewYorkClamPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("NewYorkClamPizza baked");
    }

    @Override
    public void cut() {
        System.out.println("NewYorkClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("NewYorkClamPizza boxed");
    }
}
