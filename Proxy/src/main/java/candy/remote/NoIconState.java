package candy.remote;

public class NoIconState implements State {
    public NoIconState(IconProxy proxy){
        this.proxy = proxy;
    }
    private IconProxy proxy;
    @Override
    public int getWidth() {
        return 100;
    }

    @Override
    public int getHeight() {
        return 700;
    }

    @Override
    public void play() {
        System.out.println("change state to hasIconState");
        proxy.setCurrentState(new HasIconState(new ImageIcon()));
        proxy.play();
    }
}
