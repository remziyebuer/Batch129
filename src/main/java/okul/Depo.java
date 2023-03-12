package okul;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("\n************YILDIZ KOLEJI**************\n"
                    + " ==============ANA MENU===============\n"
                    + "\n"
                    + "   1-Okul Bilgileri Görümtüle\n"
                    + "   2-Ogretmen Menu\n"
                    + "   3-Ogrenci Menu\n"
                    + "   Q-CIKIS\n ");
            System.out.println("Lutfen menuden tercihinizi yapiniz");
            tercih = scan.nextLine();
            switch(tercih){
                case "1" ://okul bilgileri
                    break;
                case "2" :
                  Depo.okulBilgileriniYazdir();
                    break;
                case "3" :
                    break;
                case "q" :
                    break;
                case "Q" :
                    break;
                default:
                    System.out.println("Lutfen gecerli bir tercih giriniz");

            }


        } while (!tercih.equalsIgnoreCase("q"));

        Depo.projebitir();
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "ADRES :  "+ Okul.ADRES
                + "TELEFON:  " + Okul.TELEFON);
        Thread.sleep(5000);

    }

    public static void projebitir() {

        System.out.println("Cikis yaptiniz");
    }
}
