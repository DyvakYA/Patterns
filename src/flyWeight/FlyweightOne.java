package flyWeight;

import java.util.*;

/**
 * Created by Dyvak on 11.12.2016.
 */
public class FlyweightOne {
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
        for (Shape shape: shapes){
            int x = random.nextInt(100);
            int y = random.nextInt(300);
            shape.draw(x,y);
        }
    }
}

//Flyweight
interface Shape {
    void draw(int x, int y);
}

//Point flyweight
class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+"): draw point ");
    }
}

//Circle flyweight
class Circle implements Shape{
    int r = 5;
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+"): draw circle radius" +r);
    }
}

//Square flyweight
class Square implements Shape{
    int a=10;
    @Override
    public void draw(int x, int y) {
        System.out.println("("+x+","+y+"): draw square " +a);
    }
}

class ShapeFactory{
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName){
        Shape shape = shapes.get(shapeName);
        if(shape ==null){
            switch (shapeName){
                case "circle":
                    shape = new Circle();
                    break;
                case "square":
                    shape = new Square();
                    break;
                case "point":
                    shape = new Point();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}