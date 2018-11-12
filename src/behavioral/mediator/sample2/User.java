package behavioral.mediator.sample2;

abstract class User {
    private Chat chatTwo;
    private String name;
    private boolean isEnable = true;

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean isEnable) {
        this.isEnable = isEnable;
    }

    public User(Chat chat, String name) {
        this.chatTwo = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        chatTwo.sendMessage(message, this);
    }

    abstract void getMessage(String message);
}
