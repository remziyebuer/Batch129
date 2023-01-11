package java_core.day07_ifstatements;

import java.util.Scanner;

public class IfStatements03 {

    public static void main(String[] args) {

        //Soru; Verilen bir sayinin pozitif , negatif veya notr oldugunu kontrol eden
        // kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int num = input.nextInt();

        if(num>0){
            System.out.println("Pozitif");
        } else if (num<0){
            System.out.println("Negatif");
        } else {
            System.out.println("Notr");
        }

    }
}
