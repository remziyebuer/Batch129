package advanced_java.practice13;

import java.util.Arrays;
public class Q03_Enum_BeslenmeEgzersiz {
//Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
//20 saat üstü egzersiz yapılacak ayları ekrana yazdırınız.
public static void main(String[] args) {
  /*
        System.out.println("BeslenmeEgzersiz.Agustos = " + BeslenmeEgzersiz.Agustos);
        System.out.println("BeslenmeEgzersiz.Ekim.toplamEgzersizSaati = " + BeslenmeEgzersiz.Ekim.toplamEgzersizSaati);
        System.out.println("Arrays.toString(BeslenmeEgzersiz.values()) = " + Arrays.toString(BeslenmeEgzersiz.values()));

        System.out.println("BeslenmeEgzersiz.values()[1] = " + BeslenmeEgzersiz.values()[1].ayinMeyvesi);
        System.out.println("BeslenmeEgzersiz.Subat.ayinMeyvesi = " + BeslenmeEgzersiz.Subat.ayinMeyvesi);
*/

    for(BeslenmeEgzersiz w:BeslenmeEgzersiz.values()){
        if(w.toplamEgzersizSaati>20){
            System.out.println(w);
        }
    }



}
}
