package creational.builder.sample2;

/**
 * Created by User on 5/27/2018.
 */
public class Main {

    public static void main(String[] args) {
        Product product = Product.builder()
                .name("qwe")
                .build();
        System.out.println(product);
    }
}
