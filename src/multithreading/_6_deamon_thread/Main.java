package multithreading._6_deamon_thread;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 *     If you analyze the output of one execution of the program, you would see how the queue
 *
 *     begins to grow until it has a size of, in our case, 40 events. Then, its size will vary around 40
 *     events it has grown up to until the end of the execution. This size may depend on the
 *     number of cores of your machine. I have executed the code in a four-core processor, so we
 *     launch four WriterTask tasks.
 *
 *     The program starts with four WriterTask threads. Each thread writes an event and sleeps
 *     for 1 second. After the first 10 seconds, we have 40 events in the queue. During these 10
 *     seconds, CleanerTask are executed whereas the four WriterTask threads sleep; however,
 *     but it doesn't delete any event because all of them were generated less than 10 seconds ago.
 *     During the rest of the execution, CleanerTask deletes four events every second and the
 *     four WriterTask threads write another four; therefore, the size of the queue varies around
 *     40 events it has grown up to. Remember that the execution of this example depends on the
 *     number of available cores to the JVM of your computer. Normally, this number is equal to
 *     the number of cores of your CPU.
 *     You can play with time until the WriterTask threads are sleeping. If you use a smaller
 *     value, you will see that CleanerTask has less CPU time and the size of the queue will
 *     increase because CleanerTask doesn't delete any event.
 **/

public class Main {

    public static void main(String[] args) {
        Deque<Event> deque = new ConcurrentLinkedDeque<>();
        WriterTask writer = new WriterTask(deque);
        for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            Thread thread = new Thread(writer);
            thread.start();
        }
        CleanerTasks cleaner = new CleanerTasks(deque);
        cleaner.start();
    }
}
