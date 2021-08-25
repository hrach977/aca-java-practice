package classes.objects;

public class Car {

    public int speed;

    public Car() {
        speed = 0;
    }

    public Car(int startSpeed) {
        speed = startSpeed;
    }

    public Car(String text) {
        System.out.println(text);
    }
}
