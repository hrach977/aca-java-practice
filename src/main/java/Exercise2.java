import java.util.Scanner;

/*
Write a java program, that takes the radius of circle as input and
prints its perimeter and area.
 */
public class Exercise2 {
    public static void main(String[] args) {
        float radius;
        Scanner input = new Scanner(System.in);
        double perimeter;
        double area;
        System.out.println("please enter radius");
        radius = input.nextFloat();
        perimeter = 2 * radius * Math.PI;
        area = Math.PI * radius * radius;
        System.out.println("area of the circle is " + area);
        System.out.println("perimeter of the circle is " + perimeter);
    }
}
