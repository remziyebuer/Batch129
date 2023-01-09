package day22_staticblocks_consturctors_datetime;

public class CarRunner {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "M4",2023,false);
        Car c2 = new Car("Audi","R8",2022,true);
        Car c3 = new Car("Honda","Civic",1999,false);


        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        //bunlar ekrana referance yani adres yazdirir kendi consturctorumuz
        // ile olusturdugumuz objeyi ekrana yazdirmak icin toString metoduna
        // ihtiyacimiz var.Bunun icin consturctor olusturdugumuz class a gelelim
        // sag tiklayalim acilan kutuda ortalarda Generate  gorecegiz tiklayip
       // acilan kutuda toString e tiklayalim butun data type leri secili olsun
        // ok deyin  Override kodu yapistiktan sonra tekrar runner class a gelip
        // yukardaki sout lari calistirirsaniz bu sefer adres degil bilgileri
        //görürsünüz

        Car c4 = new Car("Mercedes","C300");

    }
}
