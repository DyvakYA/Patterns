package creational.prototype;

/**
 * Created by Dyvak on 27.11.2016.
 */
public class PrototypeOne {

    public static void main(String[] args) {
        HumanTwo original = new HumanTwo(18, "Vasya");
        System.out.println(original);

        HumanTwo copy = (HumanTwo) original.copy();
        System.out.println(copy);
    }
}

interface Copyable{
    Object copy();
}

class Human implements Copyable{
    int age;
    String name;
    public Human(int age, String name){
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

