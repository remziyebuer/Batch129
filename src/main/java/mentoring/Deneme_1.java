package mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme_1 {
    public static void main(String[] args) {

  /*
                        SAYI TAHMIN OYUNU
            Oyuncudan 1-10 arasi bir sayi isteyiniz
            Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
            Yoksa verdigi sayiyi listenize ekleyiniz.
            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz
            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
        */
        List<String> tahminOyunu = new ArrayList<>();
        tahminOyunu.add("5");
        tahminOyunu.add("8");
        tahminOyunu.add("2");
        tahminOyunu.add("9");
        int counter = 0;
        String sayi = "";

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lutfen 1 ile 10 arasinda bir sayi giriniz");
            sayi = scan.next();
            if (Integer.parseInt(sayi) < 11) {


                if (sayi.equalsIgnoreCase("q")) {
                    break;
                } else if (tahminOyunu.contains(sayi)) {
                    tahminOyunu.set(tahminOyunu.indexOf(sayi), "BINGO");
                    counter++;
                } else {
                    tahminOyunu.add(sayi);

                }
            } else {

                System.out.println("lutfen gecerli deger giriniz");
            }


        }  while (counter != tahminOyunu.size());

        if (!sayi.equalsIgnoreCase("q")) {
            System.out.println("kazandiniz");
        }


    }
}