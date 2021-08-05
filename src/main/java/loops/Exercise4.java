package loops;

import java.util.Scanner;

//Write a program to find the factorial value of
//any number entered through the keyboard
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        int number = input.nextInt();
        int factorial = 1;
        for (int i=2; i<=number; i++) {
//            factorial = factorial * i;
            factorial*=i;
        }
        System.out.println("factorial: " + factorial);
    }
}
