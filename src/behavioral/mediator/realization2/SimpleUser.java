package behavioral.mediator.realization2;

class SimpleUser extends User {
    private Chat chat;

    public SimpleUser(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User " + getName() + " get message '" + message + "'");
    }
}