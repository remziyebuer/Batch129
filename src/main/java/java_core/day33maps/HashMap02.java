package java_core.day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {

    public static void main(String[] args) {

        //Interwiew;

        //Example 1: Size verilen bir cumledeki herbir kelimenin kacar kere kullanildigini
        // gosteren kodu yaziniz.
        // "Java is easy. Java is OOP. OOP makes Java easy."
        // ==> Java=3, is=2, easy=2, OOP=2, makes=1 adam bunu istiyor ciktinin yapisina
        // bakarak HashMap kullanacagimi anlayacagim.

        HashMap<String, Integer> wordsMap = new HashMap<>();
        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";

        sentence = sentence.replaceAll("\\p{Punct}", "");//tekrar sentence
        // ' e assign etmez isek noktalam isaretlerinin silinmedigini göruruz cunki
        // stringler immutable dir yani degistirilemezdirler metodlar orjinal Stringi degistiremez
        // illa degistirmek istiyorsan metod kullandiktan sonra elde ettiginiz degeri orjinal
        // kutuya koymak zorundasiniz yoksa degismez metod tek basina onu degistiremez
        System.out.println(sentence);// Java is easy Java is OOP OOP makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));
        // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy] her adimda kontrol edin


        // [Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]
        for(String w : wordsArray){

            Integer numOfOccurrence = wordsMap.get(w);

            if(numOfOccurrence==null){
                wordsMap.put(w, 1);
            }else{
                wordsMap.replace(w, numOfOccurrence+1);
            }

        }
        System.out.println(wordsMap);














    }
}
