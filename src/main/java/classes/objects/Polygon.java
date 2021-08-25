package classes.objects;

public class Polygon {
    public Point[] points;

    public Polygon(Point... corners) {
        System.out.println("inside varargs constructor");
        points = corners;
    }

    public Polygon(Point[]... corners1) {

    }
}
