package behavioral.state.sample2;

//Context
class Human {
    private Activity state;

    public void setState(Activity activity) {
        this.state = activity;
    }

    public void doSomething() {
        state.doSomething(this);//Only one difference
    }
}
