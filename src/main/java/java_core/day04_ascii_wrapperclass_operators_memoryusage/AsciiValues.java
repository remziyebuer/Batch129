package java_core.day04_ascii_wrapperclass_operators_memoryusage;

public class AsciiValues {
    //Java da her karakterin sayisal bir degeri vardir.
    //Bu degerler ASCII Deger'ler olarak adlandirilir.
    //Bu degerlerin tamaminin bulundugu tabloya ASCII Table denir.

    public static void main(String[] args) {
        //Herhangi bir character' in ASCII degerini bulmak icin o karakteri
        // "int" data type ' inde bir variable'in icine koyunuz.
        char ch = 'A';
        System.out.println(ch);// A
        int ch1 ='A';
        System.out.println(ch1);//65

        int unlem ='!';
        System.out.println(unlem);//33

        char c1 = 'K';
        char c2 = '?';
        //Java'da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin
        // ASCII degerlerini kullanir.
        System.out.println(c1 + c2); //138
        //BUNUN ÖNÜNE GECMEK ICIN BOS STRINGI BASA EKLERIZ
        System.out.println("" + c1 + c2); //K?
    }

}
