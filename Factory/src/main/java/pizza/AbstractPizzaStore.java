package pizza;

public abstract class AbstractPizzaStore implements PizzaStore {
    @Override
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
