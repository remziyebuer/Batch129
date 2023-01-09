package day03Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SoruCozumuPdf {
    public static void main(String[] args) {


//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen iki tane tamsayi giriniz");
//        int firstNumber =scan.nextInt();
//        int secondNumber =scan.nextInt();
//
//        System.out.println(firstNumber + secondNumber);
//        System.out.println(firstNumber - secondNumber);
//        System.out.println(firstNumber * secondNumber);
//

     //KULLANICIDAN ISMINIZI ALIP ISMINIZIN BAS HARFINI YAZDIRINIZ.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi girirniz.");
        char isminizinUcuncuHarfi = scan.next().charAt(2);
        System.out.println("isminizin Ucuncu Harfi = " + isminizinUcuncuHarfi);


    }

}


