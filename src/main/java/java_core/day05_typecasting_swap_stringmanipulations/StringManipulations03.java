package java_core.day05_typecasting_swap_stringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

      //  Example 1: Asagida ki kurallara göre kullanicinin girdigi password'u kontrol ediniz.*/
        /*   1.En az 8 karakter olsun
             2.Space karakteri olmasin
             3.En az bir tane büyük harf olsun
             4.En az bir tane kücük harf olsun
             5.En az bir tane sembol olsun
             6.En az bir tane rakam olsun   */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen password'unuzu giriniz.");
        String pwd = input.nextLine();


        // 1.En az 8 karakter olsun
        boolean first = pwd.length()>7;//java ya tek is icin >=8 demiyoruz mecbur olmadikca
        System.out.println("first = " + first);

        // 2.Space karakteri olmasin
        boolean second = !pwd.contains(" ");//anlami space karakteri icermesin cunku booleanlar
        // true olmali ki pwd gecsin.
        System.out.println("second = " + second);

        // 3.En az bir tane büyük harf olsun
        //Note; Büyük harf olmayanlari sil
        //kalan karakter sayisina bak
        // hic biseyin length i 0 'dir.
        //karakter sayisi sifir ise büyük harf yok demektir
        //sifirdan büyük ise büyük harf var demektir

        boolean third = pwd.replaceAll("[^A-Z]","").length()>0;// karsilastirma
        // islemi oldugu icin boolean verecek
        //Istediginiz kadar metodu ayni satirda yanyana kullanabilirsiniz.Buna method chain denir
        System.out.println("third = " + third);

        //4.En az bir tane kücük harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println("fourth = " + fourth);

        //5.En az bir tanes embol olsun (harf ve rakam harici hersey olsun ).
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println("fifth = " + fifth);

        //6.En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println("sixth = " + sixth);
        System.out.println("Password gecerli mi? : " + (first && second && third
        && fourth && fifth && sixth) );

      //Not:Java her zaman yukardan asagi soldan saga calisir

    }
}
