package conditional.statements;

import java.util.Scanner;

public class Exercise3_v2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();

        if ( (num1 > num2) && (num1 > num3) ) {
            System.out.println("the first number is the greatest");
        } else if ( (num2 > num1) && (num2 > num3) ) {
            System.out.println("the second number is the greatest");
        } else {
            System.out.println("the third number is the greatest");
        }
    }
}
