package oop;

public class Demo {
    public static void main(String[] args) {
        Bicycle myBike;
        myBike = new Bicycle();

        Bicycle bike2 = new Bicycle();

        myBike.make = "BMW";
        myBike.wheelSize = 19;
        myBike.isElectro = true;

        bike2.make = "TREK";
        bike2.wheelSize = 18;
        bike2.isElectro = false;

        System.out.println("myBike make: " + myBike.make);
        System.out.println("myBike wheelSize: " + myBike.wheelSize);
        System.out.println("myBike isElectro: " + myBike.isElectro);

        System.out.println("bike2 make: " + bike2.make);
        System.out.println("bike2 wheelSize: " + bike2.wheelSize);
        System.out.println("bike2 isElectro: " + bike2.isElectro);

        myBike.speed = 42;
        System.out.println("myBike color: " + myBike.color);
        System.out.println("myBike gear: " + myBike.gear);
        System.out.println("myBike speed: " + myBike.speed);
        System.out.println("myBike material: " + myBike.material);

        bike2.color = "red";
        System.out.println("bike2 color: " + bike2.color);
        System.out.println("bike2 gear: " + bike2.gear);
        System.out.println("bike2 speed: " + bike2.speed);
        System.out.println("bike2 material: " + bike2.material);

    }
}
