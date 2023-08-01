package advanced_java.practice13;

import java.util.*;
public class Aile {
    //sorunun cevabı-normalde bu soru böyle çövzülmezmiş ama öğretmek amacıyla böyel yapmış:)
    //        ad     Soyad                  kardeşler

    private Map<String,String> adSoyad = new HashMap<>();
    private List<String> kardeslerList = new ArrayList<>();
    private Map<Integer, List<String>> yasKardesler= new HashMap<>();
    private  Map<Map<String,String>,Map<Integer, List<String>>> aileMap = new HashMap<>();//burası için iki map'e ihtiyacım var

    public Aile(String ad, String soyAd,int yas, String... kardesler){

        adSoyad.put(ad, soyAd);
        Collections.addAll(kardeslerList,kardesler);
        yasKardesler.put(yas, kardeslerList);
        aileMap.put(adSoyad,yasKardesler);

    }

    @Override
    public String toString() {
        return aileMap.toString();
    }

    public Map<Map<String, String>, Map<Integer, List<String>>> getAileMap() {
        return aileMap;
    }
}
