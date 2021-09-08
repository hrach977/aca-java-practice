package inheritance;

import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) {
        ChildInterface obj = new ChildClass();
        obj.smth();

        Class childClass = ChildClass.class;
        System.out.println(childClass.getSimpleName());
        System.out.println(childClass.isAnnotation());
        System.out.println(childClass.isInterface());
        Method[] methods = childClass.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
    }
}
