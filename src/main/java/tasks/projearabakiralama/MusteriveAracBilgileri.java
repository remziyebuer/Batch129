package tasks.projearabakiralama;

import java.util.Date;
import java.util.Scanner;

public class MusteriveAracBilgileri {


    private static void aracTalep() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen  alinacak sehri giriniz");
        String alinacakSehir = scan.nextLine();
        System.out.println("Lutfen  teslim  sehri giriniz");
        String teslimEdilecekSehir = scan.nextLine();
        System.out.println("Lutfen  alinacak gun giriniz");
        String alinacakGun = scan.next();
        System.out.println("Lutfen  verilecek gun giriniz");
        String teslimEdilecekGun = scan.nextLine();
        System.out.println("Lutfen  teslim saati giriniz");
        String teslimSaati = scan.nextLine();

    }


}
