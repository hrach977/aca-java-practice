import java.util.Scanner;

public class Exercise1 {
    /*
    * Read two numbers from keyboard;
    * Print their sum.
    * */
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        int sum;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter first number");
        firstNumber = input.nextInt();
        System.out.println("please enter second number");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        System.out.println("the sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }
}
