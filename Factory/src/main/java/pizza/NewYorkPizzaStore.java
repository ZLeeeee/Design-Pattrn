package pizza;

public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    Pizza createPizza(String type) {
        if("cheese".equals(type))
            return new NewYorkCheesePizza();
        else if("clam".equals(type))
            return new NewYorkClamPizza();
        return null;
    }
}
