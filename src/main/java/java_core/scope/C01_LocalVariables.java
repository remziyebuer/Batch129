package java_core.scope;

public class C01_LocalVariables {
    public static void main(String[] args) {

        // Scope, bir degiskenin erisebildigi alandir
        // Scope, degiskenlerin olusturuldugu yer göz önüne alinarak 2 gruba ayrilir
        // 1. local variable 2. class level variablelar
        // bir metodun icinde olusturulan degiskenin scope'u
        // icinde olusturulduklari metottur
        // o metodun disinda ulasilamazlar

        int sayi=10;
        String isim="Ramazan";

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";
        }

        // System.out.println(adres);       loop icerisinde olusturulan degiskenlere sadece loop icerisinden ulasilabilr

        double pi;
        // System.out.println(pi);     // lokal degiskenler deger atanmadan olusturulabilirler, ama kullanilamazlar
    }

    public  static void method1(){
        // System.out.println(sayi);    // sayi degiskeni main metotta olusturuldugu icin ulasilamaz
    }
}
