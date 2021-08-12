package solutions.hw2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("please enter the number");
        number = input.nextInt();

        double sum=0;
        int sign = 1;
        for (int i=1; i<=number; i++) {
            sum += (1.0 * sign)/i;
            sign *= -1;
        }
        System.out.println("sum: " + sum);
    }
}
//            if (i%2==1) {
//                sum+= 1.0/i;
//            } else {
//                sum-=1.0/i;
//            }