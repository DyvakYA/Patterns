package structural.flyWeight.sample1;

//Point flyweight
class Point implements Shape {
    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw point ");
    }
}
