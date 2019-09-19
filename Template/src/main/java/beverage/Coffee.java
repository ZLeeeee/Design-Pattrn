package beverage;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dropping Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Milk And Sugar");
    }
}
