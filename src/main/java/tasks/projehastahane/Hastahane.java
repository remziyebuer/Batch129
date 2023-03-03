package tasks.projehastahane;


import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Hastahane extends VeriBankasi {


       public static void menuGoster() {
        System.out.println("\n***QA TEAM-1 TIP MERKEZINE HOSGELDINIZ***\n\n"
                +"1-Doktor Menusu\n"
                +"2-Hasta Menusu\n"
                +"0-Cikis\n"
        + "Yapmak istediginiz islemi seciniz\n");
    }
    //***************************************************
        public  static void start() throws InterruptedException {

              String secim;

do {


    menuGoster();
    Scanner scan = new Scanner(System.in);
    secim = scan.nextLine();
    switch (secim) {
        case "1":
            DoktorIslemleri.doktorMenusuGoster();
            break;
        case "2":
            HastaIslemleri.hastaMenusuGoster();
            break;
        case "0":
            System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
            break;
        default:
            System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");

    }
} while (!secim.equals("0"));






   }
}
