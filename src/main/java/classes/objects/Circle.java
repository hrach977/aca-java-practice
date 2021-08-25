package classes.objects;

public class Circle {
    public Point origin;

    public Circle(Point origin) {
        this.origin = origin;
    }

    public Circle() {
        this(new Point(0, 0));
    }
}
