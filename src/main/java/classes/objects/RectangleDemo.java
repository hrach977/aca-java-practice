package classes.objects;

public class RectangleDemo {
    public static void main(String[] args) {
        Point center = new Point(42, 42);
        Rectangle rectangle = new Rectangle(new Point(1, 2), 1, 2);
        System.out.println(rectangle.center.x);
        System.out.println(rectangle.center.y);

        Rectangle rectangle1 = new Rectangle(center, 1, 2);
        System.out.println(rectangle1.center.x);
        System.out.println(rectangle1.center.y);
    }
}
