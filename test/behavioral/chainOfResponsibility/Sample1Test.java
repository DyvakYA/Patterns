package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.sample1.Level;
import behavioral.chainOfResponsibility.sample1.Logger;
import behavioral.chainOfResponsibility.sample1.MailLogger;
import behavioral.chainOfResponsibility.sample1.SMSLogger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Sample1Test {

    @Before
    public void init() {

    }

    @Test
    public void errorLevelTest() {
        Logger error = new SMSLogger(Level.ERROR);
        assertEquals(1, error.getPriority());
    }

    @Test
    public void debugLevelTest() {
        Logger debug = new SMSLogger(Level.DEBUG);
        assertEquals(2, debug.getPriority());
    }

    @Test
    public void infoLevelTest() {
        Logger info = new MailLogger(Level.INFO);
        assertEquals(3, info.getPriority());
    }

    @Test
    public void nextLoggerTest() {
        Logger logger1 = new SMSLogger(Level.ERROR);
        Logger logger2 = new MailLogger(Level.INFO);
        logger1.setNext(logger2);
        assertEquals(logger2, logger1.getNext());
    }


}
