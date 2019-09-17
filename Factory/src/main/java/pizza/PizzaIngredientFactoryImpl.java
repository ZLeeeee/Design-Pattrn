package pizza;

public class PizzaIngredientFactoryImpl implements PizzaIngredientFactory {
    @Override
    public Dough getDough() {
        return new DoughImpl();
    }

    @Override
    public Cheese getCheese() {
        return new CheeseImpl();
    }

    @Override
    public Sauce getSauce() {
        return new SauceImpl();
    }
}
