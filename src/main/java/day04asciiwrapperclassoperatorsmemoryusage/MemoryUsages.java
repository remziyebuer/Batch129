package day04asciiwrapperclassoperatorsmemoryusage;

public class MemoryUsages {

    public static void main(String[] args) {


        /*
         Iki tip memory vardir Heap (büyük) Memory ve Stack (kücük) Memory
         Stack memory de primitive datalar ve non-primitive datalarin adresleri
         yani --->  Reference  bulunur.
         Heap Memory de ise non-primitive 'ler bulunur
         */
/* SULE HOCA DAN
Javanin kullandigi ve urettigi hersey datadir.
Javada iki turlu Memory vardir
1) Stack Memory ==> small gibi
    i) Kucuk Memory'dir
    ii )Primitiveleri ve Non-Primitivelerin Referance (adreslerini ) tutar
2) Heap Memory ==> Huge gibi
    i) Buyuk Memory'dir
    ii)Non-Primitive datalari icerir

    Java Heap Memory'e yerlestirilen tum Non-Primitive datalar icin
    bir adres (Referance) olusturur.
    Bu adreside Stack Memory'de saklar.
    Herhangi bir sebeple adress (Referance) silinirse Heapdeki Non-Primitive
    datayi Memory'nin temizligini saglayan "Garbage Collector" temizler.


    String s = "Tom";
    String t ="Terry";
    String r = "Tom";
    1) s==t ==> i) Adres ===> farkli
                ii)Deger ===>farkli

    2) s.equals(t) ==> i) Deger ==>farkli
       s.equals(r) ==>  i) Deger ==> Ayni


 */

    }
}
