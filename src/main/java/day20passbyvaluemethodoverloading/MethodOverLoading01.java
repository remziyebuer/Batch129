package day20passbyvaluemethodoverloading;

public class MethodOverLoading01 {
    /*
       1)Method Overloading yaparken metod ismi degistirilmez
       2)M.O.yapilirken parametreler degistirilir
        i) Parametre degistirirken parametrelerin data typleri degistirilebilir
        ii)Parametre degistirirken parametrelerin data type leri farkli ise
         yerleri degistirilebilir
        iii) Parametre degistirirken parametrelerin sayisi degistirilebilir.
        3)Java icin 'ismi' ve 'parametreleri' ayni olan iki metod tamamiyle aynidir
        bu yuzden 'ismi' ve 'parametre ' "Method Signature" olarak adlandirilir.
        4)Method Overloading olustururken return type i degistirmenin hic bir etkisi yoktur
          Method Overloading olustururken access modifier'i degistirmenin hic bir etkisi yoktur
          Method Overloading olustururken static 'i degistirmenin hic bir etkisi yoktur
          Method Overloading olustururken metod body' i degistirmenin hic bir etkisi yoktur
        5)"private" metod 'lar overload edilebilir.Cunku M.O. sadece bir class ' in icinde olur
        "private"olmak ise baska class'lara gidildiginde problem olusturur.
        6)"static" metod'lar overload edilebilirler.

     Notlar:   i) Dunya ile alakali iki temel obje var.Bir insanlar  bir de ays gibi objeler.Ay' a  iki
                cizik atsak Cem ' de Amerika da ki Jim' de bu cizigi görür.Cem ' in kafasi yarilsa Jim
                göremeyebilir.Ay gibi objelerde ki degisiklikler aninda görulur.Insan gibi objelerde
                ki degisiklikler herkes tarafindan görülmez.
                Üstün de ki degisiklikler herkes tarafindan aninda  görülen deg. "static" ustunde
                ki degisiklikler sadece kendisi ile alakali kimseyi alakadar etmeyen deg. non-static
                denir

               Ex;  String name = "Cem";==>non-static
                static String name = "Jim"; ==>Static old. icin bütün birimler degisiklikten aninda haberdar
                olur

                ii) static olan seyler butun objelerin ortak malidir.ör; ay butun insanlarin ortak malidir
                ne olur ortak mali olunca; kafaniza göre degistiremezsiniz o seyden butun objeler etkilenir.
                Amerika ayin parlakligi cok gidip azaltacam diyemez.Bundan Cin' de etkilenir ve karsi cikar.
                Ayni sey Applikationlar da da gecerlidir.Bir Class ta eger bir variable i static yaparsiniz
                o class tan olusturulan butun objelerin ortak mali oldugu icin butun objeler etkilenir.
                Bu yüzden dikkatli olmalisiniz

                Ex; kayitli ogrenci sayisini müdür, müdür yardimcisi , ögretmenler, muhasebe  ve veliler
                 görmelidir.Bunun icin olusturacagimiz ogrenci sayisi variable ' ini static yapmalisiniz.
                 1 saat sonra yeni kayit oldugunda ve ögrenci sayisi 1 artiginda ya da kayit silindiginde
                 ve ögrenci sayisi azaldiginda herkes haberdar olur.(O class 'in objelerinin tamaminin
                  o degisikligi görmesi durumu)

                 iii)Biz class olusturuyorduk cünkü java object orianted bir dildi ve Obje ler icin kalip lazim
                 class ' larda bu kaliplardi.



                                                                        name                  age
                                                                           \_________________ /
             kayitliÖgr.                                                   |                  |
                \  _________________________________  obje 1               |                  |
                 |  static int kayitliÖgr = 1200;  |  =============>       |__________________|
                 |  String name ="Ali Can";        |                                           \stdId
                 |  String stdId="AC123;           |                   name                     age
                 |  int age = 13;                  |  obje 2              \___________________/
                 |_________________________________| ==============>      |                   |
                    Student( Class)                                       |                   |
                                                                          |___________________|
                                                                                               \stdId

   ***non_ static olanlar obje sayisinca olusturulurlar ama static olanlar sadece bir tane olusturulur
   ***static olanlar Class' a yapistirilir.non-static olanlar obje ' ye yapistirilir.(Insanlarin herbirine
   ayri bir kafa yapistirildigi gibi.Ama bütün insanlar icin sadece bir ay vardir.
   ***non-static seylere ulasmamiz icin mutlaka obje olmasi gerekli ve önce objeye ulasmamiz gerekli.Obje
   ustunden non static olan name, age ...vs ulasabiliriz.static olanlara class'tan ulasiriz.
   ***Obje static olani görmek isterse class 'a bakar non- staticleri görmek isterse kendine bakar
 */

    public static void main(String[] args) {

        add(3, 5);
    }


    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(double a, double b) {
        System.out.println(a + b);
    }

    public void add(double a, int b) {
        System.out.println(a + b);
    }

    public void add(int a, double b) {
        System.out.println(a + b);
    }

    public void add(int a, int b, int c) {
        System.out.println(a + b);
    }

    // su an ben 'add' metoduna 'overload'
    // yaptim bir suru is tanimladim.Bir suru metod oldugunda java
    // hangisini kullanacagina nasil karar verir


}
