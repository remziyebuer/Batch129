package java_core.lambdapractice_2;

import java.util.stream.IntStream;

public class Lambda04 {
    public static void main(String[] args) {
        System.out.println("sonuc 1 : " + birdenXeKadarToplam(10));
        System.out.println();
        System.out.println("sonuc 2 : " + birdenXeKadarTekSayToplam(10));
        System.out.println();
        System.out.println("sonuc 3 : " + birdenSonsuzaKadarTekSayIlkXtanesininToplam(3));
        System.out.println();
        System.out.println("sonuc 4 : " + birdenSonsuzaKadarCiftSayIlkXtanesininToplam(3));
        System.out.println();
        System.out.println();

    }

    //1) 1'den  x ' e kadar int degerleri akisa aliniz.(X dahil) toplamini bulun ve return edin
    public static int birdenXeKadarToplam(int x) {
        int sonuc1 = IntStream.range(1, x + 1).sum();
        return sonuc1;
    }

    //2) 1'den  x ' e kadar int degerleri akisa aliniz.(X dahil)tek sayilarin toplamini
    // bulun ve return edin
    public static int birdenXeKadarTekSayToplam(int x) {
        int sonuc1 = IntStream.rangeClosed(1, x).filter(t -> t % 2 != 0).sum();
        return sonuc1;

    }

    //3) 1'den  sonsuz ' a kadar giden  (X dahil)tek sayilardan ilk x tanesini  toplayiniz
    //sonucureturn ederek yazdiriniz.

    public static int birdenSonsuzaKadarTekSayIlkXtanesininToplam(int x) {
        int sonuc2 = IntStream.iterate(1, t -> t + 2).limit(x).sum();
        return sonuc2;

    }
//4) 2'den  sonsuz ' a kadar giden  (X dahil)cift sayilardan ilk x tanesini  toplayiniz
    //sonucu return ederek yazdiriniz.

    public static int birdenSonsuzaKadarCiftSayIlkXtanesininToplam(int x) {
        int sonuc3 = IntStream.iterate(2, t -> t + 2).limit(x).sum();
        return sonuc3;
    }
    //5) 5'den  sonsuz ' a kadar giden  kuvvetlerinden ilk x kuvvetinin  toplamini
    // return ederek yazdiriniz.

    public static int besdenSonsuzaKadarKuvvetIlkXKuvTop(int x) {
        int sonuc5 = IntStream.iterate(5, t -> t * 5).limit(x).sum();
        return sonuc5;
    }

    //6) x sayisinin faktoriyelini bulunuz.
    public static int faktoriyel(int x) {
        int sonuc6 = IntStream.rangeClosed(1, x).reduce(1, (a, b) -> a * b);
        return sonuc6;
    }

}