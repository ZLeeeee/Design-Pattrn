package command;

public class MacroCommand implements Command {
    private Command[] commands;
    public MacroCommand(Command[] commands){
        commands = commands;
    }
    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
