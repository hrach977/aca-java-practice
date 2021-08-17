package solutions.hw3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter string");
        String str = input.nextLine();
//        System.out.println("please enter string2");
//        String str2 = input.nextLine();
//        System.out.println("please enter number");
//        int n = input.nextInt();
//        System.out.println("please enter b");
//        String b = input.nextLine();
        boolean result = Exercise23.catDog(str);
        System.out.println(result);
    }
}
