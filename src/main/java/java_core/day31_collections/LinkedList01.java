package java_core.day31_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {


/*

     1)Interface'lerden object olusturulamaz cunku interface'lerin constructor'ı yoktur.
     2)Abstract Class'larda object olusturulamaz,constructor'lari vardir  ama constructor object
       olusturmakta kullanılamaz.
     3)Interface'lerin constructor'lari olmadıgından collection olusturuken interface isimleri "new"
        keyword'undan sonra kullanılamaz.
     4)class     --> class     ==> extends
         class     --> interface --> implements
         interface --> interface --> extends
         interface --> class     --> Bu munkun degildir.
      5) ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
        Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması
       tavsie edilmez.
       Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
       LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki
       Node'a "Tail" denir.(ben yazdim; son kisim null gösteririr ilk kisimda sadece pointer vardir)

     6)LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.
       LinkedList’ler index kullanmadiklarindan eleman silmede ve eklemede re-index yapilmasina gerek yoktur.
       Bu da LinkedList’leri eleman ekleme ve silmede cok basarili hale getirir.
       Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda LinkedList kullanmak tavsiye edilir.
     8)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.LinkedList'lerde "search"
       islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
       bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

 */
public static void main(String[] args) {

    List<String> citiesnames = new LinkedList<>();
    LinkedList<String> names = new LinkedList<>();
    names.add("Steve"); // 'add' metodu hem Arraylist te vardi hem de LinkedListe var
    //cünkü ikisinin parenti olan Listen almislardir aslinda 'add' parentin metodudur
    names.add("Ajda");
    names.add("Raj");
    names.add("Megan");
    names.add("Brandon");
    System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]

    names.addFirst("Cuneyt");//bu metod Arrayliste yoktu bu en basa eleman eklemek icin kullanilir
    // index olmadigin icin buna ihtiyac duymus.ayni mantikla addlast metodu da var ama buna gerek yok
    // aslinda cünki add normalde zaten sona ekleme yapar buna ragmen okunurlugu artirmak adina yapilmis
    System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon]

    names.addLast("Ajda");// add ile ayni isi yapar cunki add de elemani sona ekler.
                             //This method is equivalent to add.
    System.out.println(names);//[Cuneyt, Steve, Ajda, Raj, Megan, Brandon, Ajda]

    names.add(3,"Suleyman");//developerlar rahat calissin diye java index li olmadigi halde
    // names yazip nokta koyunca indexli add koymus arkaplanda aslinda index calismiyor buna ragmen o sekilde isliyor
    //biz index kullaniyor saniyoruz.(kafamiz karismasin diye yapmis)
    System.out.println(names);//[Cuneyt, Steve, Ajda, Suleyman, Raj, Megan, Brandon, Ajda]

    //clear liste de ki butun elemanlari siler

    names.remove("Ajda");//object ile remove ilk Ajda'yi siler
    System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Megan, Brandon, Ajda]

    names.remove(4);
    System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

    names.add("Suleyman");
    System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

    names.remove();//bos remove da vardir linkedlistte ilk elemani siler.
    System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

    //removeFirst() te remove()' un yaptigi isi var peki neden olusturmuslar okunurlugu artirsin diye
    //removeLast () son elemani siler
    //removeFirstOccurence("Suleyman") Suleymanin ilk görünümünü sil.remove(object o) ile ayni isi yapar
    //removeFirstOccurence("Suleyman")Suleymanin ilk görünümünü sil.
    //size , set ve contains de parent tan implement edilir.
    //getFirst() ilk elemani al getLast() son elemani getir

    names.peek();
    // ilk elemani verir ama silmez (copy - paste gibi)
    //peek ile remove in farki ne? remove cut- paste yapar.
    //peekFirst() peek ile ayni isi yapar peekLast() son elemani silmeden size verir.

    names.poll();
    //poll();ilk elemani siler verir yani cut-paste yapar pollFirst() ve pollLast() te var
    //remove bos linkedliste kullanilirsa hata verir poll() bos linkedliste kullanilirsa
    // null verir

    names.pop();// bu da cut-paste remove() ile ayni



}
}
