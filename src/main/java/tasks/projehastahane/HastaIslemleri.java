package tasks.projehastahane;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HastaIslemleri {
    static Hastahane hastahane = new Hastahane();
    static Scanner scan = new Scanner(System.in);

    public static void hastaMenusuGoster() {
        int secim;

        do{
        System.out.println("=====HASTA MENUSU=====\n" +
                "1-Hasta Ekle\n" +
                "2-Hasta Listesi Yazdir\n" +
                "3-Hasta Durumu Listele\n" +
                "4-Hasta Silme\n" +
                "5-Hasta Bulma\n" +
                "6-Ana Menu\n" +
                "7-Cikis" +
                "Yapmak istediginiz islemi seciniz\n");


           secim = scan.nextInt();
        switch (secim) {
            case 1:
                hastaEkle();
                break;
            case 2:
                hastaListesiYazdir();
                break;
            case 3:
                hastaDurumListele();
                break;
            case 4:
                break;
            case 5:
                hastaBul();
                break;
            case 6:
                Hastahane.menuGoster();
                break;
            case 7:
                System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
                break;
            default:
                System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");
        }
        }while(secim!=7);

    }
    //******************************************************************************

    public static void hastaEkle() {

        System.out.println("Lutfen hasta ismi giriniz.");
        String isim = scan.nextLine();


        System.out.println("Lutfen hasta soy ismi giriniz.");
        String soyIsim = scan.nextLine();


        System.out.println("Lutfen Hasta aktuel durumu giriniz.");
        String aktuelDurum = scan.nextLine();

        Integer yeniId = (Hastahane.hastaMap.size() + 1) * 111;
        String yeniValue = isim + "," + soyIsim + "," + aktuelDurum;
        Hastahane.hastaMap.put(yeniId, yeniValue);

        System.out.println("Hastahanemize "+aktuelDurum+" sikayeti ile gelen "+
                isim+ " " + soyIsim +"  in hastahanemize "+ +yeniId+" ID'si ile kaydi " +
                "basari ile yapilmistir.");


    }

    //*********************************************************************************
    public static void hastaListesiYazdir() {

        System.out.println
                ("\n=================HASTA LISTESI=================\n" +
                " Hasta ID        Hasta  Adi        Hasta Soyadi   \n" +
                "_________________________________________________");

        Set<Map.Entry<Integer, String>> hastaEntrySet = Hastahane.hastaMap.entrySet();
        for (Map.Entry<Integer, String> w : hastaEntrySet) {
            Integer hastaKey = w.getKey();
            String hastaValue = w.getValue();
            String[] hastaValuearr = hastaValue.split(",");

            System.out.printf("%5s  %20s  %18s  \n", hastaKey, hastaValuearr[0],
                    hastaValuearr[1]);
        }

    }

    //*********************************************************************************
    public static void hastaDurumListele() {


        System.out.println("==============HASTA DURUM LISTESI==============\n" +
                "Hasta Adi        Hasta Soyadi     Hasta Durum\n" +
                "_______________________________________________");
        Set<Map.Entry<Integer, String>> hastaEntrySet = Hastahane.hastaMap.entrySet();
        for (Map.Entry<Integer, String> w : hastaEntrySet) {
            Integer hastaKey = w.getKey();
            String hastaValue = w.getValue();
            String[] hastaValuearr = hastaValue.split(",");

            System.out.printf("%-5s  %20s  %17s  \n", hastaValuearr[0],
                    hastaValuearr[1], hastaValuearr[2]);
        }

    }

//************************************************************************


    public static void hastaBul() {
        System.out.println("Lutfen hastanin id'sini giriniz.");
        int hastaId = scan.nextInt();


        System.out.println("================HASTA BULMA================\n" +
                "Hasta ID   Hasta Adi   Hasta Soyadi      Durum\n" +
                "________________________________________________");

        Set<Map.Entry<Integer, String>> hastaEntrySet = Hastahane.hastaMap.entrySet();

        for (Map.Entry<Integer, String> w : hastaEntrySet) {
            Integer hastaKey = w.getKey();
            String hastaValue = w.getValue();
            String[] hastaValuearr = hastaValue.split(",");
            if (hastaId == hastaKey) {
                System.out.printf("%5s  %10s  %14s %15s \n", hastaKey, hastaValuearr[0],
                        hastaValuearr[1], hastaValuearr[2]);
            }
        }


    }


//**********************************************************************************


}



