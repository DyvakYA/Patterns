package behavioral.command.sample1;

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
