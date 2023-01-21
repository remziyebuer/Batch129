package sulehocaexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C07_Exceptions {
    public static void main(String[] args) throws IOException {
        /*

      7)FileNotFoundException;
      8)IO Exceptions;
      Javada bir Dataya ulasmak istedigimizde kullaniriz.
        Bir obje olustururuz.Cesitli methodlari vardir.
         read() ==> Task'teki Datalari okuyor ve getiriyor.Okuyacak hic bir data kalmadiginda -1 donduruyor
         skip () ==> belirli bir kismi atlayip kalan datalari dondurur
         available () ==> Task'te kac byte'lik data oldugunu size gosterir

         */


        FileInputStream fis = new FileInputStream("src/main/java/sulehocaexceptions/Taskexceptions");//sulehocaexceptions/Taskexceptions
        //main icinde n harfini sildim
//dosyanin üstüne gel sag tikla< Copy Path Referance< Path From Content Root tikla ctrl+v
// ile String olarak const. icine yapistir.Ama hala kirmizi yanar adresi aldim ama ya evi bulamazsam
// der endiselenir. const ismi kirmizi uzerine gel cikan box ta Add exceptions to method signature
// yi sec main metodun parantezi ile süslü parantez arasina throws FileNotFoundException yazacaktir

//neden bulamaz iki sebebi var ya biri yanlislikla ya da gereksiz diye silmis olabilir
// ya da yanlis isim girilmis mesela ismi degistirilmis olabilir. yani dosya yolu yanlis olur
        int i;
        try {

            while ((i = fis.read()) != -1) {//read kirmizi idi ustune gelince add method...deyince
                // main de ki FileNotFoundException sildi yerine parent olan IO Exceptions ' u cagirdi.
                // biz bunun yanina virgul koyup FileNotFoundException tekrar elimizle yazabiliriz
                // throws kismina birden fazla isim yazabiliriz. ama metod ta sadece throw
                // yazilir bir tane olur//bu metodla internet sitesinde ki bir yaziyi buraya atabiliriz.
                System.out.print((char) i);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya yolu yanlis ya da dosya silinmis olabilir: "+ e.getMessage());
            e.printStackTrace();

        }catch (IOException e) {//altta parent olacak yoksa child ulasilmaz kod olur.
            System.out.println("Dosya okurken problem olustu : "+e.getMessage());
            e.printStackTrace();
        }

    }


}

