package miniproject.p4_aracsigortaapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AracSigortaApplikation {
    /*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:,
       1.dönemi: Haziran 2022               2.dönem: Aralık 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750
        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
 */
    public static void main(String[] args) {
        start();


    }

    private static void start() {
        Scanner scan = new Scanner(System.in);
        //hatalı girişte veya yeni işlem için menü tekrar gösterilsin :while/do-while
        do {
            System.out.println("_____Zorunlu Sigorta Primi Hesaplama _____");
            System.out.println("Tarife donemi seciniz:");
            System.out.println("1.Haziran 2022");
            System.out.println("2.Aralik 2022");
            //exception handle etme
            int term = 0;
            try {
                term = scan.nextInt();// üzerine gel biraz bekle hangi exscepton atacagini söyler.
            } catch (InputMismatchException e) {
                System.out.println("Gecersiz giris, lütfen sayi giriniz.");
            }
            scan.nextLine();
        } while (false);
        System.out.println("Leider");
    }
}