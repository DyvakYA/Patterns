package listPolymorphism.sample1;

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

