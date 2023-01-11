package java_core.day12_forloop_whileloop;

public class ForrLoop5 {
    public static void main(String[] args) {

        //Example1;Interwiew lerde böyle muzip soru sorabilirler.
        // Hic sayi kullanmadan 1 den 100' e kadar olan sayilari console' a yazdiriniz
        //d= ascii degeri 100 a=97 b=98 c=99

        for (int i = 'd'/'d'; i <='d'; i++) {//char larla mat.islemleri int verir.
                   //   1       100   olur
            System.out.print(i+ ",");
        }


        //Note 1: Bazi loop ' lar hic calismayabilir

        for (int i = 1; i < 0; i++) { //1<0 false hic calismaz direk kirilir(Zero execution)

        }

         //Note 2: Bazi loop ' lar sonsuz  defa calisabilir.

         //   for (int i = 1; i < 10; i--) {
         //     System.out.println("memory dolana kadar  yazdirir.");
         //     }

//Bunlara sonsuz (Infinite )loop  denir genellikle increment /decrement kisminda yapilan hatadan
// kaynaklanir
//        for (int i = 1;   ;  ) {
//            System.out.println("Hi");
//        } kosulu yazmayinca hata vermez sonsuz döngü olur.












    }
}
