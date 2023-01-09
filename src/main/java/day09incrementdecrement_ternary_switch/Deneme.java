package day09incrementdecrement_ternary_switch;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {


           /*   Kullanicidan ismini soy ismini ve kredi karti bilgilerini isteyin
            ve asagida ki gibi yazdirin
                Isim-Soyisim: A**** G****
                Kart-No: **** **** **** 1907

             */


//
//                          Scanner scan = new Scanner(System.in);
//                          System.out.print("Isim: ");
//                          String isim = scan.nextLine();
//                          System.out.print("Soyisim: ");
//                          String soyisim = scan.nextLine();
//                          System.out.print("Kredi Kartı No: ");
//                          String kart_no = scan.nextLine();
//                          String namekurz= isim.substring(0,1);
//                          String vornamekurz=soyisim.substring(0,1)  ;
//        for (int i =0; i<isim.length();i++)  {
//            isim=isim.substring(0,1);
//            int sterne=isim.length()-1;
//            for (int j=0;j<sterne;j++)  {
//
//            }
//
//        }
//        System.out.println(isim);
//

//        for (int i = 10; i < 100; i++) {
//            if (i % 7 == 0) {
//                System.out.print(i + " ");
//            }
//        }
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





        }//main

    }
