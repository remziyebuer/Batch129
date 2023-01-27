package sorucözümlerim;

import java.util.Scanner;

public class MeineSubString {
  /*
     Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine
     gore baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri
     yazdiran bir method olusturun.kullanici baslangic degeri olarak, bitis
     degerinden buyuk bir sayi girerse, hata mesaji verin kullanici str'da olan index'lerden
     daha buyuk bir index girerse hata mesaji yazdirin.

   */
  static String str2 = "cok iyi degil mi!";//2.icin olusturulmustur

    public static void main(String[] args) {
        System.out.println("meineSubString2  = " +
                meineSubString2(9, 16));

    }

    public static void meineSubString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir text giriniz");
        String str = scanner.nextLine();
        System.out.println("Lutfen baslangic ve bitis degeri giriniz");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        String sub = "";

        if (baslangic > bitis) {
            System.out.println("baslangic indexi bitisten buyuk olamaz");
        } else {
            for (int i = baslangic; i < bitis; i++) {
                sub += str.charAt(i);
            }
        }
        System.out.println(sub);
    }

    //*************************************************************//

    public static String meineSubString2(int baslangic, int bitis) {

        String sub2 = "";

        if (baslangic > bitis) {
            System.out.println("baslangic indexi bitisten buyuk olamaz");
        } else {
            for (int i = baslangic; i < bitis; i++) {
                sub2 += str2.charAt(i);
            }
        }

        return sub2;
    }
}
