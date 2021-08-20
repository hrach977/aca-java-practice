package oop;

public class Demo2 {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        bike.color = "red";
        bike.make = "Mustang";
        bike.newField = 2;
        System.out.println(bike.color);
        System.out.println(bike.make);

        Bicycle mountainBike = new Bicycle();
        Vehicle mountainBike2 = new MountainBike();
        MountainBike mountainBike3 = (MountainBike) mountainBike2;
//        mountainBike3.newField
        mountainBike.color = "green";
        mountainBike = new TandemBike();
//        mountainBike.newField = 2;
        MountainBike biky = new MountainBike();
//        biky.newField = 2;
        biky.setNewField(2);
        System.out.println(biky.getNewField());
//        MountainBike bike2 = (MountainBike) new Bicycle();
    }


}
