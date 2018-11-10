package behavioral.mediator.realization2;

import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat {
    private User admin;
    private List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
        if (admin != null && admin instanceof Admin) {
            this.admin = admin;
        } else {
            throw new RuntimeException("Wrong role");
        }
    }

    void addUser(User user) {
        if (admin == null) {
            throw new RuntimeException("No admin in chat");
        }
        if (user instanceof SimpleUser) {
            users.add(user);
        } else {
            throw new RuntimeException("Admin can not change chat");
        }
    }

    @Override
    public void sendMessage(String message, User user) {
        if (user instanceof Admin) {
            for (User u : users) {
                u.getMessage(user.getName() + ":" + message);
            }
        }
        if (user instanceof SimpleUser)
            for (User u : users) {
                if (u != user && u.isEnable())
                    u.getMessage(user.getName() + ":" + message);
            }
        if (admin.isEnable())
            admin.getMessage(user.getName() + ":" + message);
    }
}

