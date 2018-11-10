package structural.decorator.decorator;

/**
 * Created by User on 5/19/2018.
 */
public class JavaTeamLead extends JavaDeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public void makeCodeReview() {
        System.out.println("TeamLead make code review..");
    }

    @Override
    public void makeJob() {
        super.makeJob();
        makeCodeReview();
    }
}
