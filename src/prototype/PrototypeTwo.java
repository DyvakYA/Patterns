package prototype;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class PrototypeTwo {

    public static void main(String[] args) {
        HumanTwo original = new HumanTwo(18, "Vasya");
        System.out.println(original);

        HumanTwo copy = (HumanTwo) original.copy();
        System.out.println(copy);

        HumanFactory factory = new HumanFactory(copy);
        HumanTwo h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setPrototype(new HumanTwo(30, "Valeria"));
        HumanTwo h2 = factory.makeCopy();
        System.out.println(h2);
    }
}

interface CopyableTwo{
    Object copy();
}

class HumanTwo implements CopyableTwo{
    int age;
    String name;
    public HumanTwo(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human [age=" + age + ", name=" + name + "]";
    }

    @Override
    public Object copy() {
        HumanTwo copy = new HumanTwo(age, name);
        return copy;
    }
}

class HumanFactory{
    HumanTwo human;

    public HumanFactory(HumanTwo human){
        this.human = human;
    }

    public void setPrototype(HumanTwo human){
        this.human = human;
    }

    HumanTwo makeCopy(){
        return (HumanTwo) human.copy();
    }
}


