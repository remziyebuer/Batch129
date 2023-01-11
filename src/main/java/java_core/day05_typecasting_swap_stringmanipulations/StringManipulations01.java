package java_core.day05_typecasting_swap_stringmanipulations;

public class StringManipulations01 {
    //String bir non - primitive data type 'dir ve ayni zamanda bir class' dir.
    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1; "s" String inde ki tüm karakterleri  büyük harf yapiniz.
        String sUpper = s.toUpperCase();//
        System.out.println(sUpper); // JAVA IS EASY

        //Example 2; "s" String ' inde ki tüm karakterleri kücük harf yapiniz
        String sLower = s.toLowerCase()

                ;
        System.out.println(sLower); //Java is easy

        //Example 3; "s" String' inde ki ilk character ' i aliniz.
        //bir stringde herhangi bir karakteri almak icn charAt() kullanilir
        char firstchar = s.charAt(0);
        System.out.println(firstchar); // J
        // Example 4; "s" String ' inde ki ikinci ve sondan ikinci characteri aliniz
        // ve ekrana yan yana yazdiriniz.

        char secondChar =s.charAt(1);//a
        char secondLastChar = s.charAt(10);

        // 1.yol
        System.out.print(secondChar); //print yazdik yan yana olsun diye
        System.out.println(secondLastChar);

        //2.yol
        System.out.println("" + secondChar +secondLastChar);

        //Example 5 ; "s" String ' inde kullanilan character sayisini bulunuz.

        int sLength =s.length();//index 0 'dan karakter sayma 1'den baslariz
        System.out.println(sLength);

        //Example 6 ; "s" String ' indeki ilk 4 charachteri aliniz.
        //substring ; alt string anlamindadir.
        String sub1 = s.substring(0,4);//substring 0 'dan baslar yani ilk index dahil,
        System.out.println(sub1);      // ikinci index harictir (0,4)

        //Example 7 ; "s" String ' indeki "is" kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);


        //Example 8 ; "s" String ' indeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //2.yol
        String sub4 = s.substring(8);
        System.out.println(sub4);
        //Bir charachter'den baslayip String ' in sonuna kadar almak isterseniz,
        // ikinci index ' i yazmayiniz gerek yok.ZATEN hepsini alir bu sekilde.

        //Example 9 ; "s" String ' inde "money" kelimesinin var olup olmadigini
        // kontrol ediniz
        boolean isExit = s.contains("money");
        System.out.println("isExit = " + isExit);

        boolean isExit1 = s.contains("easy");
        System.out.println("isExit = " + isExit1);

        boolean isExit2 = s.contains("e");//sadece bir harfide yoklayabiliriz
        System.out.println("isExit = " + isExit2);

        boolean isExit3 = s.contains(" ");
        System.out.println("isExit = " + isExit3);//cünkü metnimde boslukda var.

        boolean isExit4 = s.contains("");//hiclik te de true cikar
        System.out.println("isExit = " + isExit4);


        /*
        Bir method u ögrenirken üc seyi mutlaka ögrenin.
        1.Bu method ne is yapar
        2.Bu method 'un farkli kullaimlari nasildir
        3.Bu method size ne return eder
        Methodlar hakkin da bu üc seyi ögrenirseniz.......?
         */
        //Example 10; "s" String 'inin  belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println("isStart = " + isStart);//true

        boolean isStart1 = s.startsWith("JAVA");
        System.out.println("isStart = " + isStart1);//false

        boolean isStart2 = s.startsWith("");
        System.out.println("isStart = " + isStart2);//true; CÜNKÜ Java dan önce hiclik vardir

        //Example 11 ; "s" String 'inin 6.charachterden itibaren belli bir harfle baslayip
        // baslamadigini kontrol ediniz.
        boolean isBegin= s.startsWith("i",5);
        System.out.println("isBegin = " + isBegin);




    }








}
