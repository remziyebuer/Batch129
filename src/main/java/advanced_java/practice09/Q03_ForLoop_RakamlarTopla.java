package advanced_java.practice09;

import java.util.Arrays;
import java.util.Scanner;

public class Q03_ForLoop_RakamlarTopla {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = scanner.nextLine();

        System.out.println(rakamlariTopla(str));

    }

    public static double rakamlariTopla(String str) {

        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                toplam += Integer.parseInt("" + str.charAt(i));

            }
        }

        return toplam;
    }


    public static class Q02_ArraysSesliHarfleriKapa {
        /*Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir karakteri bir array elemanı olarak yazdıran bir kod yazınız.
        Örn:
        input: Merhaba
        output: [M, *, r, h, *, b, *]
    */

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Bir kelime giriniz");
            String str = input.nextLine();

            String[] arr = new String[str.length()];
            int idx=0;

            for(String w : str.split("")){

                if(w.equalsIgnoreCase("a")||w.equalsIgnoreCase("e")||w.equalsIgnoreCase("i")||w.equalsIgnoreCase("o")||w.equalsIgnoreCase("u")){
                    arr[idx] = "*";
                    idx++;
                }else {
                    arr[idx]=w;
                    idx++;
                }
            }

            System.out.println(Arrays.toString(arr));

        }

    }
}
