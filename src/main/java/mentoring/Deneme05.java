package mentoring;

import org.w3c.dom.ls.LSOutput;

public class Deneme05 {

    String name = "Emily";
    int age = 20;

    Deneme05(String name, int age ){
        this.name = name;
        this.age = 22;
        System.out.println(age);

    }


    public static void main(String[] args) {
        Deneme05 obj = new Deneme05("Oliver",21);
        System.out.println(obj.age);

    }

}
