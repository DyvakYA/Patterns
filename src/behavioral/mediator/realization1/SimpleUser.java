package behavioral.mediator.realization1;

class SimpleUser implements User {
    private Chat chat;

    public SimpleUser(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("User get message '" + message + "'");
    }
}
