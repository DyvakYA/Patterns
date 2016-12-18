package behavioral.templateMethod;

/**
 * Created by Dyvak on 18.12.2016.
 */
public class TemplateMethodOne {
    public static void main(String[] args) {

        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}

abstract class C{
    void templateMethod(){
        System.out.println("1");
        differ();
        System.out.println("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}

class A extends C{
    @Override
    void differ2() {
        System.out.println("5");
    }

    @Override
    void differ() {
        System.out.println("2");
    }
}

class B extends C{
    @Override
    void differ2() {
    }

    @Override
    void differ() {
        System.out.println("4");
    }
}
