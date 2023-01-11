package java_core.day03_Scanner;

import java.util.Scanner;

public class TekrarScanner01 {

    public static void main(String[] args) {
       /* Car yourCar = new Car();
        yourCar.dur();
        yourCar.hareket();
        System.out.println(yourCar.fiyat);
        System.out.println(yourCar.model);

        // soru ; Kullanicidan  ilk ismini ve soy ismini alip ikisini
        // ayni satira ekrana yazdiriniz
        Scanner input1 = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz.");
        String firstName = input1.next();
        System.out.println("Lutfen soyadinizi giriniz");
        String lastName = input1.next();
        System.out.println("Adiniz ve Soyadiniz = " + firstName +" "+ lastName);*/

        // Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        /*Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz.");
        String address = input2.nextLine();
        System.out.println(address);
*/
        // Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu
        // ekrana yazdiran kodu yazdiriniz


        //Kullanicidan alacaginiz bes basamakli bir sayinin ilk iki ve son iki
        // basamagindaki sayilarin toplamini ekrana yazdiriniz.
        Scanner input5 = new Scanner(System.in);
        System.out.println("bes basamakli bir sayi giriniz");
        int number = input5.nextInt();
        int ilkbasamak = number % 10;
        System.out.println("ilkbasamak = " + ilkbasamak);
        number = number / 10;
        int ikinciBasamak = number % 10;
        System.out.println("ikinciBasamak = " + ikinciBasamak);
        number = number / 10;
        number = number / 10;
        int dorduncuBasamak = number % 10;
        System.out.println("dorduncuBasamak = " +dorduncuBasamak );
        number = number / 10;
        int besinciBasamak = number % 10;
        System.out.println("besinciBasamak = " + besinciBasamak);
        System.out.println(ilkbasamak + ikinciBasamak + dorduncuBasamak + besinciBasamak);
    }
}
