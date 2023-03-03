package tasks.projehastahane;

import java.util.*;

public class DoktorIslemleri {

    static Hastahane hastahane = new Hastahane();
    static Scanner scan = new Scanner(System.in);

    public static void doktorMenusuGoster() throws InterruptedException {

        String secim;
do{
        System.out.println("\n=====DOKTOR MENUSU=====\n" +
                "1-Doktor Ekle\n" +
                "2-Doktor Listesi Yazdir\n" +
                "3-Unvandan Doktor Bulma\n" +
                "4-Doktor Silme\n" +
                "5-Ana Menu\n" +
                "6-Cikis" +
                "Yapmak istediginiz islemi seciniz\n");

        secim = scan.nextLine();

        switch (secim) {
            case "1":
                doktorEkle();
                break;
            case "2":
                doktorListesiYazdir();
                break;
            case "3":
                unvandanDoktorBulma();
                break;
            case "4":
                doktorKayitSilme();
                break;
            case "5":
                Hastahane.menuGoster();
                break;
            case "6":
                System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
                break;
            default:
                System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");

        }
    } while (!secim.equals("6"));

    }
//********************************************************************************************

    public static void doktorEkle(){
        Scanner scan = new Scanner(System.in);


        System.out.println("Lutfen Doktor Tc no giriniz.");
        String tcNo = scan.nextLine();


        System.out.println("Lutfen Doktor ismi giriniz.");
        String isim = scan.nextLine();

        System.out.println("Lutfen Doktor soy ismi giriniz.");
        String soyIsim = scan.nextLine();

        System.out.println("Lutfen Doktor unvani giriniz.");
        String unvan = scan.nextLine();


        String yeniValue = isim +", " + soyIsim+ ", "+unvan;
        Hastahane.doktorMap.put(tcNo,yeniValue);

        System.out.println(tcNo+"  Tc no'lu " + unvan + " Bolumunden Dr."+ isim +" "+ soyIsim+
                "\ndoktor listesine basari ile eklenmistir.");


    }

    //*********************************************************************************************

    public static void doktorListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String,String>> doktorEntrySet = Hastahane.doktorMap.entrySet();

        System.out.println("\n========================DOKTOR LISTESI=====================\n" +
                " TC NO        Doktor Adi   Doktor Soyadi      Doktor Unvani\n" +
                "____________________________________________________________");



        for (Map.Entry<String, String> w : doktorEntrySet) {
            String doktorKey = w.getKey();
            String doktorValue = w.getValue();


            String  doktorValuearr[] = doktorValue.split(", ");



            System.out.printf("%12s %10s %14s %20s \n", doktorKey,doktorValuearr[0],
                    doktorValuearr[1],doktorValuearr[2]);

            Thread.sleep(4000);
        }
    }
//**********************************************************************************

    public static void unvandanDoktorBulma(){
        System.out.println("Aradiginiz  doktorun unvanini giriniz");

        String unvan = scan.nextLine();

            Set<Map.Entry<String,String>> doktorEntrySet = Hastahane.doktorMap.entrySet();

            System.out.println("\n========================DOKTOR BULMA=======================\n" +
                            " TC NO        Doktor Adi   Doktor Soyadi      Doktor Unvani\n" +
                            "____________________________________________________________");



            for (Map.Entry<String, String> w : doktorEntrySet) {
                String doktorKey = w.getKey();
                String doktorValue = w.getValue();


                String doktorValuearr[] = doktorValue.split(", ");


                if (unvan.equalsIgnoreCase(doktorValuearr[2])) {
                    System.out.printf("%12s %10s %14s %20s \n", doktorKey,doktorValuearr[0],
                            doktorValuearr[1],doktorValuearr[2]);
                }
            }


    }
//*****************************************************************************************
public static void doktorKayitSilme(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Silinecek doktor tc no' sunu  giriniz");

    String silenecekTc = scan.nextLine();
    String silinecekValueBulma = Hastahane.doktorMap.get(silenecekTc);
    String bulunanValueSil = Hastahane.doktorMap.remove(silenecekTc);


        System.out.println("Istenen doktor silindi");




}


}




