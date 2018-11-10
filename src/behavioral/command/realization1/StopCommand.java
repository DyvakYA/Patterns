package behavioral.command.realization1;

public class StopCommand implements Command {

    private Computer computer;

    public StopCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.stop();
    }
}
