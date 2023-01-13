package java_core.day25_inheritance;

public class Car {
    public void engine (){
        System.out.println("Vehicle engine..");
    }
    public Car(){
        super();
        System.out.println("Car 1");
    }
    public Car(String make){
        this();
        System.out.println("Car 2: " + make);
    }

}
