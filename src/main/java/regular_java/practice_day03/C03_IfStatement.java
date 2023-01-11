package regular_java.practice_day03;

import java.util.Scanner;

public class C03_IfStatement {
    public static void main(String[] args) {

/*
Kullanicidan sifirdan buyuk pozitif bir tamsayi girmesini isteyin
Girilen pozitif tamsayi 3 basamakli ise ekrana "3 Basamakli " yazdirin
3 basamakli degilse cift olup olmadigini kontrol edin
Cift ise "3 basamakli olmayan cift sayi" yazdirin
Cift degilse " 3 basamakli olmayan tek sayi" yazdirin
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz");
        int sayi =  scan.nextInt();

        System.out.println("*****if ile cözümü*****");
        if ( sayi> 0 ){

        }



    }
}
