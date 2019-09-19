import bird.Duck;
import bird.TurkeyAdapter;
import bird.WildTurkey;

public class Test {
    static void testAdapt(Duck d){
        d.quack();
        d.fly();
    }
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        testAdapt(duck);
    }
}
