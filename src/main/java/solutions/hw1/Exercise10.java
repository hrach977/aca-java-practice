package solutions.hw1;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter month");
        String month = input.nextLine();
        System.out.println("enter year");
        int year = input.nextInt();
        month = month.toLowerCase();

        switch (month) {
            case "january":
                System.out.println(31);
                break;
            case "february":
                boolean first = (year % 4 == 0) && (year % 100 != 0);
                boolean second = year % 400 == 0;
                if (first || second) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;

            case "march":
                System.out.println(31);
                break;
            case "april":
                System.out.println(30);
                break;
        }

//        if (month.equals("january")) {
//            System.out.println(31);
//        } else if (month.equals("february")) {
//            boolean first = (year % 4 == 0) && (year % 100 != 0);
//            boolean second = year % 400 == 0;
//            if (first || second) {
//                System.out.println(29);
//            } else {
//                System.out.println(28);
//            }
//        } else if () {
//
//        }  else if () {
//
//        }  else if () {
//
//        }  else if () {
//
//        }  else if () {
//
//        }
    }
}
