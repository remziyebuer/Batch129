package day07ifstatements.day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
/*
Java "Nested If"leri calistirirken cok zamana ihtiyac duyar.Buna Time Consum denir (Zaman emen)
Bu yüzden biz tercih etmeyiz.Son tercihimiz olsun iyi kod kisa koddur.Nested if yazdiysaniz iki
 üc defa dusunun bunu nested siz nasil yapabilirim diye.üstler neden kullandin i sorabilir

 */



    public static void main(String[] args) {
/*
        Example 1: Kullanicidan 3 tane sayi aliniz.
        Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen ise "eskenar ucgen olma durumunu
        kontrol ediniz.
        INFO :
        Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
        herhangi iki kenar farki ucuncu kenardan kucuk olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise eskenar ucgen   KURAL: KOD YAZARKEN ÖNCE ANA ISKELET */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.
//        double a = Math.abs(input.nextDouble());
//        double b = Math.abs(input.nextDouble());
//        double c = Math.abs(input.nextDouble());

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        //Kullanicinin negatif sayi girmesini affetmiyorum
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ucgenin kenarlari sifir veya negatif olamaz");
        } else if ((a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c))
                                                             && (b + c > a && a > Math.abs(b - c))) {

            if (a == b && b == c && a == c) {
                System.out.println("Ucgen hem de eskenar ucgen...");
            } else {
                System.out.println("Ucgen ama eskenar degil...");
            }

        } else {
            System.out.println("Sen ucgen degilsin...");
        }

        //2.asama sadelestirme PARANTEZ ICINDE UZUN KOD SEVILMEZ

        boolean ucgenMi = (a + b > c && c > Math.abs(a - b)) && (a + c > b && b > Math.abs(a - c))
                && (b + c > a && a > Math.abs(b - c));


        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ucgenin kenarlari sifir veya negatif olamaz");
        } else if (ucgenMi) {

            if (a == b && b == c && a == c) {
                System.out.println("Ucgen hem de eskenar ucgen...");
            } else {
                System.out.println("Ucgen ama eskenar degil...");
            }

        } else {
            System.out.println("Sen ucgen degilsin...");
        }














    }


}

































