package listPoly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/31/2018.
 */
public class Main {

    public static void main(String[] args) {
        List<Parent> list = new ArrayList<>();
        list.add(new Child("bob", "martin"));
        list.add(new Parent("steve"));
        list.add(new Child("nick", "mick"));
        for(Parent item : list){
            Child newItem = (Child)item;
            newItem.nothing();
        }
    }
}

class Parent{
    String name;

    public Parent(String name) {
        this.name = name;
    }

    public void doAction(){
        System.out.println("do action! Parent");
    }
}

class Child extends Parent{

    String description;

    public Child(String name, String description) {
        super(name);
        this.description = description;
    }

    @Override
    public void doAction(){
        System.out.println("do action! Child");
    }

    public void nothing(){
        System.out.println("do nothing");
    }

}
