import command.*;

public class Test {
    public static void main(String[] args) {
        new SimpleRemoteControl().setCommand(new LightOnCommand(new Light())).buttonWasPressed();
        Light light = new Light();
        new RemoteControl().setCommand(0,new LightOnCommand(light),new LightOffCommand(light)).offButtonWasPressed(0).onButtonWasPressed(0).undo();
    }
}
