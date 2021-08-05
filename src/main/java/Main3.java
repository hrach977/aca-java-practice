public class Main3 {
    public static void main(String[] args) {

        int[] ages = {12, 4, 5, 4};
        System.out.println("array lengths is: " + ages.length);
        System.out.println("elements of array");
        System.out.println("first element: " + ages[0]);
        System.out.println("second element: " + ages[1]);
        System.out.println("third element: " + ages[2]);
        System.out.println("fourth element: " + ages[3]);
//        System.out.println("fifth element: " + ages[4]); Throws out of bounds exception

        double[] anotherArray = new double[4];
        System.out.println(anotherArray[0]);
        System.out.println(anotherArray[1]);
        System.out.println(anotherArray[2]);
        System.out.println(anotherArray[3]);


    }
}
