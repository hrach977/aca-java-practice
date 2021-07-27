package solutions;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int one = input.nextInt();
        System.out.println("Enter second number");
        int two = input.nextInt();
        System.out.println(one + " * " + two + " = " + (one * two));
    }
}
