package behavioral.mediator.realization1;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        TextChat chat = new TextChat();

        User admin = new Admin(chat);
        User user1 = new SimpleUser(chat);
        User user2 = new SimpleUser(chat);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);

        user1.sendMessage("Hi, I am user");
        admin.sendMessage("Hi, I am admin");
    }
}




