package java_core.day30_Exceptions_interface;

public interface Ac {
    //Multiple inheritance class'lar icin mumkun degildir ama interface icin mumkundur
    // Bir interface'i parent yapmak icin implements keyword'unu kullaniriz
     // Bir class'in birden fazla interface'i olabilir
     // Java parent'lar "Class" oldugunda "Multiple parent" a musade etmez ama biz bazen "mltiple parent' a ihtiyac duyariz

    //    Bu ihtiyaci gidermek ici java "Interface" ismini verdigi yeni bir yapi olusturdu
      //   bu yapi sayesinde bir "class" icin coklu "interface parent" olusturabiliriz
    // interface ' lerin icine concrete method konulamaz'
    //Java çoklu parent yaptığında sadece methodun ne yapılması gerektiğini söyler
    // body vardir ve body o method'un isi nasil yapacagini belirtir.
    // İsin nasil yapilacagi bircok detay icerir
    //Ve bu Child class'larda kafa karsiklina sebeb olur .
    // Halbuki sadece yapilmasi gereken isi soyleyip nasil
    //yapilacagini child'e birakip child class'in kafa karisikligini engellemis olursunuz
    // Coklu parent'ta detaylar verilmez sadece methodun ne yapmasini istedigini vermemiz gerek
    //Interface lerde methodlar abstract oldugundan abstract yazmaya gerek yoktur.
    //Interface lerde tum methodlar publictir ve abstractir static degildir//method
    //Interface de ki butun variable lar public'tir static tir ve final dir//variable
    //Interface'ler "concrete" method icermezler, dolayisiyla interface'in icindeki hicbirsey
    // istege bagli degildir
    // Interfacein icindeki hersey child class'lar icin mecburidir, bu yuzden Interface'lere
    // "TODO list" denir

    public void cool();

    public void run();

    public static final int price = 2000;
    int price2 = 600; //bu yazim sekli ile ilk inin farki yok cunku
    // interface de ki variable lar otomatik public static final dir.
    //bunu görmek icin runner a class adi ile girelim önunde static
    // yazmamasina ragmen price2 de görecegiz.extre =600 de görecez
    // cünkü son degerdir
    String model= "Mitsubishi";

}
