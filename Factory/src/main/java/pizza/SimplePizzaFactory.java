package pizza;

public class SimplePizzaFactory {
    public Pizza getPizza(String type){
        if("cheese".equals(type))
            return new CheesePizza();
        else if("clam".equals(type))
            return new ClamPizza();
        return null;
    }
}
