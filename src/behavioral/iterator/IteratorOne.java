package behavioral.iterator;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class IteratorOne {
    public static void main(String[] args) {
        Tasks c = new Tasks();

        Iterator it = c.getIterator();

        while (it.hasNext()){
            System.out.println((String) it.next());
        }
    }
}

interface Iterator{
    boolean hasNext();
    Object next();
}

interface Container {
    Iterator getIterator();
}

class Tasks implements Container {
    String [] tasks = {"House", "Tree", "Son"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator() ;
    }

    private class TaskIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length){
                return true;
            }else{
                return false;
            }
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
