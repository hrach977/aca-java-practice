package classes.objects;

public class SingletonDemo {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.INSTANCE;
        MySingleton s2 = MySingleton.INSTANCE;
        System.out.println(s1.getNum());
        System.out.println(s2.getNum());
        s2.setNum(5);
        System.out.println(s1.getNum());
        System.out.println(s2.getNum());
    }
}
