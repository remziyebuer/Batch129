package java_core.lambdapractice_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {

        Apartman daire01 = new Apartman("dogu", 1, 7000);
        Apartman daire02 = new Apartman("bati", 2, 10000);
        Apartman daire03 = new Apartman("guney", 3, 12000);
        Apartman daire04 = new Apartman("guney", 5, 15000);

        List<Apartman> daireler = new ArrayList<>
                (Arrays.asList(daire01, daire02, daire03, daire04));

        System.out.println("sonuc 1 : " + tumDaireKira5000denBuyukIseTrue(daireler));
        System.out.println();
        System.out.println("sonuc 2 : " + enAzBirininKatsayisiIkiIseTrue(daireler));
        System.out.println();
        System.out.println("sonuc 3 : " + cephesiDoguOlanlarinSayisi(daireler));
        System.out.println();
        System.out.println("sonuc 4 : " + katSayisinaGoreBuyuktenKucugeSirala( daireler));
        System.out.println();
        System.out.println("sonuc 5 : " +katSayisiIkidenFazlaOlanKiraGoreSirEnBuyKiraListOlYazdir(daireler));
        System.out.println();
        System.out.println("sonuc 6 : " +
                katSayisiUctenAzOlanKiraGoreKucBuySirEnKucKiraListOlYazdir(daireler));
    }

    //1)Tum dairelerin kiralari 5000 den buyuk ise return ederek true yazdiriniz.

    public static boolean tumDaireKira5000denBuyukIseTrue(List<Apartman> daireler) {
        boolean sonuc1 = daireler.stream().allMatch(t -> t.getKira() > 5000);
        return sonuc1;
    }

//2)Dairelerden en az birinin katsayisi iki ise return ederek true yazdiriniz.

    public static boolean enAzBirininKatsayisiIkiIseTrue(List<Apartman> daireler) {
        boolean sonuc2 = daireler.stream().anyMatch(t -> t.getKatSayi() == 2);
        return sonuc2;
    }

//3)Dairelerden cephesi dogu olanlarin sayisini return ederek true yazdiriniz.
// (cephesi dogu olanlar demek bir filter metodu gerektirir sayisini aldirmak icinde count
// metodu kullanmaliyiz)

    public static long cephesiDoguOlanlarinSayisi(List<Apartman> daireler) {
     long sonuc3 = daireler.stream().filter(t->t.getCephe().contains("dogu")).count();

        return sonuc3;
    }
//4)Daireleri katsayisina göre buyukten kucuge siralayiniz.(siralama sorted metodu kullanilir)

    public static List<Apartman> katSayisinaGoreBuyuktenKucugeSirala( List <Apartman>daireler){
     List<Apartman> sonuc4 =daireler.stream().sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).
                collect(Collectors.toList());
     return sonuc4;
    }
//5)Kattsayisi ikiden fazla olan daireleri kiraya göre buyukten kucuge siralayiniz.en buyuk kirayi
// list ile return et(siralama sorted metodu kullanilir sonra limit ile en buyuk alinir )

    public static List<Integer>  katSayisiIkidenFazlaOlanKiraGoreSirEnBuyKiraListOlYazdir(List <Apartman>daireler){
        List<Integer> sonuc5 = daireler.
                stream().
                filter(t->t.getKatSayi()>2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).
                map(t->t.getKira()).collect(Collectors.toList());

        return sonuc5;
    }
//6)Katsayisi ucten az olan daireleri kiraya gore kucukten buyuge siralayiniz en kucuk kirasinini list halinde
// return ederek yazdiriniz

    public static List<Integer> katSayisiUctenAzOlanKiraGoreKucBuySirEnKucKiraListOlYazdir(List <Apartman>daireler){
        List<Integer> sonuc6 = daireler.
                stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t->t.getKira()).collect(Collectors.toList());

        return sonuc6;
    }
}
