package conditional.statements;

import java.util.Scanner;

public class Exercise3_v4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();

//        int res1 = Math.max(num3, num2);
//        int res2 = Math.max(num1, res1);
//        int res = Math.max(num3, Math.max(num1, num2));

        System.out.println("the greatest numbers is: " + Math.max(num1, Math.max(num2, num3)));

    }
}
