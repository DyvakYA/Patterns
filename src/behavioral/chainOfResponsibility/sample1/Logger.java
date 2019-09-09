package behavioral.chainOfResponsibility.sample1;

public abstract class Logger {

    private int priority;

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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Logger getNext() {
        return next;
    }

    abstract void write(String message);

}
