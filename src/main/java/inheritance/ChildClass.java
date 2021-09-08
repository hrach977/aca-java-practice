package inheritance;

public class ChildClass extends ParentClass implements ChildInterface {

    @Override
    public void smth() {
        System.out.println("Hi from child class");
    }
}
