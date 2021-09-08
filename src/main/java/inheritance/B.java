package inheritance;

import java.util.*;

public class B extends A {

    @Override
    public void smth() {
        System.out.println("takes no arguments");
    }

    public void smth(int i) {
        System.out.println("takes an int");
    }

    public void smth(String[] args) {
        System.out.println("takes a string array");
    }

    public static void method() {

    }


    public void myMethod() {
        A.method();
    }

//    @Override
//    public SuperClass getObj() {
//        return new SuperClass();
//    }
}
