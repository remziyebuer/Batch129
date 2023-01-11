package advanced_java.practice6;

import java.util.Scanner;

public class Q03_RastgeleSifreOlusturma {
    //Kullanıcıdan aldığınız sayi kadar karakter
    // uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
   // String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayısını giriniz");
        int karakterSayisi = input.nextInt();
        int sayac= 0;
        String sifre = "";

        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int maxIndex = karakterler.length();


        while (sayac < karakterSayisi){

            int rastgeleIndeks = (int)(Math.random()*maxIndex);
            sifre += karakterler.charAt(rastgeleIndeks);
            sayac++;

        }

        System.out.println("sifre = " + sifre);



//           Bir ogrencinin cevabi:
//        String karakterler ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//
//        String sifre="";
//
//        for(int i=0;i<say;i++){
//            int randomSay= (int) (Math.random()*(karakterler.length()));
//
//            sifre+=(char)(randomSay);
//
//
//        }
//        System.out.println("sifre = " + sifre);
//


    }

}
