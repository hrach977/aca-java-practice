package classes.objects;

public class PointDemo {
    public static void main(String[] args) {
        Point obj = new Point(2, 3);
        System.out.println(obj.x);
        int x = (new Point(1, 2)).x;
        System.out.println(x);
    }
}
