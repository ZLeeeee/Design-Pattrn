package candy.remote;

public class IconProxy implements Icon {
    private State currentState;
    public IconProxy(){
        currentState = new NoIconState(this);
    }
    @Override
    public int getWidth() {
        return currentState.getWidth();
    }

    @Override
    public int getHeight() {
        return 100;
    }

    @Override
    public void play() {
        currentState.play();
    }
    void setCurrentState(State state){
        this.currentState = state;
    }

}
