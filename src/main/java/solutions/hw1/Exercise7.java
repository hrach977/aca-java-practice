package solutions.hw1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();
//        if (first == 10 || second == 10 || (first + second == 10)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        System.out.println(first == 10 || second == 10 || (first + second == 10));
    }
}
