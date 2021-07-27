package solutions;


import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side");
        int side = input.nextInt();
        int perimeter = side * 4;
        int area = side * side;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }
}
