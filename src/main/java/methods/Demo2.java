package methods;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
//        String one = "one";
//        String two = "two";
//        String three = "three";
//        String result = "";
//        result+="one";
//        result+="two";
//        result+="three";
//        System.out.println(result);

//        System.out.println("one" + "two" + "three");
//        StringBuilder sb = new StringBuilder(one);
//        sb.append(two);
//        sb.append(three);
//        String result = sb.toString();
//        System.out.println(result);

//        String a = "Hello World";
//        System.out.println("Hello World".substring(6));
//        String one = "abc";
//        String two = "def";
//        String three = "abc";
//        String four = "ABC";
//
//        System.out.println(one.equalsIgnoreCase(two));
//        System.out.println(one.equalsIgnoreCase(three));
//        System.out.println(one.equalsIgnoreCase(four));
//        char x = 'x';
//        System.out.println(x>97);
//        System.out.println((int) 'a');
//        System.out.println((int) 'd');
//        String one = "abc";
//        String two = "def";
//        String three = "zaa";
//        String four = "zaal";
//        System.out.println(one.compareTo(two));
//        System.out.println(one.compareTo(three));
//        System.out.println(three.compareTo(four));

//        String withWhiteSpaces = "        abcd sedas asdasd       ";
//        String withoutWhiteSpaces = withWhiteSpaces.trim();
//        System.out.println(withWhiteSpaces);
//        System.out.println(withoutWhiteSpaces);
//        String original = "123$56$7$";
//        String modified = original.replace('$', '@');
//        System.out.println(modified);
        String nums = "1 2 3 4 5 6 7 ";
//        String[] numArr = nums.split(" ");

        for (String num : nums.split(" ")) {
            System.out.print(num);
        }
        System.out.println(Arrays.toString(nums.split(" ")));
    }
}
