package classes.objects;

public class ParamDemo {

    public static void main(String[] args) {
        int a = 11;
        changeValue(a);
        System.out.println("a inside main method: " + a);
    }

    public static void changeValue(int x) {
        //int x = 11;
        x = 42;
        System.out.println("x inside method: " + x);
    }
}
