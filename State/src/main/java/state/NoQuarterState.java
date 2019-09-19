package state;

public class NoQuarterState implements State {
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    private GumballMachine gumballMachine;
    @Override
    public void insertQuarter() {
        System.out.println("Insert Quarter Change State to HasQuarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you have no quarter");
    }

    @Override
    public void tumCrank() {
        System.out.println("you have no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("you have no quarter");
    }
}
