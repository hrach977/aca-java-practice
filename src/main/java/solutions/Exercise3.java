package solutions;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int num = input.nextInt();
        System.out.println(num + " * 1 = " + num);
        System.out.println(num + " * 2 = " + num * 2);
        System.out.println(num + " * 3 = " + num * 3);
        System.out.println(num + " * 4 = " + num * 4);
        System.out.println(num + " * 5 = " + num * 5);
    }
}
