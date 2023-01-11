package java_core.day03_Scanner;

import java.util.Scanner;

public class Scanner06 {
    //Kullanicidan alacaginiz bes basamakli bir sayinin ilk iki ve son iki
    // basamagindaki sayilarin toplamini ekrana yazdiriniz.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int number = input.nextInt();

        // bir sayinin son rakamini alabilmek icin o sayiyi 10 a bölün kalana bakin
        //Bir tamsayiyi bir tamsayiya bölerseniz java sonucu kesinlikle tamsayi yapar
        //Cünkü ondalik kismi iptal eder Java yuvarlama islemi yapmaz

        //Son rakami al
        int lastDigit = number % 10;
        System.out.println(lastDigit);
        //Sayiyi kücült
        number = number / 10;
        System.out.println(number);

        //Sondan ikinci rakami al
        int lastSecondDigit = number % 10;
        System.out.println((lastSecondDigit));
        number = number / 10;
        //Sondan ücüncü rakami almaya gerek yok bir sonraki
        // sayiyi almak icin tekrar ASSIGN ET.
        number = number / 10;

       //Sondan dördüncü rakami al
        int lastFourthDigit = number % 10;
        System.out.println(lastFourthDigit);
        number = number / 10;

        //Sondan besinci rakami al
        int lastFifthDigit = number % 10;
        System.out.println(lastFifthDigit);

        System.out.println(lastDigit +lastSecondDigit + lastFourthDigit + lastFifthDigit);

    }
}
