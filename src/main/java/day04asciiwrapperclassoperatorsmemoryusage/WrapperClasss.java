package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClasss {

        public static void main(String[] args) {
            //Java müsteriler icin primitive' leri  update ederek wrapperclass'lari olusturmustur.
            // Cünkü primitive'lerin yaninda metodlar kullanilmak istenmis.
            //primitivelerin bas harfi büyük olunca Wrapperclass a dönüsmüs olur.Yalnizca int--->Integer
            //ve char---->Character olarak yazilir digerleri ayni.
            //Wrapper Class'lar non-primitive'dir.o yüzden memory de cok yer kaplarlar.O yüzden sart degilse Wrapper
            //Class kullanmayi tercih etmeyiz.
            //metod olup olmadigini kontrol etmek icin bir primitive bir de wrapper olusturup isim verin
            //verdiginiz ismi alt satira yazip nokta koyuyoruz cikan kutuda metod parantezli isimler
            // varsa metod iceriyordur.

            int n = 12;// n yazip nokta koyarsak metod göremeyiz, cünkü primitiveler method icermez
            Integer m = 12;// m yazip nokta koyarsak bircok metod görürsünüz,cünkü wrapper class lar method icerir.
            byte p = 23;
            Byte r = 43;

            //Example 1; short dat type nin min ve max degerini kod yazarak bulunuz
            short enKucukDeger = Short.MIN_VALUE;
            System.out.println("enKücükDeger = " + enKucukDeger);
            short enBuyukDeger = Short.MAX_VALUE;
            System.out.println("enBuyukDeger = " + enBuyukDeger);

            //Example 2; int data type' nin minimum degeri ile byte data tyoe nin max degeri toplami

            int intMin = Integer.MIN_VALUE;
            byte byteMax = Byte.MAX_VALUE;
            System.out.println("intMin+byteMax = " + intMin + byteMax);

            //Example 3; int' i Integer' a ceviriniz
            int num = 22;
            Integer wrapperNum = num;//primitive wrapper ' a dönüstürdük.(Autoboxing)
            System.out.println("wrapperNum = " + wrapperNum);//22
            //Example 4; Byte ' i byte ' a ceviriniz.

            Byte k = 43;
            byte primitiveK = k;
            System.out.println("primitiveK = " + primitiveK);//43
            // unboxing yaptik.(kutudan cikarma)
            // Example 5; char ' Character ' e ceviriniz
            char initial = 'A';
            Character initialWrapper = initial;
            System.out.println("initialWrapper = " + initialWrapper);

            Boolean isOld = true;
            boolean isOldprimitive = isOld;
            System.out.println("isOldprimitive = " + isOldprimitive);

            //Example 6; Size String olarak verilen iki fiyat'in toplamini ekrana yazdiriniz.
            String shirt = "2300";
            String shoes = "5200";
            //JAVA 'da +--->birlestirme(Concatenation) ya da toplama yapar.
            //iki sayi arasindda kullanilirsa toplama yapar, iki string arasinda ya da bir String bir
            // sayi arasinda kullanilirsa Concatenation olur.
            //Note; Concatenation islemlerinde Java islem önceligi kurallarini kullanir.
            //kurallar;1.önce uslu sayilar 2.parantez ici 3.Carpma ve bolme 4.Toplama ve cikarma

            int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

            System.out.println("toplamFiyat = " + toplamFiyat);

            //Example 7; Size String olarak verilen iki fiyat in toplamini ekrana yazdiriniz.
            String tv = "$11000";
            String radio = " $3000";
            //  int totalPrice = Integer.valueOf(tv)+Integer.valueOf(radio);//$ isareti oldugu icin hata verir
            // cünkü valueOf method ' u tüm karakterleri rakam olan Stringleri sayiya cevirir.Stringin icinde
            //rakamin olmadigi bir karakter koyarsaniz hata alirsiniz.Bu hatayi düzeltmeyi daha sonra ögrenecegiz

            //benim denemem
            String tv2 = "6000";
            String radio2 = "3000";

            int fiyatTv2 = Integer.valueOf(tv2);
            int fiyatRadio2 = Integer.valueOf(radio2);

            System.out.println("Toplam fiyat = " + (fiyatRadio2+ fiyatTv2));

      // Soldan saga java
       /*
       8 + 3 + "K" ---->11K yazdirir
       8 + "K" + 3 ----->8K3 yazdirir
       "K" + 8 + 3 ----> K83 yazdirir ama dikkat "K" + 3*8 --->carpmanin önc.var
       önce carpmayi yapar sonra concat yapar ve  K21 yazdirir
       Note; Concatenation islemlerinde Java islem önceligi kurallarini kullanir.
        */














        }
    }

