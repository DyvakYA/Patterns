package multithreading._6_deamon_thread;

import java.util.Date;
import java.util.Objects;

public class Event {

    private Date date;
    private String event;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event1 = (Event) o;
        return Objects.equals(date, event1.date) &&
                Objects.equals(event, event1.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, event);
    }
}
