package advanced_java.practice13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Q02_Map_Aile {
    public static void main(String[] args) {


//Ad-Soyad-Yaş ve kardeşler listesini tek bir Map içerisinde saklayan bir kod yazınız.
        //önbilgi
        /*
        Map<String, String> adSoyad = new HashMap<>();

        adSoyad.put("Ali", "Can");

        System.out.println("adSoyad = " + adSoyad);

        Map<Map<String, String>,Integer> adSoyadYas = new HashMap<>();

        adSoyadYas.put(adSoyad, 12);
        System.out.println("adSoyadYas = " + adSoyadYas);
        */

        Aile ali = new Aile("Ali", "Can", 12, "Ahmet", "Hayriye");//constructor ile obje oluşturdum
        System.out.println("ali.getAileMap() = " + ali.getAileMap());

        Aile veli = new Aile("Veli", "Han", 15, "Mehmet, Hatice, Hasan, Huseyin");

        System.out.println("veli.getAileMap() = " + veli.getAileMap());

        Aile ayse = new Aile("Ayse", "Kan", 35, "Fatma");
        System.out.println("ayse = " + ayse);//tostring methodundan yararlandık
    }

}