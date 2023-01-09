package advanced._practice.practice01;

import java.util.Arrays;
import java.util.Scanner;

public class Gani_foreach_eurodpolar {
    public static void main(String[] args) {
        //Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarını bulan bir kod yazınız.
          //      Örnek:
       // String str ="$1 $12 €34 €56 $45 €78";
     //   dolarToplami: 58
       // euroToplami: 168
       // Scanner input= new Scanner(System.in);
       // input.nextLine();
        String str ="$1 $12 €34 €56 $45 €78";
       String  [] arr= str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolartoplam = 0;
        int eurotoplam=0;

        for (String w: arr) {
        if(w.contains("$")){
            dolartoplam +=Integer.parseInt(w.replaceAll("\\D",""));}
           else{

            eurotoplam +=Integer.parseInt(w.replaceAll("D",""));}


        }
        System.out.println("dolartoplam = " + dolartoplam);
        System.out.println("eurotoplam = " + eurotoplam);
        }


    }





