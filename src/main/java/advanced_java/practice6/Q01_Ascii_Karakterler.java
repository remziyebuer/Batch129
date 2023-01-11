package advanced_java.practice6;

import java.util.Scanner;

public class Q01_Ascii_Karakterler {
    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri
    // yazdıran bir kod yazınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk karakteri giriniz");
        char ch1 = scan.next().charAt(0);
        System.out.println("Lutfen ikinci karakteri giriniz");
        char ch2 = scan.next().charAt(0);

  //if(ch1>ch2){yer degistirme temp kullanarak bu biurinci yol ama yapilmisi var}

        int  ilk = Math.min(ch1,ch2);//hangisi kucukse 1.ye at
        int ikinci = Math.max(ch1,ch2);//hangisi kucukse 2.ye ata dikkat int olarak atadim.

        for (int i = ilk+1; i < ikinci; i++) {
            //   System.out.print(i+" "); bu sekilde yazarsam sadece ascii degerini yazdirir
            //   o yuzden type casting yapacam.
            System.out.print((char)i+" ");
        }









    }
}
