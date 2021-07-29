package conditional.statements;

import java.util.Scanner;

//Take a floating point number from input
//output zero if it's zero
//otherwise output 'positive' or 'negative'
//add 'small' if the absolute value of the number is less than 1
//or 'large' if it exceeds 1M
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number");
        double number = input.nextDouble();

        if (number == 0) {
            System.out.println("the number is zero");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("this is a small positive number");
            } else if (number > 1_000_000) {
                System.out.println("this is a large positive number");
            } else {
                System.out.println("this is a positive number");
            }
        } else {
           if (Math.abs(number) < 1) {
               System.out.println("this is a small negative number");
           } else if (Math.abs(number) > 1_000_000) {
               System.out.println("this is a large negative number");
           } else {
               System.out.println("this is a negative number");
           }
        }
    }
}
