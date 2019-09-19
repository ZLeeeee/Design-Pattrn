package state;

public class GumballMachine implements State{
    private State hasQuarterState;
    private State noQuarterState;
    private State soldState;
    private State state;
    public GumballMachine(){
        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldState = new SoldState(this);
        state = noQuarterState;
    }
    public void setState(State state){
        this.state = state;
    }

    @Override
    public void insertQuarter() {
        state.insertQuarter();
    }

    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    @Override
    public void tumCrank() {
        state.tumCrank();
    }

    @Override
    public void dispense() {
        state.dispense();
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
