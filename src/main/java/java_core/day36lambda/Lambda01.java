package java_core.day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        //Example 1: Create a method to find the half of the
        // elements greater than 5, distinct, in reverse order, in a list.
        //Bir listede 5'ten büyük öğelerin yarısını farklı, ters sırada
        // bulmak için bir yöntem oluşturun.
        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        List<Double> half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");//sonradan ekledik o yuzden hocanin ciktilar ayni degil
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        printAllAlphabeticallyUpperDistinct(list);//AJDA ANGELİNA BRAD CUNEYT TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);//tom cuneyt brad angelina ajda
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);//TOM AJDA BRAD CUNEYT ANGELİNA
        System.out.println();
        printAllSortWithLastCharUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct2(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
        //System.out.println(removeElementIfTheLengthGreaterThanFive(list));
        System.out.println();
        //System.out.println(removeElementIfStartsWithAorEndswithd(list));
        System.out.println();
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list));
    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct,
    // in reverse order, in a list.Liste yi buyukten kucuge siralayarak tekrarsiz olacak sekilde
    // besten buyuk elemanlarin yarisini bulunuz ve yazdiriniz.

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList) {
        return myList.// hepsinin basina return diyorum.
                stream()
                .distinct()
                .filter(t -> t > 5)
                .map(t -> t / 2)
                .sorted(Comparator.reverseOrder())//buyukten kucuge
                .collect(Collectors.toList());
        //listte toplamamizi saglayan metod collect.isterseniz secneklerde
        // set in icindede toplayabilirsiniz ama soru list diyor

    }
//*********************************

//Lambda yi String'lerde Kullanma;

    //Example 2: Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz

    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream(). // stream'a çevirdim
                distinct(). // tekrarlılarıı sildim
                map(t -> t.toUpperCase()). // map'a gittim ve kelimeleri büyük harf yaptım
                sorted(). // alfabetik sıraya göre sıraladım
                forEach(t -> System.out.print(t + " ")); // aralarında bir boşuk bırakarak yazdırdım
    }
    //Stringlerde buyuk harfe cevirmek degistirmek map kullaniriz
    //tersten sirala demedigi icin sadece sorted yapmam yeterli icine bisey
    // koymaya gerek yok.

    //Example 3: Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.reverseOrder()).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Tum list elemanlarini buyuk harfle, uzunluklarina göre artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).//uzunluklarini karsilastirarak sirala
                // siralamanin kuralini ben belirlemis oldum.
                        forEach(Utils::printInTheSameLineWithSpace);//ve yazdir bu elemanlari birer birer.

    }

    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct(List<String> list) {

        list.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//map 'in sorted tan önce olmasi iyidir
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));


    }

    //2.yol ve su soru versiyonu;
    // Tum list elemanlarini buyuk harfle, son harflerine gore azalan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct2(List<String> list) {

        list.
                stream().
                distinct().
                map(String::toUpperCase).//map 'in sorted tan önce olmasi iyidir
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).//java da
                // son karakteri veren metod yok utils te kendimiz olusturuyoruz. bu durumda reversed yazdigimda
                //sikayet etmiyor yani java bir anlamda beni mecbur birakiyor meth.ref. kullanmaya
                // artik buna azalan sirada yazabiliriz soru olarak
                forEach(t -> System.out.print(t + " "));


    }

    //Example 6: Tum list elemanlarini buyuk harfle, uzunluklarina artan sirada, tekrarsiz olarak yazdiriniz.
    //Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list) {
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//yanyana yazdiran M. java da yok utilste olusturup 4.soruda kullandik
        //String classtaki length' e göre sirala sonra naturel order a göre sirala
        //(String::length) bu yapiya method referance ile yazmak denir eger varsa bu tercih edilir eger
        // bu varsa bazen t 'li olanin altini java altini cizer
        //t->t.charAt(t.length()-1)) bu tarz yazmaya Lambda Exspression denir mecbur olmadikca
        // method ref.tercih edilir
    }
//7)Karakter sayisi 5 den fazla olan elemanlari siliniz.

    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list) {
        //eger siz bir elemani belli bir sarta göre silmek istiyorsaniz removeif() kullanmalisiniz ama bu method
        //stream de yok o yüzden steram kullanmiyorum.
        list.removeIf(t -> t.length() > 5);// demek ki lambda da bazen stream kullanmamak gerekir
        // cun ki stream bazi metodlari görünmez yapar

        return list;
    }

//8)"A" Ile baslayan veya "d" ile biten elemanlari siliniz.
public static List<String> removeElementIfStartsWithAorEndswithd(List<String> list) {
        list.removeIf(t->t.startsWith("A")||t.endsWith("d"));
      //  return list;

     //burda tekrar edenleri yazar distinct yapamam cun ki distinct stream icinde.eger
     //  return list ten sonra . koyup stream yaparsam distinct kullanabilirim ama soruda bizden list
     //döndürmemizi istemis bu durumda da tekrar.collect (Collectors.toList()) kullanip stream' den
     // list  e geri cevirebiliriz.return list.stream().distinct().collect(Collectors.toList());
    return list.stream().distinct().collect(Collectors.toList());
}

//9)List elemanlarinin karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz.
// Bir metod java da varsa kullaniriz yoksa kendimiz olustururuz.
    public static List<Integer> printLengthSquare(List<String> list){
    //return    list.stream().map(t->t.length()*t.length()).collect(Collectors.toList());
        //lambda ex. kacinmanin bir yoluda kendi clasinsda metodlarini olusturmaktir.
        //olusturacaginiz metodlari static yapmalisiniz cun ki Utils:: yazarak class adini kullanarak cagirmis
        // oluyorsunuz yoksa cagiramazsiniz
        return    list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
    //length int cinsinden oldugundan List<Integer> return data type kullandik.

    }
    //10) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static  List <String> printElementsLengthEven(List<String>list){
    // return   list.stream().filter(t->t.length()%2==0).collect(Collectors.toList());
        return   list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
    }

}