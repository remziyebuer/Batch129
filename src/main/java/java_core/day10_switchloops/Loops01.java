package java_core.day10_switchloops;

public class Loops01 {
    public static void main(String[] args) {

        /*
Kod standartti:
1)tekrarolmamalidir
2)Dynamic olmalidir
3)Tamir(fix) ve update kolay olmalidir

 */
        //Example 1 : Ekrana bes kere "Hi" yazdiriniz

      // Ekrana bes kere "Hi" yazdiriniz.
        // Bu yol tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //ben extra yazdim
        System.out.println("Hi".repeat(5));
        System.out.println("Hi\n".repeat(5));

        //2.Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop" lar kullanılır
        //Dort tane Loop var ; i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop
        // Baslangıç degeri    Loop'un calısma sartı  Increment/Decrement
        for(int i=1          ; i<6                   ;   i++              ) {

            System.out.println("Hi");
        }
// Baslangic kismi sadece bir defa calisir calisma sarti 5 defa(cok defa) artirma azaltma
// da 5 defa (cok defa) calisir


//*************************************************************************
        //  for (döngü değişkeni=başlangıç değeri; şart; değişim miktarı)
        //  {
        //     yapılacak işlemler
        //   }

/*
Java For Döngüsü Kullanımı, üç bölümden oluşan bir tanımlama yapısına sahiptir.
Bu tanımlama yapılarından ilk ifademiz bir veya birden fazla değişkene atama yapılan
kısımdır. Bu kısımdan sonra genellikle programımız ikinci ve üçüncü ifade arasında gidip
gelir. İkinci ifademiz ise döngümüzün koşul yapısının belirlendiği alandır.
Tanımladığımız üçüncü ifade ise değerimizin arttırma veya eksiltme gibi aritmetiksel
işlemlerinin gerçekleştiği alandır.
Bu kısımların tanımlanması ile oluşan java for döngüsünü kullanıma hazırız demektir.
 */


    }
}
