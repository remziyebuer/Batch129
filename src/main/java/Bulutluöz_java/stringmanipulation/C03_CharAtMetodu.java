package Bulutluöz_java.stringmanipulation;

public class C03_CharAtMetodu {
    public static void main(String[] args) {
        String str = "Java Candir";

        System.out.println(str.charAt(0));// ilk harfi verir--> J
        System.out.println(str.charAt(5));//5. index' deki char 'i verir--->C
        System.out.println(str.charAt(10));//bana sonuncu char i verir-->r
        /*
        Bir metinde ki karakter sayisi ile son index arasinda 1 fark vardir
        Index= karakter sayisi-1
        index yerine yanlislikla karakter sayisini girersek son harf icin
        index Striig in disindadir diye hata mesaji aliriz
         */
        System.out.println(str.charAt(11));//StringIndexOutOfBoundsException
    }
}
