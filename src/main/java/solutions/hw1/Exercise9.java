package solutions.hw1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first boolean");
        boolean first = input.nextBoolean();
        System.out.println("enter second boolean");
        boolean second = input.nextBoolean();
        System.out.println(first == second);
//        if (first && second) {
//            System.out.println("we are in trouble");
//        } else if (!first && !second) {
//            System.out.println("we are in trouble");
//        } else {
//            System.out.println("we are in trouble");
//        }
    }
}
