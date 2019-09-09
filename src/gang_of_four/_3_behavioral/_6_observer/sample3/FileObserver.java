package behavioral.observer.sample3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int presser) {
        File f;
        try {
            f = File.createTempFile("TempPressure", "_txt");
            PrintWriter pw = new PrintWriter(f);
            pw.print("Weather is change. t=" + temp + " p=" + presser + ".");
            pw.println();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
