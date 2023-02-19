package miniproject.okulb.öz;

import java.util.Scanner;

public class OkulDepo {
    static Scanner scan = new Scanner(System.in);//class level seviyesinde static data


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
            //ana menunun bizden tercih almasi lazim
            System.out.println("Lütfen Menuden tercihinizi yapiniz");
            tercih = scan.nextLine();
            //   islem yapmayacak string yazdim rakami
            switch (tercih) {
                case "1"://okul bilgileri
                    okulBilgileriniYazdir();
                    break;
                case "2"://ogretmen menusunu vermeli
                    OgretmenDepo.ogretmenMenu();
                    break;
                case "3":
                    break;
                case "q":
                case "Q":
                    break;
                default:

            }

        } while (!tercih.equalsIgnoreCase("q"));
        //kullanici q ya basmadigi surece devam edecek basip while disina ciktigimda
        // dur metodu olmali

        projeDurdur();//oyle bir metod olmali ki nereden bitirmek
        // istersem onu cagirmaliyim
    }

    public static void okulBilgileriniYazdir() throws InterruptedException {
        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "\nAdres : " + Okul.ADRES + "\nTelefon : " +Okul.TELEFON);
        //biraz beklesin hemen menuyu getirmesin istiyorsak Thread clasindan sleep()
        //cagirip icine bekleme milisaniyesini yaziyoruz
        Thread.sleep(5000);// ama bunu yazinca metotlarin isimleri alti kirmizi
        // olacak ustunde biraz bekleyip hata ihtimalini ekle deyip tikliyoruz

    }

    public static void projeDurdur() {

        System.out.println("Okul projesinden ciktiniz");
        System.exit(0);//sistemin tamamen durmasini istiyorsaniz bu metodu kullanin
    }
}




