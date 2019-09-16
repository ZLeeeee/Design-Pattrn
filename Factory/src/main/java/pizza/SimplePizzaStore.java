package pizza;

public class SimplePizzaStore extends AbstractPizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type))
            return new CheesePizza();
        else if("clam".equals(type))
            return new ClamPizza();
        return null;
    }
}
