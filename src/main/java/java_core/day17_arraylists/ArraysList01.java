package java_core.day17_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysList01 {
    public static void main(String[] args) {
        /*
        1)ArrayList'ler coklu data depolamak icin kullanilir
        2)ArrayList'ler non-primitive data type ' inde ki
        coklu datalari depolamak icin kullanilir
        listler non-primitive data veya reference kabul eder
        3)ArrayList'leri olustururken icine koyacagimiz eleman sayisini basta söylemene
        gerek yoktur
        listler eleman sayisinda flexible dir ama Array'ler flexible degildirler.
        4)Madem Array'ler flexible degildir neden Java Array leri iptal etmedi
        i)Dunya da eleman sayisi belli data' lari depolamak icin Array'ler tercih edilir
        ii)Array'ler cok hizli calisir
        iii)Array'ler memory' de cok az yer kaplar.
 */

        //List nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);//  []

        //Listlere eleman nasil eklenir?
        // add metodunu kullaniriz.Bu metod elemanlari bizim verdigimiz sirada
        // liste ekler(Insertion Order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(888);
        System.out.println(ages);// [12,9,23]
        ages.add(1, 656);
        ages.add(3, 777);
        //en sona eleman eklemek icin index e gerek yok ages.add e yazmak yeter

        //Liste cok lu eleman nasil eklenir veya baska bir list nasil eklenir?
        //Bir Liste coklu eleman eklemek icin o elemanlari once bir List 'in
        // icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println("ages = " + ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        //Bir List'deki tum elemanlari nasil silebilirim?
        //    ages.clear();
        //    System.out.println(ages);// []


        //Bir elemanin list de varolup olmadigini nasil kontrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r);

        //Bir List in baska bir List ile ayni olup olmadigini nasil kontrol ederiz?

        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false cunku esit olmasi icin ayni indexte ayni eleman
        // olmali


//Example 1 : Verilen iki Integer List ' te tamamiyle ayni elemanlarin olup olmadigini
// kontrol eden kodu yaziniz.

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);//true


//Collections.sort() List'deki elemanları alıp küçükten büyüğe sıraladı


     //Array i liste cevirme;
        int arr[] = {2, 4, 6, 8};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(arr[i]);
            i++;
        } while (i < arr.length);
        System.out.println(list);

    }
}
