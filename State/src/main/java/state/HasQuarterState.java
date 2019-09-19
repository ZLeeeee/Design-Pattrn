package state;

public class HasQuarterState implements State {
    public HasQuarterState(GumballMachine gumballMachine){
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
        gumballMachine.setState(gumballMachine.getSoldState());
        System.out.println("wait a minute change to sold state");
    }

    @Override
    public void dispense() {
        System.out.println("candy not out");
    }
}
