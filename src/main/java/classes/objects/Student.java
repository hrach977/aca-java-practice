package classes.objects;

public class Student extends Person implements IPerson {

    public void greet() {
        System.out.println("Hi, I am a student");
    }

    public Student() {
        System.out.println("student created");
    }
}
