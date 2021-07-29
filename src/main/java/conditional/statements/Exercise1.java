package conditional.statements;

import java.util.Scanner;

//Take a number from input
//Output whether it's positive, negative or zero
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("number is negative");
        } else if (number == 0) {
            System.out.println("number is zero");
        } else {
            System.out.println("number is positive");
        }
    }
}
