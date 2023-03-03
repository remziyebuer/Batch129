package java_core.day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {
      // Course class indan  objeler uretecem ve onunla calisacam.
        Kurs kursTurkishDay = new Kurs("Summer", "Turkish Day", 87, 128);
        Kurs kursTurkishNight = new Kurs("Winter", "Turkish Night", 98, 154);
        Kurs kursEnglishDay = new Kurs("Spring", "English Day", 95, 132);
        Kurs kursEnglishNight = new Kurs("Winter", "English Night", 93, 144);

        List<Kurs> coursesList = new ArrayList<>();
        coursesList.add(kursTurkishDay);
        coursesList.add(kursTurkishNight);
        coursesList.add(kursEnglishDay);
        coursesList.add(kursEnglishNight);
        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz.
       boolean result1 =  coursesList.stream().allMatch(t->t.getAverageScore()>91);//pojo classtan cagirdik.
        System.out.println(result1);//false

        //2) Kurs isimlerinden en az birinin "Turkisch" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
      boolean result2= coursesList.stream().anyMatch(t->t.getCourseName().contains("Turkish"));//true
        System.out.println(result2);

        //3) Avarage score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz.

        String name = coursesList.
                stream().
                sorted(Comparator.comparing(Kurs::getAverageScore).reversed()).
                findFirst().//ilk elemani bul al
                get().//Optional olarak verir ondan get metodu kullan
              getCourseName();//kurs isimlerini alacaz.koymaz isek butun hepsini kursun detayalarini yazdirir
        //su sekilde;Course: Season=Winter, courseName=Turkish Night, averageScore=98, numberOfStudents=154
        //butun kursun detaylarini alacaksam data type ni de String degil Course yapmaliyim.
        System.out.println(name);//Turkish Night

        //4)Tum Course objelerini avarage score göre kucukten buyuge diziniz ve ilk ikisi haric
        // liste halinde console'a yazdiriniz.
        List<Kurs> myList = coursesList.
                stream().
                sorted(Comparator.comparing(Kurs::getAverageScore)).
                skip(2).//skip ing. bosver demek ilk 2 yi bosver.
                collect(Collectors.toList());//liste halinde yazdir
        System.out.println(myList);

        //5)Tum Course objelerini avarage score göre kucukten buyuge diziniz ve ilk ucunu
        // liste halinde console'a yazdiriniz.
List<Kurs> yourlist = coursesList.
        stream().
        sorted(Comparator.comparing(Kurs::getAverageScore)).
        limit(3).//üce kadar alir
        collect(Collectors.toList());

        System.out.println(yourlist);

        //6)Tum Course objelerini avarage score göre kucukten buyuge diziniz ve ucuncuyu consol'a yazdiriniz
        Kurs result5 = coursesList.
                stream().
                sorted(Comparator.comparing(Kurs::getAverageScore)).
                skip(2).
                limit(1).
                findFirst().
                get();
        System.out.println(result5);//skip ve limit
        // ' i beraber alarak istedigimiz elemani alabiliriz.


    }

}
