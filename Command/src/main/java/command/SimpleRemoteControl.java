package command;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl setCommand(Command command){
        this.slot = command;
        return this;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}
