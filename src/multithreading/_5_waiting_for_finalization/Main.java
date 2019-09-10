package multithreading._5_waiting_for_finalization;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        DataSourceLoader loader = new DataSourceLoader();
        Thread thread1 = new Thread(loader, "DataSourceLoader");

        NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
        Thread thread2 = new Thread(loader, "NetworkConnectionsLoader");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Configuration has been loaded: %s\n", new Date());

    }
}
