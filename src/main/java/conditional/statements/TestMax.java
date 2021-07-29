package conditional.statements;

import java.util.Scanner;

public class TestMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = input.nextInt();
        System.out.println("please enter the second number");
        int num2 = input.nextInt();
        System.out.println("please enter the third number");
        int num3 = input.nextInt();
        System.out.println("please enter the fourth number");
        int num4 = input.nextInt();

        int max = Math.max(Math.max(num3, num2), Math.max(num1, num4));
        Integer a = 12;
    }
}
