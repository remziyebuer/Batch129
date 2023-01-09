package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {


        // Example Kullanicinin verdigi sayi icin carpim tablosunu olusturup consola
        // yazdiren kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu görmek icin bir sayi giriniz");
        int num = input.nextInt();

        int i = 1;

        while (i < 11) {

            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }

        //Example Verilen bir String' de her harfin sonrasina "*" sembolunu ekleyiniz.
        //Java ====> J*a*v*a*
        System.out.println("Bir kelime  giriniz");
        String word = input.next();

        String newWord = "";

        int k = 0;

        while (k < word.length()) {

            newWord = newWord + word.charAt(k) + "*";

            k++;
        }
        System.out.println("newWord = " + newWord);

    }


}

