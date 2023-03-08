package smallstudy;

import java.util.*;

public class C01_LinkedDataTurleri {
    public static void main(String[] args) {
        //1.
       LinkedList <String>linkedList = new LinkedList<>();

        List<String> linkedList1 = new LinkedList<>();
        List<String> linkedList2 = new LinkedList<>();

        //Deque<String> linkedList4 = new LinkedList<>();
        //retainAll() iki linkedlist in  kesisimde ki elemanlarini verir
        //cun ki farkli elemanlari siler sadece kesisim kalir
        linkedList1.add("mirhan");
        linkedList1.add("beyhan");
        linkedList1.add("alihan");
        linkedList1.add("kayahan");
        linkedList1.add("besir");


        linkedList2.add("ahmet");
        linkedList2.add("ayse");
        linkedList2.add("besir");
        linkedList2.add("furkan");

        linkedList1.remove(3); //istedigim indexi siler

        //System.out.println(linkedList2.retainAll(linkedList3));
        //bu kod hem siliyor hemde sildim diye boolean döndürüyor

        linkedList2.retainAll(linkedList1); //bu kod siliyor ve bunun sonucunda  listi yazdirirsak
        //kesisim elemanini görürüz farklilari silmis
        System.out.println(linkedList2);//[besir]
        //yani list ikide list 3 te olamayan eleman varsa sil.
        System.out.println(linkedList2.retainAll(linkedList1));
        //System.out.println(linkedList2.retainAll(linkedList3)); bu kodu yazdigimizda
        //eger tamamen ayni elemanlar olsaydi diger listede varsa silemeyecek silemedim
        // diye false yazacak.elemanlarin hangi sirada oldugu önemli degil bu karsilastirmada.

        Queue<String> linkedList3 = new LinkedList<>();
        Queue<String> linkedList4 = new LinkedList<>();

// kuyruk; sondan eklenir bastan silinir

        linkedList3.add("mirhan");
        linkedList3.add("beyhan");
        linkedList3.add("alihan");
        linkedList3.add("kayahan");
        linkedList3.add("besir");


        linkedList4.add("ahmet");
        linkedList4.add("ayse");
        linkedList4.add("besir");
        linkedList4.add("furkan");

        linkedList3.remove();
        System.out.println(linkedList3);//[beyhan, alihan, kayahan, besir] mirhan gitti
        System.out.println( linkedList3.remove());//beyhan -->beyhani sildim seklinde String döner

        //remove istedigim indexi degil basta kini siler
        //ama elemani yazsak icinden alip yinede silebiliriz ama obje ile index ile degil

        System.out.println(linkedList4.remove("ayse"));//ayseyi sildin mi true
        linkedList4.remove("ayse");//direk ayseyi sil demek

        System.out.println("------");

        System.out.println(linkedList4.peek());//en bastaki elemani döndurur ama silmez
         //peek bos ise null doner
        System.out.println(linkedList4.element());//ben de peek gibi davranirim
        // ama bos isem hata veririm

        //2.
        Queue<String> linkedList5 = new LinkedList<>();// bos olusturduk
        // linkedList5.element();//NoSuchElementException
        System.out.println(linkedList4.poll());//bastan siler sildigi elemani verir
        //remove dan farki;remove bos ise hata verir poll ise null doner görelim;
        //  System.out.println(linkedList5.remove()); exceptiom
        System.out.println(linkedList5.poll());//null

        linkedList4.offer("Mehmet");
        System.out.println(linkedList4);// add gibi eleman ekler

        //3.
        Deque<String> linkedList6 = new LinkedList<>();
       //aslinda deque ye bagli Queue ise Opa
        linkedList6.add("gamze");
        linkedList6.add("gulsum");
        linkedList6.add("guven");
        System.out.println(linkedList6.pop());//ilk elemani  siler ve verir
        System.out.println(linkedList6);

    }
}
