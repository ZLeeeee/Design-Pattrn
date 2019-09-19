package state;

public class SoldState implements State {
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    private GumballMachine gumballMachine;
    @Override
    public void insertQuarter() {
        System.out.println("has quarter");
    }

    @Override
    public void ejectQuarter() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
        System.out.println("eject Quarter");
    }

    @Override
    public void tumCrank() {
        System.out.println("已经摇过了 别摇了 ");
    }

    @Override
    public void dispense() {
        System.out.println("you have candy");
    }
}
