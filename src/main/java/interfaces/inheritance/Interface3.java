package interfaces.inheritance;

public interface Interface3 {

    void method3();

    default void printApple() {
        System.out.println("apple");
    }
}
