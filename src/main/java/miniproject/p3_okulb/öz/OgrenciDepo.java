package miniproject.p3_okulb.öz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class OgrenciDepo {
    static Map<String, String> ogrencilerMap = new HashMap<>();

    public static void feykOgrenciEkle() {
        ogrencilerMap.put("123456790", "Mehmet, Tas, 2012, 3698, 4, a");
        ogrencilerMap.put("123456791", "Ahmmet, Tas, 2013, 1478, 5, b");
        ogrencilerMap.put("123456792", "Fatma, Bas, 2012, 4569, 5, b");
        ogrencilerMap.put("123456793", "Ahmet, Kas, 2012, 8523, 5, a");
        ogrencilerMap.put("123456794", "Fatma, Kas, 2011, 4587, 4, a");

    }

    static Scanner scan = new Scanner(System.in);

    public static void ogrenciMenu() throws InterruptedException {

        String tercih;

        do {

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============OGRENCI  MENU===============\n"
                + "\n"
                + "   1-Ogrenci Listesi Yazdir\n"
                + "   2-Soy isimden Ogrenci Bulma\n"
                + "   3-Sinif ve Sube ile Ogrenci Bulma\n"
                + "   4-Bilgilerini Girerek Ogrenci Ekleme\n"
                + "   5-Kimlik No ile Kayit Silme\n"
                + "   A-ANA MENU\n "
                + "  Q-CIKIS\n ");

        tercih =scan.nextLine();

        switch (tercih) {
            case "1":// ogretmen listesi yazdirmali
                ogrenciListesiYazdir();
                break;
            case "2":
                soyisimdenOgrenciBulma();
                break;
            case "3":
                sinifVeSubeIleOgrenciBulma();
                break;
            case "4":
                ogrenciEkleme();
                break;
            case "5":
                kimlikNoIleOgrenciKayitSilme();
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

        OkulDepo.projeDurdur();

    }

    private static void ogrenciEkleme() throws InterruptedException {
        System.out.println("Tc no: ");
        String tcNo = scan.nextLine();
        System.out.println("Isim: ");
        String isim = scan.nextLine();
        System.out.println("soyIsim: ");
        String soyIsim = scan.nextLine();
        System.out.println("dogumYili: ");
        String dogumYili = scan.nextLine();
        System.out.println("ogrenciNo: ");
        String ogrenciNo = scan.nextLine();
        System.out.println("sinif: ");
        String sinif= scan.nextLine();
        System.out.println("Sube: ");
        String Sube= scan.nextLine();
        String key=tcNo;
        String Value = isim + ", " + soyIsim + ", " + dogumYili + ", "+ogrenciNo + ", "+
                sinif+", "+ Sube;
        ogrencilerMap.put(key, Value);
        System.out.println(tcNo + " Tc No' lu " + isim + soyIsim + " listeye basari ile eklendi");
        ogrenciListesiYazdir();
    }

    private static void kimlikNoIleOgrenciKayitSilme() throws InterruptedException {

        System.out.println("Silinecek ogrenci kimlik no giriniz");

        String silinecekOgrenci = scan.nextLine();

        String silinecekValue = ogrencilerMap.get(silinecekOgrenci);
        String sonucValue =ogrencilerMap.remove(silinecekOgrenci);
        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
            System.out.println("Istenen Ogrenci silindi");
        } catch (NullPointerException e) {
            System.out.println("Verilen kimlik no ile Ogrenci bulunamadi");
        }

        Thread.sleep(5000);
    }

    private static void ogrenciListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrencilerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============OGRENCI  LISTESI===============\n");

        for (Map.Entry<String, String> w : ogrenciEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();

            String eachValuearr[] = eachValue.split(", ");

            System.out.printf("%-12s  %-6s  %-8s  %4s %4s  %4s %4s \n " , eachKey, eachValuearr[0],
                    eachValuearr[1], eachValuearr[2], eachValuearr[3],eachValuearr[4],eachValuearr[5]);
        }

        Thread.sleep(5000);
    }

    private static void sinifVeSubeIleOgrenciBulma() throws InterruptedException {

        System.out.println("Aradiginiz ögrencinin sinifini giriniz");
        String sinif = scan.nextLine();
        System.out.println("Aradiginiz ögrencinin subesini giriniz");
        String sube = scan.nextLine();
        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrencilerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============SINIF VE SUBE ILE OGRENCI BULMA===============\n");

        for (Map.Entry<String, String> w : ogrenciEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();

            String eachValuearr[] = eachValue.split(", ");
            if (sinif.equalsIgnoreCase(eachValuearr[4])&&sube.equalsIgnoreCase(eachValuearr[5])) {
                System.out.printf("%11s  %-6s  %-8s  %4s %4s  %4s  %4s\n " , eachKey, eachValuearr[0],
                        eachValuearr[1], eachValuearr[2], eachValuearr[3],eachValuearr[4],eachValuearr[5]);

            } else {

                System.out.println("Bu "+sinif+ " ve" +sube+ " de Ögrenci"+ " bulunamadi");

            }


        }

        Thread.sleep(5000);

    }

    private static void soyisimdenOgrenciBulma() throws InterruptedException {
        System.out.println("Aradiginiz ögrencinin soy ismini giriniz");
        String soyIsim = scan.nextLine();
        Set<Map.Entry<String, String>> ogrenciEntrySet = ogrencilerMap.entrySet();

        System.out.println("\n************YILDIZ KOLEJI**************\n"
                + "==============SOYISIMDEN OGRENCI BULMA===============\n");

        for (Map.Entry<String, String> w : ogrenciEntrySet) {

            String eachKey = w.getKey();
            String eachValue = w.getValue();
            //  System.out.println(eachKey + " " + eachValue);
            String eachValuearr[] = eachValue.split(", ");
            if (soyIsim.equalsIgnoreCase(eachValuearr[1])) {
                System.out.printf("%11s  %-6s  %-8s  %4s %4s  %4s  %4s \n " , eachKey, eachValuearr[0],
                        eachValuearr[1], eachValuearr[2], eachValuearr[3],eachValuearr[4],eachValuearr[5]);
            }
        }
        Thread.sleep(5000);
    }

    }


