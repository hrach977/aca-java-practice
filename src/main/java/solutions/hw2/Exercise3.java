package solutions.hw2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        int naxaverjin = 0;
        int verjin = 1;
        int nerkayis;

        System.out.println("please enter number of terms of series");
        number = input.nextInt();

        System.out.print(naxaverjin + " " + verjin +" ");

        //0 1 1
        //1 1 2
        for (int i=3; i<=number; i++) {
            nerkayis = naxaverjin + verjin;
            System.out.print(nerkayis + " ");
            naxaverjin = verjin;
            verjin = nerkayis;
        }
    }
}
