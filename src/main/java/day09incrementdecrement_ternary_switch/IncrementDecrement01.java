package day09incrementdecrement_ternary_switch;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        //Increment
        a = a + 2;//veya a += 2; Cünkü Java tekrari sevmez böyle yazdirir
        System.out.println(a);//7

        int b = 10;
        System.out.println(b);//10

        b = b + 5;
        System.out.println(b);//15

        b += 5;
        System.out.println(b);//20

        b++; //Bu syntax sadece bir artimada kullanilir 2 ile isterseniz böyle bir sansiniz yok

        //Decrement
        int c = 8;
        System.out.println(c);//8

        c = c - 3;
        System.out.println(c);//5

        c -= 3;
        System.out.println(c);//2


        // Increment 2 (artirma carpma ile de yapilabilir)

        int d = 6;
        System.out.println(d);//6

        d = d * 2;
        System.out.println(d);//12

        d *= 2;
        System.out.println(d);//24

        //Decrement 2 (azaltma bölme ile de yapilabilir)

        int e = 24;
        System.out.println(e);// 24

        e = e / 2;
        System.out.println(e);//12

        e /= 2;
        System.out.println(e);//6

        //1 ile increment

        int f = 12;
        // f= f+1;
        // f+==1; Bunlari kullanmayiz kullansak ta olur ama daha kisa yolunu
        // java gelistirmis bu is icin ve de kullanirsak garip karsilanir

        f++; // bu kullanilir


        // 1 ile decrement
        int h = 10;
        h--;

//1 ile carpma ve bolme incerement decrement olmaz 1 e bolme ve carpma bisey getirmiyor

        //pre-increment : önce artirma ve post-increment = sonra artirma

        int i = 10;
        int k = i++; // post increment cünkü increment variable isminden sonra olusturuldu

        System.out.println(k);//10  i artirilmadan k ya konuldugu icin 10
        System.out.println(i);//11i satir sonunda artirildigi icin  i 11 olur

        int m = 15;
        int n = ++m; //pre-increment cunku increment , variable in isminden önce yazildi

        System.out.println(m);//16 m satir sonunda artirildg icin degeri 16
        System.out.println(n);//16 m artirildiktan sonra n ye kondugundan n de 16

        int p = 17;
        int r = p--;//
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19








    }
}
