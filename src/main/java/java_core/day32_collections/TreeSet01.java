package java_core.day32_collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        System.out.println(hs);

        long three = System.nanoTime();

        System.out.println("Tree-Set' in uygulama Suresi: " + (two-one));//781100
        System.out.println("Hash-Set' in uygulama Suresi: " + (three-two));//93900
        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
//      TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler,
//      ve sonra HashSet'i TreeSet'e ceviririz.

    }
}
