package java_core.day09_incrementdecrement_ternary_switch;

public class NestedTernary01 {

    public static void main(String[] args) {

        //Condition ?        Code1                :                Code2;

        //Condition ?  Condition? Code1:Code2    :     Condition ? Code1 : Code2;

        //Interwiew sorusu:
        // Verilen yilin  "Artik yil"(Leap year) olup olmadigini kontrol eden kodu yaziniz
        // 1) Yil 100 ' e bolunurse 400' e bölunmelidir. 1600==>Leap  1800==>Leap degil
        // 2)Yil 100 ' e bölünmüyorsa 4' e bölünmelidir. 2004 ==>Leap 2005 ==>Leap degil

        int year = 1600;
        String result = ( year % 100 == 0 ) ? (year%400 == 0 ? "Leap" : "Not leap") :
                (year %4 == 0? "Leap":"Not Leap");

       //Sertifika sinavinda bunu parantezsiz sorarlar BUNLARI OKUMAYI ÖGRENMELISINIZ
    }
}
