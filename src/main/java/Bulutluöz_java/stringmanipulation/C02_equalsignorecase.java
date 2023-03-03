package Bulutluöz_java.stringmanipulation;

public class C02_equalsignorecase {
    public static void main(String[] args) {
        String str1 = "ALI";
        String str2 = "Ali";
        String str3 = "ali";
        String str4 = "Ali";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));// true
        /*
        Sadece büyük/kücük harf farkliliklarini ignore eder.Farkli bir karakter bulunmasi
        durumunda false döner.Buna Spece de dahil.

        "ali" != " ali" ya da "ali " ya da "a li"

         */




    }
}
