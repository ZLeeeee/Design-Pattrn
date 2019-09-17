package pizza;

public interface PizzaIngredientFactory {
    Dough getDough();
    Cheese getCheese();
    Sauce getSauce();
}
