package solutions;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        int one = input.nextInt();
        System.out.println("Input second number");
        int two = input.nextInt();
        int result = one / two;
        System.out.println(one + " / " + two + " = " + result);
    }
}
