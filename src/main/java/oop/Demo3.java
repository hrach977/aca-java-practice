package oop;

public class Demo3 {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.getAge());
        System.out.println(p.hasHair());
        System.out.println(p.getCountry());

        IPerson person = new Person();
        System.out.println(person.getAge());
        System.out.println(person.getCountry());
//        person.hasHair();
    }
}
