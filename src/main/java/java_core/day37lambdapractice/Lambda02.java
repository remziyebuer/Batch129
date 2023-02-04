package java_core.day37lambdapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {
        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek",
                "greyfurt","nar", "mandalina","armut","elma","keciboynuzu","elma"));










    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari,
    // Method References ile aralarında bosluk bırakarak yazdıralım

    public static void ilkHarfeVeyaC(List<String> meyve){
        meyve.stream().map(t->t.startsWith("e")||t.startsWith("c")).forEach(Utils::yazdir);

    }
// SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
// karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static  void karakterSayGöreBüyüktenKucugeSiralaKarakterSayEnBuyukIlk3aL(List<String> meyve){

                                                                                                                                                                                                                                                                                                                                                                               
/*
java akıştan gelen elemanlar ya String değilse diye tedirgin oluyor o yüzden toString methodu ekliyoruz.
 */
    }
}
