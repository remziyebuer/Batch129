package day06stringmanipulations_ifstatement;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {
        //  Example 1: Bir String' in bas ve sonunda space karakteri varsa siliniz.
        //   " Ali Can " ==>  "Ali Can"

        String s = "   Ali Can  "; //sag da ve soldaki space lerden kurtulmamiz lazim
        // yoksa yanlis sonuc alirim.
        System.out.println(s);

        //trim() metod 'u bir String 'in bas ve sonunda ki space karakterler ini siler
        // arada ki space lere dokunmaz

        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99
        //           = 1332.98
        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);// 456.99==>Ondalik Sayilar Java 'da otomatik olarak double kabul edilir

        String laptop2 = laptop1.replace("$", "");
        System.out.println(laptop2);// 875.99

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);//double totalPrice '
        // da yazabilirdik.
        System.out.println(totalPrice);//1332.98

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soyisminin ilk harfini ekrana yazdiriniz.
        //    "Ali Can"==>AC

        String name = "   ali cAN   ";// önce muhtemel hatalari tamir etmeliyiz

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);//parcala bosluktan
        // deriz o zaman bosluk yok olur imha olur.sonra da birinci karakteri yani inedxi sifir olani al
        System.out.println(second);

        System.out.println("" + first + second);//bunlarin Stringe dönüsmesi icin basa bos String olmali

        //Example 4: Bir String'in hic karakter icermedigini(Bos String) kontrol eden kodu yaziniz

        String str = "";

        //1.yol : length() kullan
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? = " + result1);// true

        //2.yol : isEmpty---->Bos mu?
        boolean result2 = str.isEmpty();//java ya tabii olun birseye özel metod olusturmus ise
        //onu kullanin ikinci sebeb te birincinin hem uzunlugu hem de esitligi kontrol ederek
        //performans kaybeder.

        System.out.println("String bos mu? = " + result2);

        //Example 5; Bir String ' in space haric hicbir karakter icermedigini kontrol eden
        // kodu yaziniz.

        String t = "    ";

        //1.yol
        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println("String ' te sadece Space mi var? = " + result3);

        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("String ' te sadece Space mi var? = " + result4);

        //3.yol--->isBlank metodu sadece space iceren Stringler icin true verir Space disinda bir
        //karakter icerirse false verir.
        boolean result5 = t.isBlank();
        System.out.println("String 'te sadece Space mi var? = " + result5);

        //ÖNEMLI NOT:
        //isBlank() methodu bos String'ler icin de true verir.
        //isBlank() ==> space + hicbirsey icin true  verir iken, isEmpty ==> hicbirsey icin true

        //****ikinci ders****

        //Example 6: Bir String'de a, i, e character'lerinin ilk gorunumlerinin indexleri toplamini
        // ekrana yazdiriniz
        //           "Java is easy to learn" ==> 1 + 5 + 8 = 14
        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);// 1

        int idxI = r.indexOf('i');
        System.out.println(idxI);// 5

        int idxE = r.indexOf('e');
        System.out.println(idxE);//8

        System.out.println("Index'ler toplami: " + (idxA + idxI + idxE));// Index'ler toplami: 14

        //Example 7: Bir String'de "Java" kelime'sinin ilk olarak kacinci index'de kullanildigini gosteren kodu yaziniz.
        //           "Ah Java vah Java sensiz olmuyor Java." ==> 3
        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin(Yani J nin) index'ini almis olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf() method'u olmayan character'ler icin kullanilirsa her zaman "-1" verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);//-1

        //Example 8: Bir String'de a, i, e character'lerinin "son" gorunumlerinin indexleri
        // toplamini ekrana yazdiriniz
        //           "Java is easy to learn" ==> 18 + 5 + 17 = 40
        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);// 18


        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);//5

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);//17

        System.out.println(idxOfA + idxOfI + idxOfE);//40

        //Note: lastIndexOf() String te olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Hoca ya ebay in interwiewin de sorulmus;
        //Example 9 ; Bir String 'de ki tekrarsiz karakterleri ekrana yazdiriniz.
        // abbccdc===>ad

//ben burda indexof() ile last indexof() u karsilastiracam: esitse demek ki bir tane var sadece.
        // indexof()            lastindexof()
        //  a--> 0               a-->0 (tekrarsiz)
        //  b-->1                b-->2
        //  c--> 3               c-->6
        //  d-->5                d-->5 (tekrarsiz)

        String y = "abbccdc";
        char ch1 = y.charAt(0);
        if (y.indexOf(ch1) == y.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 =y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);

        }


        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }

        char ch4 = y.charAt(3);
        if(y.indexOf(ch4)== y.lastIndexOf(ch4)){
            System.out.println(ch4);
        }
        //   ....................................(d ye kadar tüm karakterleri yazmam gerek
        //  Ancak 7.karakteri yani 6. indexi almam gerek java bunun icin loop gelistirmistir .


     //2.yol
        for (int i = 0; i < y.length(); i++) {
            char ch = y.charAt(i);
            if (y.indexOf(ch) == y.lastIndexOf(ch)) {
                System.out.print(ch );
            }
        }


        //Example 10 = Sayi pozitif ise ekrana pozitif yazdirin
        int num = -12;

        if (num > 0) {
            System.out.println("Pozitif");
        }

        // Examole 11; Sayi -1 ile 10 arasinda ise ekrana "Rakam "yazdirin.
        int number = 30;
        if (number < 10 && number > -1) {
            System.out.println("Rakam");
        }


    }


}
