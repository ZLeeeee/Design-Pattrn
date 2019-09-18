package command;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    public RemoteControl(){
        int length = 7;
        onCommands = new Command[length];
        offCommands = new Command[length];
        NoCommand command = new NoCommand();
        for (int i = 0; i <length ; i++) {
            onCommands[i] = command;
            offCommands[i] = command;
        }
        undoCommand = command;
    }
    public RemoteControl setCommand(int index ,Command onCommand,Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
        return this;
    }
    public RemoteControl onButtonWasPressed(int index){
        onCommands[index].execute();
        undoCommand = offCommands[index];
        return this;
    }
    public RemoteControl offButtonWasPressed(int index){
        offCommands[index].execute();
        undoCommand = onCommands[index];
        return this;
    }
    public RemoteControl undo(){
        undoCommand.execute();
        return this;
    }
}
