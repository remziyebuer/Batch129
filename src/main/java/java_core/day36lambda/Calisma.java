package java_core.day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Calisma {
    public static void main(String[] args) {
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        System.out.println(bestenBuykElYarisi(myList));

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyUpperDistinct(list);
    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct,
    // in reverse order, in a list.Liste yi buyukten kucuge siralayarak tekrarsiz olacak sekilde
    // besten buyuk elemanlarin yarisini bulunuz ve yazdiriniz.
    public static List<Double> bestenBuykElYarisi(List<Double> myList){
        List<Double> deinList=
                myList.
                stream().
                distinct().
                filter(t->t>5).
                sorted(Comparator.reverseOrder()).
                map(t->t/2).
                collect(Collectors.toList());
        return deinList;
    }
    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde
    // ve tekrarsiz olarak yazdiriniz
    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String>list){
list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+ " "));

    }
}
