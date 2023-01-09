package practiceday02;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
/*

TechProEd spor salonu icin isim; soyisim; yas;
kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
olarak toplam ucreti yazdiriniz

 */
        Scanner scan = new Scanner (System.in);

        System.out.println("Techpro spor salonuna Hosgeldiniz!");

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();


        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim = scan.nextLine();


        System.out.println("Lütfen yasinizi giriniz");
        int yas = scan.nextInt();


        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scan.nextDouble();

        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();


        int aylikUcret = 20;
        System.out.println("aylikUcret = " + aylikUcret + "$");


        System.out.println("Lütfen spor salonuna ne kadar devam edeceginizi  giriniz");
        int kacAy= scan.nextInt();
        int toplamTutar = aylikUcret*kacAy;


        System.out.println("isminiz ; " + isim + "\nYasiniz ; " + yas + "\nKilo ; "
        + kilo + "\nBoyunuz ; " + boy + "\nÖdemeniz gereken miktar ; " + toplamTutar + "$");

        System.out.println("Onayliyormusunuz?");



    }
}
