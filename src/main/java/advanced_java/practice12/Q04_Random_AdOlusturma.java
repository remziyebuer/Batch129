package advanced_java.practice12;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme
    // ile yaptığını yazdıran bir kod yazınız.//a b c d e f g h i j k L m n o p q r s t u v w x y z
    //
    public static void main(String[] args) {

        String alfabe = "abcçdefgğhıijklmnoöprsştuüvyzABCÇDEFGĞHIİJKLMNOÖPRSŞTUÜVYZ ";
        String isim = "Ali Can";
        String yeniIsim = "";

        int sayac = 0;

        for (int i = 0; i < isim.length(); i++) {

            while (true) {
                char rastgeleHarf = alfabe.charAt((int) (Math.random() * alfabe.length()));
                sayac++;
                if (isim.charAt(i) == rastgeleHarf) {
                    yeniIsim += rastgeleHarf;
                    System.out.println("yeniIsim = " + yeniIsim);
                    System.out.println("sayac = " + sayac);
                    break;
                }
            }
        }

        System.out.println("sayac = " + sayac);
        }

    }