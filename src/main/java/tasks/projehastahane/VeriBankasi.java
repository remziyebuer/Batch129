package tasks.projehastahane;

import java.util.HashMap;
import java.util.Map;

public class VeriBankasi {



    static Map<Integer, String> hastaMap =new HashMap<>();
    public static void hastaMapEkle(){
        hastaMap.put(111,"Aykut, Adali, Alerji");
        hastaMap.put(222,"Salih, Bas, Bas agrisi");
        hastaMap.put(333,"Hasan, Kacan, Diyabet");
        hastaMap.put(444,"Ayse, Gun, Soguk alginligi");
        hastaMap.put(555,"Ömer, Kizilirmak, Migren");
        hastaMap.put(666,"Ali, Can, Kalp");

    }
    //***********************************
    static Map<String, String> doktorMap =new HashMap<>();
    public  static void doktorMapEkle(){
        doktorMap.put("32651498772","Mustafa, Dogan, Allergist");
        doktorMap.put("78965413644","Nihat, Gunes, Norolog");
        doktorMap.put("36985214745","Hamit, Yilmaz, Genel Cerrah");
        doktorMap.put("74125836934","Sevil, Sahin, Cocuk Doktoru");
        doktorMap.put("36925814765","Remziye, Bur, Dahiliye");
        doktorMap.put("98745632121","Mehmet, Yildirim, Kardiyolog");

    }


   /* String [] doctorIsimleri ={"Mustafa","Nihat","Hamit", "Sevil","Remziye", "Mehmet" };
    String [] doctorSoyIsimleri ={"Dogan","Gunes","Yilmaz", "Sahin","Bur", "Yildirim" };
    String [] unvanlar ={"Allergist","Norolog","Genel Cerrah", "Cocuk Doktoru","Dahiliye", "Kardiyolog" };
    String [] hastaIsimleri ={"Aykut","Salih","Hasan","Ayse","Ömer","Ali" };
    String [] hastaSoyIsimleri ={"Adali","Bas","Kacan","Gun","Kızılırmak","Can" };
    String [] durumlar ={"Alerji","Bas agrisi","Diyabet", "Soguk alginligi","Migren", "Kalp hastaliklari" };

    int[] hastaIDleri ={111,222,333,444,555,666};*/
}