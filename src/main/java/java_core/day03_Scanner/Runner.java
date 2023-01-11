package java_core.day03_Scanner;

public class Runner { //main classin icinde oldugu class a verilen isim

    public static void main(String[] args) {
        // Object nasil olusturulur?
        //obje olusturmak icin hangi class tan olusturacagini java ya söylemelisn ilk olarak
        // class ismi + object ismi + Atama Operatörü + "new" keyword + Constructor(asci)
        //Constructor(asci) olusturmak icin class adi + ()
        //new keyword u yoklugu varliga cevirir. yoktan obje olusturma icin
        Car myCar = new Car();
        //myCar. obje adi bu sekilde yazilip nokta koyuldugunda cikan kutuda metodlari
        // görebiliriz diger class tan olan. O class ta ki hersey obje de görülmeli.

        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);

       myCar.hareket();// METODUN kendisinde zaten sout var gerek yok
       myCar.dur();//METODUN kendisinde zaten sout var gerek yok


        Student tomHanks = new Student();
        System.out.println(tomHanks.name);
        System.out.println(tomHanks.grade);
        System.out.println(tomHanks.address);

        tomHanks.study();
        tomHanks.feed();

        System.out.println("****Tekrar****");
        TekrarCar deinCar = new TekrarCar();

        System.out.println(deinCar.ucret);
        System.out.println(deinCar.marka);

        deinCar.hareketEt();
        deinCar.durFonksiyonu();

        TekrarStudent tomHanks1 = new TekrarStudent();
        System.out.println(tomHanks1.name);
        System.out.println(tomHanks1.adress);
        System.out.println(tomHanks1.grade);
        tomHanks1.study();
        tomHanks1.feed();

    }

}
