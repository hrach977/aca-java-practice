package loops;

import java.util.Scanner;

//write a program that reads a set of integers from keyboard
//and then prints the sum of the even and odd integers
//user will choose to continue via y/n answer
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int oddSum=0;
        int evenSum=0;
        char choice;
        int number;
        do {
            System.out.println("please enter the number");
            number = input.nextInt();
            if (number%2==0) {
                evenSum+=number; //evenSum = evenSum + number
            } else {
                oddSum+=number;
            }
            System.out.println("do you want to continue? y/n");
            choice = input.next().charAt(0);
        } while (choice == 'y');
        System.out.println("evenSum is: " + evenSum);
        System.out.println("oddSum is: " + oddSum);
    }
}
