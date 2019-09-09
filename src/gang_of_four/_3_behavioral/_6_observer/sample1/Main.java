package behavioral.observer.sample1;

public class Main {
    public static void main(String[] args) {
        ChatSubject subject = new ChatSubject();

        new RegularClientObserver(subject);
        new RegularClientObserver(subject);
        new AdminClientObserver(subject);

        System.out.println("First sample1:");
        subject.setState("State #1");

        System.out.println("Second sample1:");
        subject.setState("State #2");
    }
}
