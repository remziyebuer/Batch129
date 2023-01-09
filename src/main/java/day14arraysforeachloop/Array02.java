package day14arraysforeachloop;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        // Example; Integer Array olusturunuz , icine 6 tane eleman yerlestiriniz
        //BU elemanlarin en kücügü ile en büyügünun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[12, 23, 19, 44, 15, 32]
        //öGRENCILERIN BOY UZUNLUGU EN AZ VE COK OLANI BULMAK ICIN ONLARI BOY SIRASINA
        // KOYARIZ tipki bunun gibi array i de siralariz 15 19 20 23 32 44
        //Daha sonra da ilk index li ve son index liyi buluruz ve toplariz
        //Peki elemanlari nasil siralayacaz Arrays. yaz nokta koy sort() metodunu sec
        // icine Array in adini yaz--> Arrays.sort(array'in ismini yazin) böylece
        // otomatik siralar

        Arrays.sort(ages);//1.yolda sort ile siraladik bu metod önemli cok kullanilir
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]
        System.out.println(ages[0] + ages[ages.length - 1]);//59

        // 2.yol://MAT KLASTAKI KARSILASTIRMA METODUNDAN FAYDALANDIK***
        //Bir min kutusu olustur icine ilk sayiyi min kabul et koy
        //Kutuda ki sayiyi 2. ile karsilastir kücügünü bul kutuya koy
        //Kutuda ki sayiyi 3.sayi ile karsilastir min' i bul kutuya koy
        //Kutuda ki ile 4.sayiyi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 5.sayi yi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 6.sayi yi karsilastir min' i bul kutuya koy

        int minimum = ages[0];
        int maximum = ages[0];
        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);
        }
//sort() cok zahmetlidir.Biz 6 eleman verdik ama Array 5000 elemanli da olabilir.
// Siralama her zaman java yi yavaslatir.Unutmamamiz gereken  kuralimiz : Bir konu
// hakkinda java method olusturmus ise bu en iyisidir.Bu yüzden ikinci yolu
// tercih ederiz

    }
}
