package day22_staticblocks_consturctors_datetime;

public class StaticBlocks01 {
    //Benim Notlarim;

    //Bir Variable olusturdugunuzda deger atamaz isenizo variable' initialize etmediniz
    // (atama yaptiniz ama baslatmadiniz) demektir
    //double pi ;
    //main metodun icine koyacaginiz hersey static olmali o yüzden static yazmaliyim
    // main icine yazacaz
   // static double pi; yazip main icinde pi yi baslatabilir yani deger atayabiliriz.
    //ama bazen baslatmayida main metoddan daha önce yapmak isteriz o zaman static block
    // kullaniriz.bazi ascilar ise baslamadan butun mallzemelerin önunde hazir olmasini
    // bekler bizde main den önce static block kullanarak bunu sagliyoruz.
    // static block=aşçı yamağı:)


    //Hoca nin notlari;

     //Bir variable olusturdugunuzda , deger atamazsaniz variable' initialize etmediniz
    // (atama yaptiniz ama baslatmadiniz) demektir
    // Static variable'lar static block'lar icinde initialize edilirse
    // o class'in icinde her sey'den once hazir hale getirilmis olur.
    //Bazen main method calistirilmadan once variable'larin hazir hale
    // getirilmesi gerekir. bu yuzden static block'lar kullanilir
    //Note 1: "static block" lar static variable'lari initizalize etmek icin kullanilirlar
    //Note 2: "static block" lar class icinde "herseyden once" calistirilirlar

    static double pi;
    static String shape;

    static{
        pi = 3.14;
        System.out.println("Static block 1");
    }

    static{
        shape = "Circle";
        System.out.println("Static block 2");
    }

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");
    }
}
