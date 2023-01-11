package java_core.day03_Scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // soru ; Kullanicidan  ilk ismini ve soy ismini alip ikisini
        // ayni satira ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk isminizi giriniz..");
        // next () method kullanicidan "tek kelimeli String almak icn kullanilir"
        //metod kullanmak main in disinda olur metodu kullanmak main in icinde olur
        String firstName = input.next();
        System.out.println("Lütfen soy isminizi giriniz..");
        String lastName = input.next();
        System.out.println(firstName + " " + lastName);

    }
}
