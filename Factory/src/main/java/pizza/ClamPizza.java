package pizza;

public class ClamPizza extends AbstractPizza {
    private PizzaIngredientFactory factory;
    public ClamPizza(PizzaIngredientFactory factory){
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