package pizza;

public class SimplePizzaStore extends AbstractPizzaStore {
    private final PizzaIngredientFactory ingredientFactory = new PizzaIngredientFactoryImpl();
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type))
            return new CheesePizza(ingredientFactory);
        else if("clam".equals(type))
            return new ClamPizza(ingredientFactory);
        return null;
    }
}
