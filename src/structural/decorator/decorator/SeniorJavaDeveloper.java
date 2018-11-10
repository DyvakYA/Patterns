package structural.decorator.decorator;

/**
 * Created by User on 5/28/2018.
 */
public class SeniorJavaDeveloper extends JavaDeveloperDecorator {

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public void makeControl(){
        System.out.println("Control.....");
    }

    @Override
    public void makeJob() {
        super.makeJob();
        makeControl();

    }
}
