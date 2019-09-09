package behavioral.chainOfResponsibility.sample1;

public abstract class Logger {

    int priority;

    public Logger(int priority) {
        this.priority = priority;
    }

    private Logger next;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void writerMessage(String message, int level) {
        if (level <= priority) {
            write(message);
        }
        if (next != null) {
            next.writerMessage(message, level);
        }
    }

    abstract void write(String message);

}
