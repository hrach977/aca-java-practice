package interfaces.inheritance;

public class Demo {
    public static void main(String[] args) {
        Interface1 gC = new GroupedClass();

        ((GroupedClass) gC).printSomething();

        GroupedClass groupedClass = (GroupedClass) gC;

//        ((Interface1) groupedClass).printApple();
        groupedClass.printApple();
        Car.printCar();
    }
}
