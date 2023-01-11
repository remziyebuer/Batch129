package java_core.day01_variables;

public class Variables01 {

    public static void main(String[] args) {
        //Package ismi kücük harflerden olusturulur asla büyük yapmayiz.
        //Class isimleri büyük harfle baslar asla kücük harfle baslamayiz.
        //Method isimleri ve variable isimleri camelCase ile yazilir.
        //________________________________
        System.out.println("Ali");
        System.out.println("Can");
        // Variable olusturmak
        // java cümlesi= Statement
        // Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Eger Variable Declaration yapar Assigment yapmaz isek
        // Java kendi degerölerini (default) koyar.Default degerler sayilar icin sifirdir
        //Stringler icin " default value" "null"dir yoklugun da yoklugu; bos küme her kümenin
        // altkümesi gibi
        //1.Data Type' ini yaziniz. 2.Variable ismini yaziniz   3.Atama Operatörü
        //4.Variable degeri   5.ingilizcedeki nokta gibi cümle sonu ; ile bitirilir
        int yas = 13;
        String studentName1  = "Ali Can"; // data type ile variable name arasinda  en az
        // bir karakter bosluk olmali fazla olunca da sorun olmaz.


         // HOCA 'NIN NOTLARI:
        // Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==". Yani Matematik'de "=", Java'dd "=="
        //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator(Atama Operatoru)  + Variable degeri ==> Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar.
        //Default degerler sayilar icin sifirdir.
        // Data Type'ini yaziniz   Variable ismi yaziniz  Assignment Operator(Atama Operatoru)   Variable degeri   Ingilizce'deki nokta gibi
                  int                      age                     =                                   13                   ;

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'lere verilen degerler cift tirnak icinde olmalidir.
        //String'ler icin "default value" "null" dir.
        String studentName = "Ali Can";

        /*
           Java'da temelde iki tip data vardir;
           1)primitive data type:
                char: Tek karakterler icin kullanilir. A, x, ?, 5
                boolean: boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
                byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir. (8 byte)
                float:
                double:
           2)non-primitive data type

        */

        //Ornek 2: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Note: char data type'inda degerler tek tirnak icine konulmlaidir
        char isminIlkHarf = 'A';

        //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1864184648;

        //Ornek 7: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;



    }

}
