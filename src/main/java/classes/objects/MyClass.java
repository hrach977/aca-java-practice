package classes.objects;

import java.nio.file.FileAlreadyExistsException;

public class MyClass {
    private int number;
    String color;//package private String color;

    public void doSomethingWithNumber() {
        number++;
        myMethod();
    }

    private void myMethod() {

    }

//    private int myMethod() {
//
//    }

//    public void doSmth(int n) throws FileAlreadyExistsException {
//        if (n<0) {
//            throw new IllegalArgumentException();
//        }
//    }
}
