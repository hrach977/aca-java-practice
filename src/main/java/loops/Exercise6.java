package loops;

import java.util.Scanner;

//write a program that prompts the user to enter an integer
//and then constructs another number with the digits reserved
//and prints it
//12345 -> 54321

//1st iteration
//1234
//5
//2nd iteration
//123
//54
//3rd iteration
//12
//543
//4th iteration
//1
//5432
//5th
//0
//54321

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer");
        int number = input.nextInt();

        int result = 0;

        while (number!=0) {
            result *= 10;  //54320
            result += number%10; //54320 + 1 = 54321
            number/=10; //0
        }

        System.out.println("result: " + result);
    }
}
