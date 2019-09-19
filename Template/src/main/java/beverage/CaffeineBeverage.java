package beverage;

public abstract class CaffeineBeverage {
    void boilWater(){
        System.out.println("boilWater");
    }
    void pourInCup(){
        System.out.println("pourInCup");
    }
    abstract void brew();
    abstract void addCondiments();
    public void prepare(){
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }
}
