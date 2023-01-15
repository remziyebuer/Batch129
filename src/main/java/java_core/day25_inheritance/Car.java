package java_core.day25_inheritance;

public class Car extends Vehicle {
    public void engine() {
        System.out.println("Car engine..");
    }

    public int price = 12000;

    public Car() {

        System.out.println("Car 1");
    }

    public Car(String make) {

        System.out.println("Car 2: " + make);
    }

}
