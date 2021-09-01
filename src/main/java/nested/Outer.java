package nested;

public class Outer {

    private int num = 2;
    private static int numero = 3;

    public void printSomething() {
        System.out.println("outer instance method called");
    }

    public static void printSomethingElse() {
        System.out.println("outer static method called");
    }

    public void outerMethod() {
        System.out.println("outer method called");

        class Local {
            int number = 1;
            void localMethod() {
                System.out.println(num);
                System.out.println(numero);
                printSomething();
                printSomethingElse();
                System.out.println(number);
                System.out.println("local method called");
            }
        }
        Local local = new Local();
        local.localMethod();
    }
}
