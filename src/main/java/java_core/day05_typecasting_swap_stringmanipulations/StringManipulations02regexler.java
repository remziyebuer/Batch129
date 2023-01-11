package java_core.day05_typecasting_swap_stringmanipulations;

public class StringManipulations02regexler {

    public static void main(String[] args) {
        String s = "Learn Java earn money";
        //Example 1 ; "s" String 'inin  "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);

        //Example 2 ; "s" String 'inde ki "money " kelimesini "dolar" kelimesine ceviriniz.
        String newS1 = s.replace("money", "dolar");
        System.out.println("newS1 = " + newS1);//bu cok kullanilir

        //Example 3 ; "s" String 'inde ki "earn" kelimesini "win" kelimesine ceviriniz
        String s2 = s.replace("earn", "win");
        System.out.println("s2 = " + s2);//Lwin Java win money // bütün earn 'leri cevirir

        //Example 4 ; "s" String 'inde ki "a" harflerini "*" 'a ceviriniz
        String s3 = s.replace("a", "*");
        System.out.println("s3 ; " + s3);

        //2.yol
        String s4 = s.replace('a', '*');
        System.out.println("s4 = " + s4);

        //NOT;replace () metodunda coklu karakter ile calisirsaniz mecburen
        // cift tirnak kullanirsiniz.Ama tek karakter ile calisirsaniz cift
        // ya da tek tirnak kullanabilirsiniz.TABIKI tek tirnak daha iyi ama
        // ya ikiside cift tirnak ya da ikisi de tek tirnak olmali

        //Example  ; "s" String 'inde ki "n" harflerini "XXX" e ceviriniz.
        // Bu tür durumlarda mecbur biri coklu karakter oldugu icin ikiside cift
        // tirnak olur
        String s5 = s.replace("n", "XXX");
        System.out.println("s5 ; " + s5);


        //Example 6 ; "s" String 'inde ki bütün  "e" harflerini  siliniz.//hiclikle degis
        String s6 = s.replace("e", "");//Birseyi hic birsey yapmak onu
        // silmektir.
        System.out.println("s6 = " + s6);
        //Hic birsey char data type inde yok bu yüzden replace metodu kullanarak silme yaparsaniz
        // mutlaka cift tirnak yapiniz

        //Example  ; "t" String 'inde ki tüm rakamlari "*" a ceviriniz.
        //BIR GRUP DATAYI DEGISTIRMEK ISTERSENIZ replaceAll kullanmalisiniz
        // Burda replaceAll KULLANILIR (Cün ki tüm rakamlar bir gruptur)
        String t = "Ali 13 yasindadir";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);

        /*
        Bir grup datayi ifade etmek icn  "Regular Expressions" kisaltma regex
        Meshur Regex' ler ;(en basit en anlasilir ve en kullanilan)
        1)Tüm Rakamlar ===>[0-9]
        2)Tüm kucuk Harfler ===>[a-z]
        3)Tüm buyuk Harfler===> [A-Z]
        4)Tüm kucuk Harfler ve Tüm buyuk Harfler ===> [a-zA-Z]
        5)Tüm Harfler ve Tüm Rakamlar===>[a-zA-Z0-9]
        6)Tüm noktalama isaretleri ===> \\p{Punct}
        7)Tüm sesli Harfler ===>[aeiouAEIOU]//10 tane ; eger sadece calismak
        istedigimiz harfleri ifade etmek istiyorsak direk yan yana yaziyoruz
        mesela diyelimki ben rzgfh cikarmak istiyorum bunlari bu sekil köseli
        paranteze alacagim
        8)Kücük harflerden farkli tüm karakterler===> [^a-z]
        9)Tüm harflerden farkli tüm karakterler===> [^a-zA-z]
        10)Space disinda ki tüm karakterler===> \\S ya da [^ ]
  */

        //Example 8 ; t Stringindeki tüm rakamlari ve harfleri "!" ceviriniz

        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");

        System.out.println("t2 = " + t2);

        //Example 9 ; t Stringindeki tüm sesli  harfleri "?" ceviriniz

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");

        System.out.println("t3 = " + t3);

        // Example 10 ; t Stringindeki kucuk  harfler disindaki tüm karakterleri
        // "<>" ceviriniz

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println("t4 = " + t4);

        //Example 11: t Stringindeki tüm  harfler den farkli( disindaki) tüm karakterleri "+" ceviriniz

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println("t5 = " + t5);

        // Example 12;t Stringindeki tüm space'ler disindaki tüm karakterleri "ß" ceviriniz

        // 1.YOL Ahmet hoca
        String t6 = t.replaceAll("\\S", "ß");
        System.out.println("t6 = " + t6);

        //2.yol Süleyman hoca
        t6 = t.replaceAll("[^ ]", "ß");//Space var biz görmüyoruz ama
        // Java görüyor--->[^ ]
        System.out.println("t6 = " + t6);

        // NOTE ; Dolarin regex te farkli bir anlami varmis o yüzden birseyi dolara
        //cevirmiyor ya da dolari baska birseye cevirmiyor

        // Example 13 ; t Stringindeki sesli harflerler disindaki tüm karakterleri
        // "&" ceviriniz

       String t7 =  t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t7 = " + t7);

        System.out.println(t.replaceAll("[^19]", "*"));

    }
}
