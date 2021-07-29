package conditional.statements;

import java.util.Scanner;

//Take 3 numbers from input, which are coefficients of
//a quadtratic equation. print out the solutions
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter coefficient for x^2");
        int a = input.nextInt();
        System.out.println("enter coefficient for x");
        int b = input.nextInt();
        System.out.println("enter independent coefficient");
        int c = input.nextInt();

        double disc = b * b - 4 * (a * c);

        if (disc > 0) {
            double solution1 = (-b + Math.sqrt(disc)) / 2 * a;
            double solution2 = (-b - Math.sqrt(disc)) / 2 * a;
            System.out.println("solution1 is: " + solution1);
            System.out.println("solution2 is: " + solution2);
        } else if (disc == 0) {
            double solution = -b / 2 * a;
            System.out.println("solution is: " + solution);
        } else {
            System.out.println("there is no real root");
        }
     }
}
