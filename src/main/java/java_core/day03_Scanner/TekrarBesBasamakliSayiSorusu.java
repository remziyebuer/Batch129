package java_core.day03_Scanner;

import java.util.Scanner;

public class TekrarBesBasamakliSayiSorusu {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz bes basamakli bir sayinin ilk iki ve son iki
        // basamagindaki sayilarin toplamini ekrana yazdiriniz.
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bes basamakli bir sayi giriniz.");

        int sayi = scan.nextInt();

        int ilk = sayi % 10;
        sayi = sayi / 10;

        int ikinci = sayi%10;
        sayi = sayi/10;

        sayi= sayi/10;

       int dörduncu = sayi%10;
       sayi = sayi/10;

       int besinci = sayi%10;

        System.out.println("Sonuc ; "+ (ilk + ikinci + dörduncu + besinci));
    }
}

