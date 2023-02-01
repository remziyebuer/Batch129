package java_core.day02_datatypes_methodcreation;

public class ikinciGünÖdev {
    //Ödev sorulari
    //Dikdörtgenin alanini hesaplayan metodu olusturunuz ve kullaniniz.
    //Dikdörtgenin cevresini hesaplayan metodu olusturunuz ve kullaniniz.
    //Dairenin alanini hesaplayan metodu olusturunuz ve kullaniniz.
    //Dairenin cevresini hesaplayan metodu olusturunuz ve kullaniniz.
    public static void main(String[] args) {
        int dikdörtgeninAlani = areaOfRectangle(4, 5);
        System.out.println("dikdörtgeninAlani = " + dikdörtgeninAlani);

        double daireninAlani = areaOfCircle(3);
        System.out.println("daireninAlani = " + daireninAlani);

        int dikdörtgeninCevresi = perimeterRectangle(7, 8);
        System.out.println("dikdörtgeninCevresi = " + dikdörtgeninCevresi);

        double daireninCevresi = perimeterCircle(4);
        System.out.println("daireninCevresi = " + daireninCevresi);



    }


    //Ödev sorulari
//Dikdörtgenin alanini hesaplayan metodu olusturunuz ve kullaniniz.
    public static int areaOfRectangle(int a, int b) {
        return a * b;
    }
    //Dikdörtgenin cevresini hesaplayan metodu olusturunuz ve kullaniniz.

    protected static int perimeterRectangle(int a, int b) {
        return 2 * (a + b);
    }

    //Dairenin alanini hesaplayan metodu olusturunuz ve kullaniniz.
    private static double areaOfCircle(double r) { //metodun icine sadece degisecek olan degeisken girer.
        // pi sabit oldugundan parantezin icine yazmaya gerek yok.Süslü parantezde declare edilip degeri atanabilir
        double pi = 3.14;
        return pi * r * r;
    }

    //Dairenin cevresini hesaplayan metodu olusturunuz ve kullaniniz.
    static double perimeterCircle(int r) {
        double pi = 3.14;
        return 2 * 3.14 * r;
    }
}
