package candy.remote;

public class HasIconState implements State {
    public HasIconState(Icon icon){
        this.icon = icon;
    }
    private Icon icon;
    @Override
    public int getWidth() {
        return icon.getWidth();
    }

    @Override
    public int getHeight() {
        return icon.getHeight();
    }

    @Override
    public void play() {
        icon.play();
    }
}
