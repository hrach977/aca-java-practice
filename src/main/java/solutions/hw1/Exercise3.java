package solutions.hw1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double first = input.nextDouble();
        System.out.println("Enter second number");
        double second = input.nextDouble();

        first = Math.floor(first * 1000);
        first/=1000;
        second = Math.floor(second * 1000);
        second/=1000;

        if (first == second) {
            System.out.println("they are equal up to 3 decimal points");
        } else {
            System.out.println("they are not equal");
        }
    }
}
