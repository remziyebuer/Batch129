package java_core.day37lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda02 {

    //bu sayfa testerlar icin onemli bu uc metodu cok kullanacaklar
      /*
            AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
                     herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
                      bu şarta uyması durumunda true dönecektir.


            NoneMatch: Sarta göre Stream içindeki hiç bir
                       elemanın şartı sağlamaması durumunda true dönecektir.
     */


    //text file acmak icin package ye git tikla new de 'file' sec
    // isimlendir. koy txt uzantisinida ekle

    public static void main(String[] args) throws IOException {
        //1) Lambda text file dosyasi icinde ki metni consola yazdiran kodu yaziniz.Javada
        // Files adi verilen bir class var bu class ta bir suru static class var
        // . koyup görebilirim burda lines() metodu var ben icine Paths.get() metodu ile
        // path' i getirtmek icin path ' i  bu metod un icin e yaziyorum o bana texti verecek.
        // Path'i bulmayi da ögrenmistik text' e gidiyoruz sag tikliyoruz
        // Copy Path Referance var sec absolut path bastan sona hepsini verir.biz hepsini
        //istemiyoruz Path From Content Root seciyoruz


        Files.lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                forEach(System.out::println);//line metodu texte giderek satirlari size stream olarak getirir.
        //sonrada yazdir dedigim icin her birini yazdirir.
        //2) LambdaTextFile dosyasi icinde ki her karakteri uppercase yapiniz.
        Files.lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);
        //3) Lambda TextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren
        // kodu yaziniz.//line var kelime yok ki line lari kelimelere cevirmem lazim.bu degisim
        // sirasinda arraylar olusur.cun ki split array yapar.ama ben array ler i kirmali
        // kelimeleri stream cevirmeliyim.bunu flatMap metodu ile yaparz

        boolean result1 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t -> t.contains("Java"));//hey java bu kelimeler arasinda herhangi biri
        // java kelimesi ile eslesiyormu?bu soruda flatmap ve anymatch ögren flatmap stream
        // lerde calisir

        System.out.println(result1);//true

        //4)LambdaTextFile  dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren
        // kodu yaziniz.


        boolean result2 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.contains("a"));//her kelime 'a' iceriyorsa sonuc dogru olur.

        System.out.println(result2);//true

        //5)LambdaTextFile  dosyasi icindeki her kelimenin ikiden fazla karakter  icerip
        // icermedigini gosteren kodu yaziniz.

        boolean result3 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                allMatch(t -> t.length() > 2);
        System.out.println(result3);//true


        //6) LambdaTextFile dosyasi icinde ki hicbir kelimenin "x" icermedigini gosteren kodu yaziniz

        boolean result4 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                noneMatch(t -> t.contains("x"));//hicbirinin saglamamasi lazim//true
        System.out.println(result4);
      //7) LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

        //1.Yol:


   long result5 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
                count();//count long veriyor int sanirim az geliyor.

        System.out.println(result5);//3
        //2.Yol: Tavsiye edilmez
        int result6 = Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaTextFile.txt")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).
               collect(Collectors.toList()).size();//sonucu listin icine koyup
        // listin uzunluguna baktim ama burda hem iki metod kullanmak zorundasin hem de zaten
        // java bu konuda count () olusturmus o yuzden buna gerek yok.
          System.out.println(result6);
    }
}