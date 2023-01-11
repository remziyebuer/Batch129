package java_core.day07_ifstatements;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {

       //Example 1:Haftanin ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay ismi giriniz");
        String monthName = input.next();
         //Biz Stringlerde Stringlerin esitliklerini kontrol ederken == yerine equals
        // metodunu kullaniriz*****
        //kullanici harflerin büyük kücüklügüne dikkat etmeyebilir.Bu durumda
        //equalsIgnoreCase () metodu kullanmak daha iyidir.
        if(monthName.equals("January") ){
            System.out.println(1);
        } else if(monthName.equalsIgnoreCase("Februar")) {
            System.out.println(2);
        }  else if(monthName.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(monthName.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(monthName.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(monthName.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(monthName.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(monthName.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(monthName.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(monthName.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(monthName.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(monthName.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Invalid mont name...");
        }
//interwievlerde sorulur...
/*
Note: String'lerin esitliklerini kontrol ederken "==" yerine "equals()" kullaniriz.
      Niye ?
      Cunku; "==" sembolu iki String'i karsilastirirken hem adres'lerine hem de degerlerine bakar,
      ikisi de ayni ise siz String'ler esittir der ama biz code yazarken genellikle String'lerin
      adres'leri ile degil degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.

      "equals()" metho'u ise iki String'i karsilastirirken sadece degerlerine bakar, degerler ayni ise
      bu iki String esittir der degerler farkli ise bu iki String farklidir der ki bu bizim kod yazarken
      ihtiyac duydugumuz seydir.
 */

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t); //false cunku ; 1)adres'leri ve degerlerI  karsilastirir farkli false
        System.out.println(s.equals(t)); //false cünkü degerler farkli sadece degerleri karsilastirir adreslere
        //bakmaz.o yüzden bu saglikli önemli olan deger adrese bakinca deger ayni olsa bile adres farkli
        // diye Java yanlis der o yüzden== kullanmayiz.

        System.out.println(s==r);//false cünkü adres'ler farkli
        System.out.println(s.equals(r));//true cünkü equals() sadece degerlere
        // bakar. "s" ve "r" nindegerleri ayni oldugundan true verir.

        System.out.println(s==m);//true //VAROLAN STRINGI KULLANMAYA String Pool DENIR.
        // cünkü ayni yere iki tane koymus



    }
}
