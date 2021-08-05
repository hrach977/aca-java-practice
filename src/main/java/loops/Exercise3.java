package loops;

import java.util.Scanner;

//Write a program that prompts the user to input a positive integer
//It should then print the multiplication table of that number
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;//5
        System.out.println("please enter the number");
        num = input.nextInt();
        for (int i=1; i<=10; i++) {
            //5 * 1 = 5
            //5 * 2 = 10
            //....
            //5 * 10 = 50
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
