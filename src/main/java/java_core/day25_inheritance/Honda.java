package java_core.day25_inheritance;


public class Honda extends Car {

    public int price = 10000;
    public void engine() {
        System.out.println("Honda engine..");
    }
    public Honda() {

        System.out.println("Honda 1");
    }

    public Honda(String model, int year) {
          //bos ise yazmasanda olur okunur olsun diye yazilir
        System.out.println("Honda 2: " + model + " - " + year);
    }

}
