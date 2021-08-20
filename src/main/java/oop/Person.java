package oop;

public class Person implements IPerson, HasHair {
    public int getAge() {
        return 1;
    }
    public boolean hasHair() {
        return true;
    }
    public String getCountry() {
        return "!!!Armenia!";
    }
}
