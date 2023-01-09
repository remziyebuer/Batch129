package day20passbyvaluemethodoverloading.day19lists_varargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
//        //Example 1; Verieln bir List ' te ki elemanlari tekrarsiz olarak yazdiriniz.
//        //[2,3,2,2,3,5]==> [2,3,5]
//
//        List<Integer>myList = new ArrayList<>();
//
//        myList.add(2);
//        myList.add(3);
//        myList.add(2);
//        myList.add(2);
//        myList.add(3);
//        myList.add(5);
//
//
////yeni bir list olusturacaz ve eski list ten tek tek eleman alip yeni liste var
//// mi yok ise yeni liste koy var ise koyma ikinci aldigim eleman var mi yok sa koy
//// varsa koyma seklinde tum elemanlar icin var mi yok mu kontrolu yapacam(for each)
//
////önce yeni list olusturalim.
//
//        List<Integer>newList = new ArrayList<>();
//        for ( int i = 0; i< myList.size(); i++){
//
//            if(!newList.contains(myList.get(i))){// anlami var degilse ek yap
//
//                newList.add(myList.get(i));
//
//            }
//        }
//        System.out.println(newList);
       Scanner input=new Scanner(System.in);

        System.out.println("cikmak isterseniz q ya basiniz");
        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("PC");
        products.add("Notebook");
        products.add("Mobile Phone");

        do {
            System.out.println("urunun adini yaziniz");
            String urun = input.nextLine().toLowerCase();
            for (int i =0;i <products.size(); i++ ){
        products.set( i, products.get(i).toLowerCase());

            }
            System.out.println(products);
            if (urun.equalsIgnoreCase("Q")) {
                break;

            } else if (products.contains(urun)) {
                System.out.println("urun stokta var");
            } else {
                System.out.println("urun stokta yok");
            }
        }while(true);

    }
}
