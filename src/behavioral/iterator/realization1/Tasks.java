package behavioral.iterator.realization1;

public class Tasks implements Container {

    private String[] tasks = {"House", "Tree", "Son"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}
