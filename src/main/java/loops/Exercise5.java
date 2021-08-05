package loops;

import java.util.Scanner;

//Two numbers are entered through the keyboard
//Write a program to find the value of one number
//raised to the power of another
public class Exercise5 {
    //2, 3;    2*2*2=8
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter base number");
        int base = input.nextInt();
        System.out.println("enter the power");
        int power = input.nextInt();
        int result = 1;
        //1st iteration i=1
        //result = result * base //2
        //result:2  base:2
        //2nd iteration i=2
        //result = result * base
        //result:4  base:2
        //3rd iteration i=3[power]
        //result = result * base
        //result: 8  base: 2
        for (int i=1; i<=power; i++) {
//             result = result * base;
            result *= base;
        }
        System.out.println("result is: " + result);
    }
}
