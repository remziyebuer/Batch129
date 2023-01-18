package java_core.scope;

public class C04_ClassVariables {

    public static void main(String[] args) {

        // C03'teki hastane ismini yazdirmak istiyoruz
        // hastane ismi static kelimesi ile isaretlenmis oldugu icin direkt class üzerinden ulasilabilr

        System.out.println(C03_ObjectVariables.hastaneIsmi);

        // C03'teki hasta sayisi
        // hasta sayisi de static kelimesi ile isaretlenmis oldugu icin direkt class üzerinden ulasilabilir

        System.out.println(C03_ObjectVariables.hastaSayisi);    // 23453

        C03_ObjectVariables.hastaSayisi++;  // 23454
        C03_ObjectVariables.hastaSayisi++;  // 23455
        method1();  // 23456
    }

    public  static  void method1(){
        System.out.println(C03_ObjectVariables.hastaSayisi++);
    }
}
