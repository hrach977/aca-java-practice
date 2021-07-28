package solutions;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input temperature in F");
        double temperatureF = input.nextDouble();
        double temperatureC = (temperatureF - 32) * 5/9;
        System.out.println("The temperature in C is " + temperatureC);
    }
}
