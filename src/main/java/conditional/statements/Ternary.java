package conditional.statements;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        String name = (number1 == number2) ? "Valod" : "Genadzi";

//        String name;
//        if (number1 == number2) {
//            name = "Valod";
//        } else {
//            name = "Genadzi";
//        }
        System.out.println("name: " + name);
    }
}
