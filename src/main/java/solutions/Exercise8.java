package solutions;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter X");
        int x = input.nextInt();
        System.out.println("Please enter Y");
        int y = input.nextInt();

        System.out.println("X before swap: " + x);
        System.out.println("Y before swap: " + y);
        int temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("X after swap: " + x);
        System.out.println("Y after swap: " + y);
    }
}
