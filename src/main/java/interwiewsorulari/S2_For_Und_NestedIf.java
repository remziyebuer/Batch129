package interwiewsorulari;

import java.util.Scanner;

public class S2_For_Und_NestedIf {
    public static void main(String[] args) {



        /*Interwiew Sorusu;
Kullanicidan  100' den kucuk bir tamsayi isteyin .1'den baslayarak
 girilen sayiya kadar tüm sayilari yazdirin. Ancak;
 -Sayi 3' un kati ise sayi yerine "Java" yazdirin
 -Sayi 5' in kati ise sayi yerine "Guzeldir" yazdirin
 -Sayi 3' un ve de 5' in kati ise sayi yerine "Java Guzeldir" yazdirin

 */



        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 100 den kücük bir tamsayi giriniz ");
        int sayi = scan.nextInt();

        if (sayi > 99) {
            System.out.println("Sayi 100 ya da 100 den büyük lütfen kücük bir sayi giriniz");
        } else {

            for (int i = 1; i < sayi + 1; i++) {


                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(" Java Güzeldir, ");
                } else if (i % 3 == 0) {
                    System.out.print(" Java, ");
                } else if (i % 5 == 0) {
                    System.out.print(" Guzeldir, ");

                } else {
                    System.out.print(i + " , ");
                }
            }

        }














    }
}
