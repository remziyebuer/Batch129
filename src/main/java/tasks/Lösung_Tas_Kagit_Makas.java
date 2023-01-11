package tasks;

import java.util.Scanner;

public class Lösung_Tas_Kagit_Makas {
    public static void main(String[] args) {
            /* TASK:
     tas >makas
     makas >kagit
     kagit >tas
Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini
tanimliyoruz.While dongumuzun icerisinde kullanicidan aldigimiz secimi
"secim" isimli degiskene atiyoruz.Bilgisayarin secimini ise Math.random
 methodunu kullanarak aliyoruz. Math.random()*3 diyerek bilgisayara 0 ile
3 arasinda bir rastgele sayi urettiriyoruz. Ve secimimiz ile bilgisayarin
secimini karsilastirip sonuclarini yaziyoruz.En sonda da kullaniciya oyuna
devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.*/

  //Benim cözümüm;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bu oyunu oynamak icin lutfen tas, makas ya da " +
                "kagittan birini seciniz ve yaziniz\n" +
                "Oyundan cikmak isterseniz lutfen 'Q' ya basiniz?\n" +
                "Her kazandiginizda 10 puan alirsiniz");
        String secim = "";
        int kullanici = 0;
        int rakip = 0;
        String kazanma=  "Kazandiniz, devam etmek isterseniz tas makas ya da kagittan birini seciniz";
        String kaybetme ="Kaybetiniz, devam etmek isterseniz tas makas ya da kagittan birini seciniz";
        do {
            secim = scan.next().toLowerCase().trim();
            if (secim.equals("q")) {
                System.out.println("Oyunu bitirdiniz\n" +
                        "Puaniniz: " + (kullanici * 10) + " \n" +
                        "Rakibinizin Puani: " + (rakip * 10));

                Object sonuc = rakip > kullanici ? (rakip * 10 - kullanici * 10) + " fark ile kaybettiniz"
                        : (kullanici * 10 - rakip * 10) + " fark ile kazandiniz";
                System.out.println("Oyun sonucu = " + sonuc);

                break;
            }

            // random kod;

            int rastgeleSecim = (int) (Math.random() * 3);

            //Secimin Stringe donusmesi
            String rastgeleSecimString = rastgeleSecim == 0 ? "kagit" : rastgeleSecim == 1 ? "makas" : "tas";


            if (secim.equals("tas") && rastgeleSecimString.equals("makas")) {

                kullanici++;
            } else if (secim.equals("makas") && rastgeleSecimString.equals("tas")) {
                System.out.println(kaybetme);
                rakip++;
            } else if (secim.equals("makas") && rastgeleSecimString.equals("kagit")) {
                System.out.println(kazanma);
                kullanici++;
            } else if (secim.equals("kagit") && rastgeleSecimString.equals("makas")) {
                System.out.println(kaybetme);
                rakip++;
            } else if (secim.equals("kagit") && rastgeleSecimString.equals("tas")) {
                System.out.println(kazanma);
                kullanici++;
            } else if (secim.equals("tas") && rastgeleSecimString.equals("kagit")) {
                System.out.println(kaybetme);
                rakip++;
            } else if (secim.equals(rastgeleSecimString)) {
                System.out.println("kimse  kazanamadi lütfen bir daha deneyin");
            } else if (!secim.equals("tas") || !secim.equals("makas")
                    || !secim.equals("kagit")) {
                System.out.println("Yanlis bir giris yaptiniz lütfen tas kagit ya da makas tan birini seciniz ve yaziniz.");
            }
        } while (!secim.equals("q"));


        //****Kursun gönderdigi cözüm****

        Scanner input = new Scanner(System.in);

        int kullanici_puani = 0;

        int bilgisayar_puani = 0;

        String dewamkeee = "EVET";

        int kullanıcıSecim = 0;

        int count = 1;

        while (dewamkeee.equalsIgnoreCase("EVET")) {

            if (count == 1) {

                System.out.println("================================================");

                System.out.println("Tas kagit makas oyununa hos geldiniz efendim :) ");

                System.out.println("================================================");

                System.out.println("1-Tas 2-Kagit 3-Makas");

                System.out.println("=====================");

            }

            System.out.println("Seciminiz : ");

            count = 0;

            kullanıcıSecim = scan.nextInt();

            int bilgisayarin_secimi = (int) (Math.random() * 3);

            if (kullanıcıSecim == 1) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : " +

                            bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else if (kullanıcıSecim == 2) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else if (kullanıcıSecim == 3) {

                if (bilgisayarin_secimi == 1) {

                    System.out.println("Bilgisayarin secimi : Tas ===> Sonuc : Kaybettiniz");

                    bilgisayar_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else if (bilgisayarin_secimi == 2) {

                    System.out.println("Bilgisayarin secimi : Kagit ===> Sonuc : Kazandiniz");

                    kullanici_puani++;

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                } else {

                    System.out.println("Bilgisayarin secimi : Makas ===> Sonuc : Berabere");

                    System.out.println("Puaniniz : " + kullanici_puani + " Bilgisayarin puani : "

                            + bilgisayar_puani);

                }

            } else {

                System.out.println("Hatali giris yaptiniz, lutfen tekrar deneyiniz");

                continue;

            }

            if (kullanici_puani == 3) {

                System.out.println("Oyunu " + kullanici_puani + "-" + bilgisayar_puani + " kazandiniz");



                System.out.println("==============================================================");

                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

                System.out.println("==============================================================");

                dewamkeee = scan.next();


                if (dewamkeee.equalsIgnoreCase("Evet")) {

                    kullanici_puani = 0;

                    bilgisayar_puani = 0;

                    count = 1;
                }

            } else if (bilgisayar_puani == 3) {

                System.out.println("Oyunu " + bilgisayar_puani + "-" + kullanici_puani + " kaybettiniz");

                System.out.println("==================================================================");



                System.out.println("==============================================================");

                System.out.println("Oyun bitti, oyuna devam etmek istiyor musunuz : (EVET / HAYIR)");

                System.out.println("==============================================================");

                dewamkeee = scan.next();

                if (dewamkeee.equalsIgnoreCase("EVET")) {

                    kullanici_puani = 0;

                    bilgisayar_puani = 0;

                    count = 1;

                }

            }


        }

    }
}
