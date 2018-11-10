package structural.decorator.decorator;

/**
 * Created by User on 5/19/2018.
 */
public class JavaDeveloperDecorator implements Developer{

    Developer developer;

    public JavaDeveloperDecorator(Developer developer){
        this.developer = developer;
    }

    @Override
    public void makeJob() {
        developer.makeJob();
    }
}
