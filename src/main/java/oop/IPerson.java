package oop;

public interface IPerson {
    int getAge();

    default String getCountry() {
        return "Armenia";
    }
}
