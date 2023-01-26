package java_core.day31_collections;

import java.util.HashSet;

public class HashSet01 {
    /*
    Hash bir teknik tir biz bu teknigi kullanarak unic datalar üretiriz.
    Ornegin univ.ler  ögrenciler icin ID uretir yil-ünikod-bölümkod-bolumegirissirasi=20223811813
    bu hasching teknik ile üretilen hashcode dur.Java da hashing teknik ile java hash code uretir data ayni
     ise bile farkli kod üretir unic'tir
    set; tekrarsiz data demektir.Arraylist ve LinkedList te tekrarli data koyabiliyorduk ama Set bunu
    kabul etmiyor.Tekrarli olamayan data icin en uygun kab Set ' tir.plakalar, telefon numaralari,
     tc numaralar, e mail adresleri tekrarsiz oldugu icin bunun icin en iyi kap Set 'tir.
     Set 'ler üce ayrilir;

     1.HashSet:Super hizlidir.Cün ki HashSet'ler verdiginiz elemanlari siralamak icin ne zaman kaybetmez
     yani HashSet'lere eklenen elemanlar rastgele siralanirlar.(kitaplari kucaklayip kitapliga koymaya
     benzer)ör:ögrenci emailleri icin siralamaya gerek
     yok .koy HashSete gitsin.tekrarli elemana izin vermez.cun ki bir Set'tir.
     null'i eleman olarak kabul eder ama sadece bir tane.bunda da tekrara izin vermez.

     2.LinkedHashSet:Elemanlari "insertion order"(sizin girdiginiz siraya göre birer birer
     kitaplari kitapliga koymak gibi zaman harcar).HashSet' e  göre yavastir.tekrara izin vermez.

     3.TreeSet:elemanlari "natural order"(kucukten büyüge ya da alfabetik sira ) a göre dizer
     IT dünyasinda tree görürsen aklina naturalorder gelsin tree= soyagaci gibi siralama ister.
     bu yüzden cok zaman harcar o yüzden en yavas Set'tir tekrara izin vermez.

     */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(638);
        hs.add(39);
        hs.add(5);

        System.out.println(hs);//elemanlar rastgele siralandi.(az sayida eleman oldg. farkli zaman ve bilg. ayni
        //siralamayi yapabiliyor ama cok fazla sayi varsa binlerce mesela her seferde farkli cikar)

        // hs yazip nokta koyarsaniz parent tan alinan metodlari da görebilirsiniz daha önce ögrendigimiz add,
        //remove, clear...etc  gibi metodlar var
        hs.hashCode();//hashSetler hash code üretirdi bunu görmek icin bu metodu kullaniriz.bu javada
        // bu list icin hashcode ' u verir ama bu kodun icindeki elemanlarin her biri data oldugu icin
        // onlarin da bir hash code 'u vardir(bu code lari bilmeye gerek yok sadece mantigini bilin javanin
        // diye anlatiyor hocamiz)
        //acilan kutuda koyu renkli olan metodlar kendi sinifinda var olan metodlar gri olanlar parent'tan aldigi.
    }

}
