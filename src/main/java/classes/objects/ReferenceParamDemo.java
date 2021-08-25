package classes.objects;

public class ReferenceParamDemo {

    public static void main(String[] args) {
        Point point = new Point(0, 0);
        System.out.println("point.x: " + point.x);
        System.out.println("point.y: " + point.y);
        changePoint(point);
        System.out.println("point.x: " + point.x);
        System.out.println("point.y: " + point.y);
    }

    public static void changePoint(Point point) {
        point.x = 1;
        point.y = 2;
        point = new Point(5, 7);
        System.out.println("point.x inside method: " + point.x);
        System.out.println("point.y inside method: " + point.y);
    }
}
