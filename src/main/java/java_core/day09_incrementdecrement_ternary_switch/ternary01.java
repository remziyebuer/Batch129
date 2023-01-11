package java_core.day09_incrementdecrement_ternary_switch;

public class ternary01 {
    public static void main(String[] args) {


        //Example2 ;
        int a = 10;
        int b = 20;

        int r1 = a < 7 ? a++ : b++;//Eger b nin bir artirilmis degerini atamak istiyorsan
        // ++b yazmalisin. yukarda ki ifadede r1 e önce b atanacak

        System.out.println(r1);//20 burda post increment yapar
        System.out.println(a);//10 kod calismadi java buna dokunmadi
        System.out.println(b);//21 olur

        int r2 = a < b ? a++ : b++;

        System.out.println(r2);//10 burda post increment yapar
        System.out.println(a);//11 bir artirildi
        System.out.println(b);//20 olur kod calismadigindan

        //Example2 ; Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //   -4 ==> -1*4    4==>4     0==>0

        int c = -4;
        int r3 = c < 0 ? -1 * 4 : c;

        // iki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli
        // ise farkli isaretli sayilari carpamiyorum mesaji veren kodu yaziniz.

        int m = 5;
        int n = -6;
        //Object Java da bütün " non-primitive  data typ"(Class) larinin ortak "Parent"
        // (baba) idir.Farkli data type 'lari icin ortak bir variable olusturmak isteediginizde
        //data type olarak object kullanabilirsiniz
        //Java da "object" insanlik aleminde Hz Adem' e benzer.

        Object r4 = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n :
                "Farkli isaretleri carpamiyorum";

        System.out.println(r3);

        //Example 4 ; Size verilen sayinin  3 basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = 436;


      String str =  (a>99 && a<1000) ? "uc basamaklidir": "uc basamakli degildir";
        System.out.println(str);

        // Dinamik bir kod olmasi icin p ekleyebiliriz

         str =  (a>99 && a<1000) ? p + "uc basamaklidir": p + "uc basamakli degildir";

        // ama negatifleri unuttuk onlarida ekleyelim ama sade kod olmasi icin
        // parantez icine eklemeyecegiz yeni bir variable da paylasacagiz.
            p= -436;
        int r = Math.abs(p);
       //Bu durumda r ile islem yapip kullaniciya p gösteririz*******
        // Yoksa kullanici der ki ben eksi diyorum o arti gösteriyor güler bize
        //Sarti kontrol ederken r yi kullandim.cikti icin p yi kullandim
        str  = r>99 && r<1000 ? p + " uc basmaklidir" : p + " uc basmakli degildir";
        System.out.println(str);


    }
}
