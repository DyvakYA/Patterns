package structural.flyWeight.sample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Dyvak on 11.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("square"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));
        shapes.add(shapeFactory.getShape("circle"));

        Random random = new Random();
        for (Shape shape : shapes) {
            int x = random.nextInt(100);
            int y = random.nextInt(300);
            shape.draw(x, y);
        }
    }
}

