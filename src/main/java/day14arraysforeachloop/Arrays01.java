package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

//Example 1: String array olusturun icine 5 tane eleman ekleyin sonrada
// ilk eleman ile son elemanın icerdigi karakter sayiları toplamını ekrana yazdırın

        String arr[] = new String[5];
        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length - 1].length());//7

        // eleman eklemeden length yaparsaniz hata verir.yukarda string oldugu icin
        // length() kullandik

        //Example 2; String array olusturun bes eleman ekleyin tum elemanlarin
        // toplam karakter sayisini bulunuz


        String arr2[] = new String[5];
        arr2[0] = "Miami";
        arr2[1] = "Istanbul";
        arr2[2] = "Frankfurt";
        arr2[3] = "Dhaka";
        arr2[4] = "Athena";

        int totalChar = 0;//sum

        for (int i = 0; i < arr2.length; i++) {

            totalChar += arr2[i].length();

        }

        System.out.println("totalChar = " + totalChar);

        //2.yol for-each-loop(enhanced loop = zenginlestirilmis loop)==>baslangic degeri
        // loop' un calisma sartti ve increment mi decrement mi kismini kendisi halleder.
        //for-each-loop "Array "'lerde ve "Collection " larda kullanilir ama bazen öyle
        // bile olsa mesela index kullanmamiz gerektiginde for_ each- loop caresiz kalir
        // o zaman diger loop'lari kullaniriz

        int sum=0;

        for(String w : arr2){
            sum+=w.length();
        }








    }//main
}//class
