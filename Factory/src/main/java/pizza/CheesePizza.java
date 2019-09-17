package pizza;

public class CheesePizza extends AbstractPizza {
    private PizzaIngredientFactory factory;
    public CheesePizza(PizzaIngredientFactory factory){
        this.factory = factory;
    }
    @Override
    void prePare() {
        dough = factory.getDough();
        cheese = factory.getCheese();
        sauce = factory.getSauce();
        System.out.println("prePare Ending");
    }
}
