package advanced_java.practice5;

public class HacimRunner {
    //Küp, kare prizma ve dikdörtgen prizmanın
    // hacmini hesaplayan bir method oluşturunuz.(Method overloading kullanınız
    public static void main(String[] args) {
        Hacim hacim = new Hacim();//burada obje olusturduk
        int kup = hacim.hacimHesapla(5);
        int karePrizma = hacim.hacimHesapla(5, 6);
        int dikdortgenPrizma = hacim.hacimHesapla(5, 6, 7);

        System.out.println("kup = " + kup);
        System.out.println("karePrizma = " + karePrizma);
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);

    }
}