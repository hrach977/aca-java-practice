package interfaces.inheritance;

public interface B {

    default void greet() {
        System.out.println("Hi");
    }
}
