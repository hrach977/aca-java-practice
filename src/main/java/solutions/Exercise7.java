package solutions;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int one = input.nextInt();
        System.out.println("enter second number");
        int two = input.nextInt();
        System.out.println("enter third number");
        int three = input.nextInt();
        System.out.println("enter fourth number");
        int four = input.nextInt();
        System.out.println("enter fifth number");
        int five = input.nextInt();
        int sum = one + two + three + four + five;
        double average = sum / 5;
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);

    }
}
