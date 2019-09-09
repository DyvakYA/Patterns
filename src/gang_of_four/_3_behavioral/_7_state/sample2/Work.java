package behavioral.state.sample2;

class Work implements Activity{

    @Override
    public void doSomething(Human context) {
        System.out.println("Working ...");
        context.setState(new WeekEnd());
    }
}
