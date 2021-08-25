package classes.objects;

public class PolygonDemo {
    public static void main(String[] args) {
        Point[] corners = new Point[2];
        corners[0] = new Point(0, 0);
        corners[1] = new Point(1, 1);
        Polygon polygon = new Polygon(corners);

//        System.out.println(polygon.points[0].x);
//        System.out.println(polygon.points[1].y);
    }
}
