package structural.proxy.sample2;

/**
 * Created by Dyvak on 17.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        Image image = new RealImage("D:/images/my.jpg");
        image.display();
    }
}


