package conditional.statements;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int expression = input.nextInt();
        switch (expression) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("default case");
                break;
        }
        System.out.println("outside switch");
    }
}
