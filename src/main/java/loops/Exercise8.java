package loops;

import java.util.Scanner;

//write a program that prompts the user to
//input a positive integer
//it should then output a message indicating
//whether the number is a prime number
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a positive integer");
        int number = input.nextInt();
        boolean flag = true; //assume that the number is prime

        for (int i=2; i<number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag && number>1) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }
    }
}
