package candy.remote;

public class ImageIcon implements Icon {
    @Override
    public int getWidth() {
        return 200;
    }

    @Override
    public int getHeight() {
        return 200;
    }

    @Override
    public void play() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0;j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
