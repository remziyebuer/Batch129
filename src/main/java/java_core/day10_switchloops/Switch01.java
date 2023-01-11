package java_core.day10_switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //  yazdiran kodu yaziniz.
        // 8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen baslangic ayinin kacinci ay oldugunu   giriniz..");
        int numOfMonth = input.nextInt();


        switch(numOfMonth){
            case 1 :
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3 :
                System.out.println ("March");

            case 4 :
                System.out.println("April");

            case 5 :
                System.out.println("May");

            case 6 :
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8 :
                System.out.println("August");

            case 9 :
                System.out.println("September");

            case 10 :
                System.out.println("October");

            case 11 :
                System.out.println("November");

            case 12 :
                System.out.println("December");

              break;

            default:
                System.out.println("Gecerli ay numarasi veriniz...");

                //Eger break yazmas isek son satirida yazar yani gecerli ay numarasi
                // yaziniz diye yazar ama zaten kullanici gecerli ay girmis

                /*
                Note;  "switch " yani switch in () parantez iclerine
                1)String 2)int 3)byte 4)short 5)char kullanilabilir ama
                1)long 2)boolean 3) float 4) double kullanilmaz Bazen interwiew de sorulur.
                bunlar kullanilirsa hata vermez ama kullanilmaz
              */


            //2.Yol: Dün ki  switch te hepsini kücük harf yapma böylece ignore etme
                 //     switch deki  dayName i toLower/toUppercase yapinca ya da case
                //    leri de hepsini kucik harf ya da buyuk harf yapin.

                String dayName = "Tuesday";

                switch(dayName.toLowerCase()){

                    case "sunday":
                        System.out.println(1);
                        break;
                    case "monday":
                        System.out.println(2);
                        break;
                    case "tuesday":
                        System.out.println(3);
                        break;
                    case "wednesday":
                        System.out.println(4);
                        break;
                    case "thursday":
                        System.out.println(5);
                        break;
                    case "friday":
                        System.out.println(6);
                        break;
                    case "saturday":
                        System.out.println(7);
                        break;
                    default:
                        System.out.println("Lutfen gecerli gun ismi giriniz");
                }







        }


    }
}
