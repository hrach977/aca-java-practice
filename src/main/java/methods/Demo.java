package methods;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        String myString = new String("Hello World");
        String anotherString = "HelloWorld";

        String something = "abc\refg";
        System.out.println(something);

//        Scanner input = new Scanner(System.in);
//        int first = input.nextInt();
//        int second = input.nextInt();
//        boolean reverse = input.nextBoolean();
//        System.out.println(concat(first, second, reverse));
//        System.out.println(sum2(1, 2));
//        System.out.println(sum3(1, 2, 3));
//        System.out.println(sum4(1, 2, 3, 4));
//        System.out.println(sumNumbers("a"));
//        System.out.println(sumNumbers("a", 1, 2, 3));
//        System.out.println(sumNumbers("a", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }

    public static int sumNumbers(String text, int... nums) {
        System.out.println(text);
        int result = 0;
        for (int num : nums) {
            result+=num;
        }
        return result;
    }

    //sum2(int, int)
    //sum2()
    //sum3(int, int, int)
    //sumNumbers(String, int...)

    public static int sum2(int num1, int num2) {
        return num1 + num2;
    }

    public static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sum4(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }



    public static String concat(int num1, int num2, boolean reverseOrder) {
        if (reverseOrder) {
            return String.valueOf(num2) + num1;
        }
        return "" + num1 + num2;
    }

    public static void sampleMethod(int number) {
        System.out.println("start");
        System.out.println("number is: " + number);
        if (number == 10) {
            System.out.println("condition passed");
            return;
        }
        System.out.println("end");
    }

    public static int sum(int value1, int value2) {
        return value1 + value2;
    }

//    public static int sum2(int value1, int value2) {
//        int sum = value1 + value2;
//        return sum;
//    }



    public static void writeMessage() {
        String firstMessage = "message1";
        String secondMessage = "message2";
        System.out.println(firstMessage);
        System.out.println(secondMessage);

    }

    public static void writeText(String text1, String text2) {
        System.out.println(text1);
        System.out.println(text2);
    }

    public static void writeText1() {
        System.out.println("hello");
        System.out.println("country");
    }
}
