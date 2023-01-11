package java_core.day10_switchloops;

public class ForLoops03 {
    public static void main(String[] args) {

        //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari
        // ekrana yazdiran kodu yaziniz

        for (int i = 21; i < 181; i++) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
            }
        }


        System.out.println();//iki örnegin arasini acmak icin var
//Example 2 ; Size verilen kücük harfle yazilmis String ' in index ' i cift sayi
// olan character'lerini  büyük harf yapiniz.
//Yazdiginiz kod belli senaryolar icn calisiyor tüm senaryolar icin calismiyor
// ise bu koda hard code denir.Hard Code yanlis yazilmis code 'dur mutlaka düzeltilmelidir
        String s = "ankara ";//Stringlerle calisirken baslangic degerini '0' yapariz
        // Cünkü ilk karakterin indexi '0' dir
//Kodun dinamik olmasi icin length metodu kullaniriz.lengt metodu karakter sayisini
// length 'in bir eksigi son indexi verir = length()-1
        for (int i = 0; i < s.length(); i++) {

            String ch = s.substring(i, i + 1);
            if (i % 2 == 0) {
                System.out.println(ch.toUpperCase());
            }
        }


    }
}
