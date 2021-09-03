package interfaces.inheritance;

public interface Car {

//    public static final int i = 1;

    void forward();

    void rear();

    default void right() {

    }

    default void left() {

    }

    static void printCar() {
        System.out.println("car");
    }


//    void right();
//
//    void left();
}
