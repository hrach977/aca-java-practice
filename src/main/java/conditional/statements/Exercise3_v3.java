package conditional.statements;

import java.util.Scanner;

public class Exercise3_v3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("the greatest number is: " + max);
    }
}
