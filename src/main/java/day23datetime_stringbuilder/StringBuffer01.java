package day23datetime_stringbuilder;

public class StringBuffer01 {
    public static void main(String[] args) {
 /*
    String olusturmak icin String Class, StringBuilder class, ve StringBuffer kullanilabilir.
    1) StringBuffer Java'nin String uretmek icin olusturdugu ilk class'dir.Java 5 de uretilmistir.
    2) StringBuffer "syncronized" dir. StrinhBuilder "syncronized" degildir.
    3) StringBuffer "thread-safe" (multi-thread'e uygun )dir. StringBuilder "thread-safe degildir
    4) StringBuffer ve StringBuilder ikisi de mutable dir.

    Note 1: Immutable String lazim oldugunda  String Class kullaniliriz.
    Note 2: Mutable String lazım oldugunda StringBuilder veya StringBuffer kullaniriz.
    Note 3: StringBuffer "Multithread" ve "Synchronazition" lazim oldugunda tercih edilir.
            StringBuilder "Multithread" ve "Synchronazition" gerekmezse tercih edilir.

     */

            StringBuffer sbf = new StringBuffer("Java");
            System.out.println(sbf);

            System.out.println(sbf.capacity());//20




    }
}
