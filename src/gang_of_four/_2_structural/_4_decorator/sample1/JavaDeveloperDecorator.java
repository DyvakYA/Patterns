package structural.decorator.sample1;

/**
 * Created by User on 5/19/2018.
 */
public class JavaDeveloperDecorator implements Developer {

    private Developer developer;

    public JavaDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void makeJob() {
        developer.makeJob();
    }
}
