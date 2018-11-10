package behavioral.mediator.realization2;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        TextChat chat = new TextChat();

        User admin = new Admin(chat, "Mikle");
        User user1 = new SimpleUser(chat, "Barnie");
        User user2 = new SimpleUser(chat, "Nickolas");
        User user3 = new SimpleUser(chat, "Barg");
        user2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.sendMessage("Hi, I am user");
        admin.sendMessage("Hi, I am admin");
    }
}





