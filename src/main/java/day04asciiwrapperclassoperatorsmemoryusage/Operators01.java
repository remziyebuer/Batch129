package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    /*
    1) + , - , * , / islemleri Java da matematik te kullanildigi gibi kullanilir
    Note 1; int/int====>int olur*****baska kaba koysan bile islem ona göre yapilir
    int sayi1 = 5;
    int sayi2 = 2;   sayi1/sayi2=?
    int/int = 5/2=2.5 int cinsinden 2 olur double koysam double sonuc =2.0 sakin 2.5 yapma

    Note 2; double/int ===>double olur. Cünkü Java da matematiksel islemlerde farkli data
    type ' lari kullanilirsa sonuc buyuk data type inden olur.

    2)Java' da "logical operator" lar vardir.
    AND ( & )ve OR ( || ) islemleri 'logical operator' lerdir.AND isleminden "true" alabilmek icin
    hersey true olmalidir.Bir tane "false" varsa islemde sonuc false olur.
    OR isleminde bir tane true sonucu true yapmaya yeter.OR isleminde sonucun false
    olmasi icin hersey in false olmasi gerekir.
    Bir de NOT Operatoru (!) var.True olani false , false olani true yapar
    !true = false
    !false = true
    !!true = true iki tane Not birbirini sadelestiriyor

    3)Karsilastirma Operatorleri;
    > , < , >= , <= , == , !=
    Note;***Karsilastirma operatorlerini kullandiginiz da kesinlikle boolean alirsiniz
    baska birsey alamazsiniz.

    Note; Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
       Farklari nedir?
   "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
   "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
    Bu yuzden biz hep "&&" kullaniriz.

     */

    public static void main(String[] args) {
        boolean first = 3 < 5;
        System.out.println(first);
       boolean second = 2+3!=5;
        System.out.println(second);
        boolean third = 2+3*5>=19;
        System.out.println(third);
        System.out.println(first && second);
        System.out.println(first || second || third);

    }
}
