package classes.objects;

public class A {

    static  {
        System.out.println("static block");

    }

    {
        System.out.println("instance block");
    }

    int a;
    static int b=0;

    public A() {
        b++;
    }

    public static void staticMethod() {
        System.out.println("static method");
    }
}
