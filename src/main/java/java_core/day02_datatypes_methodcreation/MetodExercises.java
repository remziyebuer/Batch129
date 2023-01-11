package java_core.day02_datatypes_methodcreation;

public class MetodExercises {

    public static void main(String[] args) {
        int ikiSayiToplamaSonucu = add(3, 6);
        System.out.println("iki Sayi Toplama Sonucu = " + ikiSayiToplamaSonucu);

        long ikiSayiCarpimSonucu = multiply(5, 4);
        System.out.println("iki Sayi Carpim Sonucu = " + ikiSayiCarpimSonucu);


        double sonuc = ilkIkiCarpUcuncuTopla(6.5, 5, 10.7);
        System.out.println("sonuc = " + sonuc);
// verilen bir ondalik sayinin kupunu hesaplayan ve ekrana yazdiran kodu yaziniz
        double kupSonuc = kupHesaplama(3);
        System.out.println("kupSonuc = " + kupSonuc);

        double daireAlanSonuc = daireAlan(3);
        System.out.println("Daire Alan Sonuc = " + daireAlanSonuc);

        double daireCevreSonuc = daireCevre(6);
        System.out.println("Daire Cevre Sonuc = " + daireCevreSonuc);

        int dikdörtgeninCevresiSonucu = dikdörtgeninCevresi(7, 8);
        System.out.println("dikdörtgenin Cevresi = " + dikdörtgeninCevresiSonucu);

        int dikdortgeninAlanSonucu = dikdörtgeninAlani(8,9);
        System.out.println("Dikdortgenin Alan Sonucu = " + dikdortgeninAlanSonucu);

        int hacimSonuc = prizmaninHacmi(4,5,3);
        System.out.println("hacimSonuc = " + hacimSonuc);

        int prizmaAlanSonucu = prizmaninAlani(4,5 ,3);
        System.out.println("prizmaAlanSonucu \n = " + prizmaAlanSonucu);


        System.out.println("\n********** Practise exercises ********************");
        System.out.println("\nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN\n");
        //****pratik olarak önce TECHPRO EDUCATION yaz ondan sonra "\n" lari koy****
        //JAVA ILE GÜZEL DÜNYA her bir kelime alt alta gelecek sekilde yaziniz
        System.out.println("JAVA\nILE\nGÜZEL\nDÜNYA");
        //JAVA ILE GÜZEL DÜNYA kelimeler arasinda bir tab bosluk olacak   sekilde yaziniz
        System.out.println("JAVA\tILE\tGÜZEL\tDÜNYA");
        //pazzartesi kelimesinin herbir harfini tek bir satir kodda alt alta gelecek sekilde yaziniz
        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni\n");
        //"Techpro" ile java cok 'kolay' yazdiran bir kod yazin
        System.out.println("\"Techpro\" ile java cok \'kolay\'");

        System.out.println("\"MAHARET\" hic 'DUSMEMEK' degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");


    }

    public static int add(int a, int b) {
        return a + b;
    }

    protected static long multiply(long a, int b) {
        return a * b;

    }

    private static double ilkIkiCarpUcuncuTopla(double a, double b, double c) {
        return a * b + c;
    }

    static double kupHesaplama(double a) {
        return a * a * a;
    }

    //Daire'nin alanini hesaplayan ve yazdiran metodu olusturup kodu yaziniz.

    public static double daireAlan(double r) {
        return 3.14 * r * r;
    }
//Daire'nin cevresini hesaplayan ve yazdiran metodu olusturup kodu yaziniz.

    static double daireCevre(double r) {
        return 2 * 3.14 * r;
    }

//Dikdörtgen'nin cevresini hesaplayan ve yazdiran metodu olusturup kodu yaziniz.

    protected static int dikdörtgeninCevresi(int a, int b) {
        return 2 * (a + b);
    }
    //Dikdörtgen'nin    alanini hesaplayan ve yazdiran metodu olusturup kodu yaziniz.

    private static int dikdörtgeninAlani (int a, int b) {
        return a * b;
    }



    public static int prizmaninHacmi (int a, int b , int c){
        return a*b*c;
    }
    public static int prizmaninAlani (int a, int b , int c){
        return 2*(a*b + a*c + b*c);
    }
}
