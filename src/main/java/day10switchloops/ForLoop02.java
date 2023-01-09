package day10switchloops;

public class ForLoop02 {
    public static void main(String[] args) {

        // Example 2; 11 'den 14' e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i = 11; i < 15; i++) {
            System.out.println(i);
        }

//Example 3: 40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 40; i > 22; i--) {

            if (i % 2 == 0) {
                System.out.println(i);//Eger cift ise yazdir
            }
        }
//Example 4: 18'den 56'ya kadar tum tek tamsayilari ekrana yazdiran kodu yaziniz

        for (int i = 18; i < 57; i++) {

            if (i % 2 != 0) { //tek sayilar icin bu sekil kullanilmali genel olmali
                System.out.println(i + " ");

            }
        }
//yanyana yazdirmak icin  "ln" silinir ve bosluk eklenir --> System.out.print(i + " ");

    }
}
