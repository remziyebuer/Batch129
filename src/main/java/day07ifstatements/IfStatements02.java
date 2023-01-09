package day07ifstatements;

import java.util.Scanner;

    public  class IfStatements02 {

        public static void main(String[] args) {


            //Soru; Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran
            // kodu yaziniz

            Scanner input = new Scanner(System.in);

            System.out.println("Lütfen bir sayi giriniz");

            int sayi = input.nextInt();

            // 1.yol

            if (sayi % 2 == 0) {
                System.out.println("Cift Sayi");
            }

            if (sayi % 2 != 0){
                System.out.println("Tek Sayi");
            }

          //iki if kullanmak yerine asagidaki tercih edilir ama bu birincininde
          // kullanildigi senaryolar vardir cöpe atmayalim


            //2.yol

            if (sayi % 2 == 0) {
                System.out.println("Cift Sayi");
            } else {
                System.out.println("Tek Sayi");
            }













        }


}
