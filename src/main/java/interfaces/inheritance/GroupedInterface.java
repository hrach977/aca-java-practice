package interfaces.inheritance;

public interface GroupedInterface extends Interface1, Interface2, Interface3 {

    double E = 2.7;

    void doSomething(String s);

    int doSomethingElse(int i);

    default void printSomething() {
        System.out.println("Hi");
    }

    @Override
    default void printApple() {
        System.out.println("Pear");
    }
}
