package structural.decorator.decorator;

/**
 * Created by User on 5/19/2018.
 */
public class Main {

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaTeamLead(new JavaTeamLead(new JavaDeveloper()))));
        developer.makeJob();
    }
}
