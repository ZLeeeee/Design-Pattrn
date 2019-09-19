import state.GumballMachine;

public class Test {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.tumCrank();
        gumballMachine.dispense();
    }
}
