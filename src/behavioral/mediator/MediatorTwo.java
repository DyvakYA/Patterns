package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dyvak on 13.12.2016.
 */
public class MediatorTwo {
    public static void main(String[] args) {

        TextChatTwo chat = new TextChatTwo();

        UserTwo admin = new AdminTwo(chat, "Mikle");
        UserTwo u1 = new SimpleUserTwo(chat,"Barnie");
        UserTwo u2 = new SimpleUserTwo(chat,"Nickolas");
        UserTwo u3 = new SimpleUserTwo(chat,"Barg");
        u2.setEnable(false);

        chat.setAdmin(admin);
        chat.addUser(u1);
        chat.addUser(u2);
        chat.addUser(u3);

        u1.sendMessage("Hi, I am user");
        admin.sendMessage("Hi, I am admin");
    }
}

abstract class UserTwo{
    ChatTwo chatTwo;
    String name;
    boolean isEnable = true;
    public boolean isEnable() {return isEnable;}
    public void setEnable(boolean isEnable){this.isEnable = isEnable;}
    public UserTwo(ChatTwo chat, String name) {this.chatTwo = chat;this.name = name;}
    public String getName() {return name;}
    public void sendMessage(String message){chatTwo.sendMessage(message, this);}
    abstract void getMessage(String message);
}

class AdminTwo extends UserTwo{
    ChatTwo chat;
    public AdminTwo(ChatTwo chat, String name){super(chat, name);}

    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getName()+" get message '" + message +"'");
    }

}class SimpleUserTwo extends UserTwo{
    ChatTwo chat;
    public SimpleUserTwo(ChatTwo chat, String name){super(chat, name);}

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName()+" get message '" + message +"'");
    }
}

interface ChatTwo{
    void sendMessage(String message, UserTwo user);
}

class TextChatTwo implements ChatTwo{
    UserTwo admin;
    List<UserTwo> users = new ArrayList<>();

    public void setAdmin(UserTwo admin){
        if(admin!=null && admin instanceof AdminTwo){
            this.admin=admin;
        }else{
            throw new RuntimeException("Wrong role");
        }
    }

    void addUser(UserTwo user){
       if(admin==null){
           throw new RuntimeException("No admin in chat");
       }
        if (user instanceof SimpleUserTwo){
            users.add(user);
        }else{
            throw new RuntimeException("Admin can not change chat");
        }
    }

    @Override
    public void sendMessage(String message, UserTwo user) {
       if(user instanceof AdminTwo) {
           for(UserTwo u: users){
               u.getMessage(user.getName()+":"+message);
           }
       }
        if (user instanceof SimpleUserTwo)
            for(UserTwo u: users){
                if(u!=user && u.isEnable())
                    u.getMessage(user.getName()+":"+message);
                }
                if(admin.isEnable())
                    admin.getMessage(user.getName()+":"+message);
            }
    }


