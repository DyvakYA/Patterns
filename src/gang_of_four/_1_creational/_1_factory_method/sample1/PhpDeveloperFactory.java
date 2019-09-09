package creational.factoryMethod.sample1;

/**
 * Created by User on 5/15/2018.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
