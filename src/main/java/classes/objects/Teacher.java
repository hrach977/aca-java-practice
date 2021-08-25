package classes.objects;

public class Teacher extends Person implements IPerson {

    @Override
    public void greet() {
        System.out.println("Hi, I am a teacher");
    }

    public Teacher() {
        System.out.println("teacher created");
    }
}
