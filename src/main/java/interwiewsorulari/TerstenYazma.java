package interwiewsorulari;

public class TerstenYazma {
    public static void main(String[] args) {
        //Soru; Size verilen bir String ' i tersten yazdiriniz.

        String s = "Germany";
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i);

            System.out.print(ch);

        }
        //Kesin interwiew sorusus bunu tek cözemeden sakin interwiew' e girme
        //Soru 2: Stringi tersten yazdirip memory de saklayin


        String duz = "Java";
        String ters = "";

        for (int i = s.length() - 1; i >= 0; i--) {


            ters += duz.charAt(i);

        }

        System.out.println(ters);//ters'in son halini görmek icin ters ' i yi for döngüsünun
        // sonuna koyunuz.Eger asamali hallini görmek isterseniz loop un icine  yazdiriniz
        //Biz sona yazdirmayi tercih ederiz ama bize soran dese ki loop un icine koyarsak ne olur
        //Tabiki her degisimi asamali sekilde gösterir diyecez

        //Soru 3 interwiew; Size verilen bir String' in PALINDROME olup olmadigini kontrol eden
        // kodu yaziniz
        // Interwiew de soruyu bir iki dakika sesli düsün Adam mantigi merak
        // eder söylerseniz cogu zaman kodu yazma der.Direk kod yazarsan sana bir sürü
        // soru sorup izah bekler.Cünkü adam ezberleyip ezberlemedigini merak eder topu
        // sahanda tut kod yazarsan topu ona atarsin. Ya sana  sut cekerse!

        //LOGIC: String ' i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise
        // "Palindrome " de.

        String duz1 = "civic";
        String ters1 = "";


        for (int i = duz1.length() - 1; i >= 0; i--) {
            ters1 += duz1.charAt(i);

        }//Bu Loop bittiginde artik ters1'in icinde duz1'in tersi olacak.

        if (duz1.equals(ters)) {
            System.out.println(duz1 + "Palindrome'dur");//Dinamik kod yazalim.
        } else {
            System.out.println(duz1 + "Palindrome degildir");
        }
        //Büyük-kücük harf duyarsiz olsun istersek equalsignorecase() kullanacagiz
        //Tek karakter her zaman palindrome' dur. kk--->palindrome 'dur

    }
}
