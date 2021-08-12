package solutions.hw2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do {
            System.out.println("please enter a number");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println("do you want to continue? y/n");
            choice = input.next().charAt(0);
        } while (choice == 'y');

        System.out.println("largest number entered: " + max);
        System.out.println("smallest number entered: " + min);
    }
}
