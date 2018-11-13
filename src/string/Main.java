package string;

import java.lang.reflect.Field;

/**
 * Created by User on 5/31/2018.
 */
public class Main {

    public static void main(String[] args) {

        Class<Product> clazz = Product.class;
        Field[] fields = clazz.getDeclaredFields();
        Main str = new Main();
        System.out.println(str.toStringCountParameters(fields));
    }

    private String toStringCountParameters(Field[] fields) {
        StringBuilder string = new StringBuilder("(");
        for (int i = 1; i < fields.length; i++) {
            if (i < fields.length - 1) {
                string.append("?" + ",");
            } else if (i == fields.length - 1) {
                string.append("?");
            }
        }
        string.append(")");
        return string.toString();
    }
}
