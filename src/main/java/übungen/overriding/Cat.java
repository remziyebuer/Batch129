package übungen.overriding;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("Cats meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }


}
