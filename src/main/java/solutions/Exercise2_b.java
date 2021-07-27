package solutions;

import java.util.Scanner;

public class Exercise2_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input first number");
        double one = input.nextFloat();
        System.out.println("input second number");
        double two = input.nextFloat();
        double result = one/two;
        System.out.println(one + " / " + two + " = " + result);
    }
}
