package behavioral.state.sample2;

class WeekEnd implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Rest(Zzz)");
            count++;
            //context.setState(this);
        } else {
            context.setState(new Work());
        }
    }
}
