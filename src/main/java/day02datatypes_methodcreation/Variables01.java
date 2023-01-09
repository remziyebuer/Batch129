package day02datatypes_methodcreation;

public class Variables01 {

    public static void main (String[]args){
        //ör; Gömlek ve ayakkabi fiyatlari icin iki tane variable oluturup
        // tplam fiyati ekrana yazdiriniz
       //Java ondalikli sayilari otomatik olarak double kabul eder.
        // Siz data type ni "float" yazarsaniz hata verir.
        // float olmasinda israr ediyorsaniz "F" ya da "f"koymalisiniz
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        System.out.println(shirtPrice+shoesPrice);
        // anlami: sistemin bilgisini al disariya yazdir demek.
        //System.out.println(); ekrana yazdirir ve "pointer"i  bir sonraki satira koyar.
        // System.out.print(); ekrana yazdirir ve "pointer"i  ayni satira  satirda tutar
        // orn 2; hücre agirligi ve amipin agirligi icin iki tane
        // Variable olusturun ve agirliklarini ekrana yazdiriniz

        double weightCell = 0.000000000000112;
        double weigtAmip = 0.000000000000023;
        System.out.println(weightCell- weigtAmip);//8.9E-14 ==>"8.9 carpi10 üzeri -14 E --> Exponent
        //BUNUN ANLAMI VIRGÜLDEN SONRA 14 RAKAM OLMALI 0.00000000000008

        //INTERVIEW NOTE;
        // Note; primitive data type ' larini Java olusturmustur
        //Note; primitive data type 'larinin isimlerinde sadec   kücük harf kullanilir.
        //Note;primitive data 'lar data type'lara gore memory de farkli farkli yer kaplarlar
        //Note; primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar



    }






}
