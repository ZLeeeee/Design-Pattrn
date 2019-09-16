package pizza;

public class ClamPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("ClamPizza baked");
    }

    @Override
    public void cut() {
        System.out.println("ClamPizza cut");
    }

    @Override
    public void box() {
        System.out.println("ClamPizza boxed");
    }
}
