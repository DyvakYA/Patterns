package state;

/**
 * Created by Dyvak on 26.11.2016.
 */
public class StateTwo {
    public static void main(String[] args) {

        Human human = new Human();
        human.setState(new Work());
        for (int i = 0; i < 10; i++){
            human.doSomething();
        }
    }
}

//State
interface Activity{
    void doSomething(Human context);
}

class Work implements Activity{

    @Override
    public void doSomething(Human context) {
        System.out.println("Working ...");
        context.setState(new WeekEnd());
    }
}

class WeekEnd implements Activity{
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3){
            System.out.println("Rest(Zzz)");
            count++;
            //context.setState(this);
        }
        else{
            context.setState(new Work());
        }
    }
}

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

