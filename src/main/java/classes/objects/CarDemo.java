package classes.objects;

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(10);
        Car car3 = new Car("a new car has been created");
        System.out.println(car1.speed);
        System.out.println(car2.speed);
        System.out.println(car3.speed);


    }
}
