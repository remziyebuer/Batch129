package mentoring;

import java.util.Scanner;

public class OrjinalSorular {

    public static void main(String[] args) {

       /*   Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin ve asagida ki gibi yazdirin
            Isim-Soyisim: A**** G****
            Kart-No: **** **** **** 1907

         */
        //Gul hanim derste bu sekil cözdü ben de ugrasacagim
        Scanner scan = new Scanner(System.in);
        System.out.print("Isim: ");
        String isim = scan.nextLine();
        System.out.print("Soyisim: ");
        String soyisim = scan.nextLine();
        System.out.print("Kredi Kartı Numarası: ");
        String kart_no = scan.nextLine();
        String isim_yeni = ""+isim.charAt(0);
        String soyisim_yeni = ""+isim.charAt(0);
        for (int i = 1; i < isim.length(); i++) {
            isim_yeni += "*";
        }
        for (int i = 1; i < soyisim.length(); i++) {
            soyisim_yeni = soyisim_yeni + "*";
        }
        String kart_no_yeni = "";
        for (int i = 0; i < 12; i++) {
            kart_no_yeni = kart_no_yeni + "*";
        }
        kart_no_yeni += kart_no.substring(14);
        System.out.println("Isim-Soyisim: " + isim_yeni + " " + soyisim_yeni);
        System.out.println("Kart-No: " + kart_no_yeni);


//Example ; Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //   -4 ==> -1*4    4==>4     0==>0

        int c = -4;
        int r2 = c < 0 ? -1 * 4 : c;

    }
}