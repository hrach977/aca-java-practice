package oop;

public class MountainBike extends Bicycle {
    //inherited fields
//    public String color;
//    public String make;
//    public int wheelSize;
//    public boolean isElectro;
//    public int gear;
//    public int speed;
//    public String material;
//    String color;
    //...more fields specific to MountainBike
    int newField;

    void setNewField(int newVal) {
        newField = newVal;
    }

    int getNewField() {
        return newField;
    }
}
