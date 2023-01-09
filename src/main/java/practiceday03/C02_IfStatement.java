package practiceday03;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

      /*
       Kullanicidan alacaginiz iki sayiyi yine
       kullaniciya sectireceginiz dort islemden biri
       ile isleme koyupyazdiriniz
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen\n toplama yapmak icin 1\n  cikarma yapmak icin 2\n" +
                "carpma yapmak icin 3\n bölme yapmak icin 4");

        int islem = scan.nextInt();//Bu kullanicinin islemi secmesi icin

        System.out.println("Lütfen iki tam sayi giriniz." );

        double num1 = scan.nextDouble();//1.sayi assign edildi
        double num2 = scan.nextDouble();//2.sayi assign edildi

        if (islem == 1){
            System.out.println("Toplama sonucu = " + num1 + " + "+num2 + " = "+ (num1+num2));
        } else if (islem == 2){
            System.out.println("Cikarma  sonucu = " + num1 + " - "+num2 + " = "+ (num1-num2));
        }else if (islem == 3){
            System.out.println("Carpma sonucu = " + num1 + "* " + num2 +" = "+ (num1*num2));
        } else if (islem == 4){
            System.out.println("Bölme sonucu = " + num1 + "/ "+ num2 + " = "+ (num1/num2));
        } else {
            System.out.println("Hatali secim yaptiniz tekrar deneyiniz");
        }














    }
}
