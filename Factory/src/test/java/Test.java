import pizza.NewYorkPizzaStore;
import pizza.Pizza;
import pizza.PizzaStore;
import pizza.SimplePizzaStore;

public class Test {
    public static void main(String[] args) {
        PizzaStore store = new SimplePizzaStore();
        PizzaStore store2 = new NewYorkPizzaStore();
        store.orderPizza("cheese");
        store2.orderPizza("cheese");
    }
}
