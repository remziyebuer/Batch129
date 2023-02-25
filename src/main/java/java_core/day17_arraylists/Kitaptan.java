package java_core.day17_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitaptan {

    static int x = 1000;
    public static void main(String[] args) {
        //Array i liste cevirme;
        int arr[] = {2, 4, 6, 8};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(arr[i]);
            i++;
        } while (i < arr.length);
        System.out.println(list);


        //urunlere Id num.vermek

        Scanner scan = new Scanner(System.in);
        List<String> products = new ArrayList<>();
        int i1=0;
        do {
            System.out.println("Enter " + (i1+1) + ". product name");
            products.add(scan.nextLine());
            i1 ++;
        }while(i1<3);
        System.out.println(products);
        List<String> productId = new ArrayList<>();
        for(String w : products) {
            productId.add("" + w.charAt(0) + w.charAt(1) + x);
            x++;
        }
        System.out.println(productId);
        scan.close();
    }
}
