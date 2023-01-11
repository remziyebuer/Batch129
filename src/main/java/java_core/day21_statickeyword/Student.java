package java_core.day21_statickeyword;

public class Student {

    /*
    1)static variable ya da static metodlar(bu ikisine birden 'clas member' denir)
     tum objeler icin ortak elemandir.
    2)static class memberlar uzerinde yapilan tum degisiklikler tum object'leri etkiler.
    3)static class memberlar Class' a non - static class memberler object'lere monte edilir.
    Mesela bir class 'tan 100 tane obje olusturdugunuzda non-static olanlar 100 kere olusturulur,
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur
    4)static class member lara ulasmak icin object olusturmaya gerek duyulmaz, ama non static
     class member 'lara ulasmak icin object olusturmak sarttir.
     5)static variable larin diger adi class variable dir non - static variable larin  diger adi
     instance variable ve ya object variable dir.
     */


//main olusturmadik onun yerine Runner class olusturduk.
    public static String  stdName = "Tom Hanks";
    public int age = 13;
 //Ogrencinin ilk harflerini alan ve bana veren metodu olusturunuz.
    public static String getInitials(String name){

        String first = name.substring(0,1);
        String second  = name.split(" ")[1].substring(0,1);

        return first + second;

    }

    //Ogrenci isminde ki sesli harfleri (a,e,i ,o,u) sayan bir metod olusturunuz

    public int countVowels(String name){

        int counter= 0;

        for (int i = 0; i < name.length(); i++) {

            char ch = name.toLowerCase().charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;

            }

        }
        return counter;
    }

}
