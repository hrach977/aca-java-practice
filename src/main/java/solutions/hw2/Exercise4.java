package solutions.hw2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int number;
        System.out.println("please enter the number");
        number = input.nextInt();

        for (int i=1; i<=number; i++) {
            sum += 1.0/i;
        }
        System.out.println("sum: " + sum);
    }
}
