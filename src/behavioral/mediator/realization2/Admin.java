package behavioral.mediator.realization2;

class Admin extends User {
    private Chat chat;

    public Admin(Chat chat, String name) {
        super(chat, name);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin " + getName() + " get message '" + message + "'");
    }
}
