package practiceday02;

public class C02_MethodCreation {
    //Dikdörtgenin alanini hesaplayan kodu yaziniz ve kullaniniz

    public static void main(String[] args) {

        int sonuc = dikdörtgeninAlani(4,9);
        System.out.println("sonuc = " + sonuc);

    }
    public static int dikdörtgeninAlani ( int a, int b){
        return a*b;
    }


}