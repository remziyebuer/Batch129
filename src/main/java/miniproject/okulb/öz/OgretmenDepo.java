package miniproject.okulb.öz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgretmenDepo {
    static Map<String, String> ögretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle() {
        ögretmenlerMap.put("123456780", "Ali, Can , 1980 , Matematik");
        ögretmenlerMap.put("123456781", "Veli, Han , 1982 , Fizik");
        ögretmenlerMap.put("123456782", "Ayse, Can , 1980 , Kimya");
        ögretmenlerMap.put("123456783", "Ali, San , 1980 , Kimya");
        ögretmenlerMap.put("123456784", "Ali, Yan , 1980 , Matematik");

    }


    static Scanner scan = new Scanner(System.in);//class level seviyesinde static data

    public static void ogretmenMenu() throws InterruptedException {

        String tercih = "";
        do {
            System.out.println("\n************YILDIZ KOLEJI**************\n"
                    + "==============OGRETMEN  MENU===============\n"
                    + "\n"
                    + "   1-Ogretmen Listesi Yazdir\n"
                    + "   2-Soy isimden Ogretmen Bulma\n"
                    + "   3-Branstan Ogretmen Bulma\n"
                    + "   4-Bilgilerini Girerek Ogretmen Ekleme\n"
                    + "   5-Kimlik No ile Kayit Silme\n"
                    + "   A-ANA MENU\n "
                    + "    Q-CIKIS\n ");
            //menunun bizden tercih almasi lazim
            System.out.println("Lütfen Menuden tercihinizi yapiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1":// ogretmen listesi yazdirmali
                    ogretmenListesiYazdir();
                    break;
                case "2":
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                    branstanOgretmenBulma();
                    break;
                case "4":
                    ogretmenEkleme();
                    break;
                case "5":
                    kimlikNoIleKayitSilme();
                    break;
                case "a":
                case "A":
                    OkulDepo.anaMenu();
                    break;
                case "q":
                case "Q":
                    break;
                default:
                    System.out.println("Lütfen gecerli tercih yapiniz");
            }

        } while (!tercih.equalsIgnoreCase("q"));
        //kullanici q ya basmadigi surece devam edecek basip while disina ciktigimda
        // dur metodu olmali

        OkulDepo.projeDurdur();//oyle bir metod olmali ki neredenn bitirmek
        // istersem onu cagirmaliyim
    }

    public static void kimlikNoIleKayitSilme() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");

    }

    private static void ogretmenEkleme() {
        System.out.println("Tc no: ");
        String tcNo = scan.nextLine();
        System.out.println("Isim: ");
        String isim = scan.nextLine();
        System.out.println("soyIsim: ");
        String soyIsim = scan.nextLine();
        System.out.println("dogumYili: ");
        String dogumYili = scan.nextLine();
        System.out.println("brans: ");
        String brans = scan.nextLine();
        String eklenecekValue= isim+ ", " + soyIsim + ", "+dogumYili+ ", "+brans;
        //String eklenecekKey=
    }

    public static void branstanOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz ögretmenin bransini giriniz");
        String brans = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenEntrySet = ögretmenlerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============BRANSTAN OGRETMEN BULMA===============\n");

        for (Map.Entry<String, String> w : ogretmenEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();
            //  System.out.println(eachKey + " " + eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (brans.equalsIgnoreCase("eachValuearr[3]")) {
                System.out.printf("%11s  %-6s  %-8s  %4s  %s \n ", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2],
                        eachValuearr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void soyisimdenOgretmenBulma() throws InterruptedException {
        System.out.println("Aradiginiz ögretmenin soy ismini giriniz");
        String soyIsim = scan.nextLine();
        Set<Map.Entry<String, String>> ogretmenEntrySet = ögretmenlerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============SOYISIMDEN OGRETMEN BULMA===============\n");

        for (Map.Entry<String, String> w : ogretmenEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();
            //  System.out.println(eachKey + " " + eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (soyIsim.equalsIgnoreCase("eachValuearr[1]")) {
                System.out.printf("%11s  %-6s  %-8s  %4s  %s \n ", eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2],
                        eachValuearr[3]);
            }
        }
        Thread.sleep(5000);
    }

    public static void ogretmenListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> ogretmenEntrySet = ögretmenlerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============OGRETMEN  LISTESI===============\n");

        for (Map.Entry<String, String> w : ogretmenEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();
            //  System.out.println(eachKey + " " + eachValue);
            String eachValuearr[] = eachValue.split(", ");
            System.out.printf("%11s  %-6s  %-8s  %4s  %s \n " , eachKey, eachValuearr[0], eachValuearr[1], eachValuearr[2],
                    eachValuearr[3]);
        }

        Thread.sleep(5000);
    }
}
