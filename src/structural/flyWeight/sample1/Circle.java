package structural.flyWeight.sample1;

//Circle flyweight
class Circle implements Shape {
    private int r = 5;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw circle radius" + r);
    }
}
