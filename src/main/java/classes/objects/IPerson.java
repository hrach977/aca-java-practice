package classes.objects;

public interface IPerson {

    default void hi() {
        System.out.println("hi");
    }
}
