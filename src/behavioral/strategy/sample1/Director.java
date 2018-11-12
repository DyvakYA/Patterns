package behavioral.strategy.sample1;

/**
 * Created by User on 5/18/2018.
 */
public class Director {

    Developer developer;

    public void setDeveloper(Developer developer){
        this.developer = developer;
    }

    public void execute(){
        developer.writeCode();
    }


}
