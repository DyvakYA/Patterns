package structural.flyWeight.sample1;

//Square flyweight
class Square implements Shape {
    private int a = 10;

    @Override
    public void draw(int x, int y) {
        System.out.println("(" + x + "," + y + "): draw square " + a);
    }
}
