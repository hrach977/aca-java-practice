package solutions;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number in inches");
        double inches = input.nextDouble();
        double meters = inches * 0.0254;
        System.out.println("The number in meters is: " + meters);
    }
}
