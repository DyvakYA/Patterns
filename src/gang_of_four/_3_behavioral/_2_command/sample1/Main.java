package behavioral.command.sample1;

/**
 * Created by Dyvak on 26.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        User user = new User(
                new StartCommand(computer),
                new StopCommand(computer),
                new ResetCommand(computer));
        user.startComputer();
        user.stopComputer();
        user.resetComputer();
    }
}



