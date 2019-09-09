package behavioral.iterator.sample2;

public class Ball {
    private BallColor color;
    private int number;

    public Ball(BallColor color, int number) {
        this.color = color;
        this.number = number;
    }

    public BallColor getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", number=" + number +
                '}';
    }
}
