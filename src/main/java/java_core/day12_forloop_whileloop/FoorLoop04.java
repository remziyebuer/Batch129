package java_core.day12_forloop_whileloop;

import java.util.Scanner;

public class FoorLoop04 {

    public static void main(String[] args) {
        /*

            Kullanicidan baslangic ve bitis degerlerini alin.
            Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari
            ekrana yazdiriniz  //10  12  14

          */

        Scanner input = new Scanner(System.in);

        System.out.println("Baslangic degerini giriniz...");//3
        int start = input.nextInt();

        System.out.println("Bitis degerini giriniz...");//3
        int end = input.nextInt();

        if (start < end){
            System.out.println("Baslangic degeri bitisten büyük olamaz..");
        }else {//kullanicinin hata ihtimalini for un üstüne
            // gecirmeliyiz sadece for u yazip yazdim iste dememeliyiz

            for (int i = start; i <= end; i++) {

                if (i % 2 == 0) {
                    System.out.println(i + " ");
                }//if

            }//for

        }//else

    }//main
}//class
