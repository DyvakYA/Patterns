package behavioral.iterator.realization1;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        Tasks c = new Tasks();

        Iterator it = c.getIterator();

        while (it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
}

