package übungen;

import java.util.Scanner;

public class Hastahane extends VeriBankasi {
    Doktor doktor= new Doktor();
    Hasta hasta = new Hasta();


    public static void anaMenuCagir() {
        System.out.println("\n***QA TEAM-1 TIP MERKEZINE HOSGELDINIZ***\n\n"
                +"1-Doktor Menusu\n"
                +"2-Hasta Menusu\n"
                +"0-Cikis\n"
                + "Yapmak istediginiz islemi seciniz\n");
    }
    //***************************************************
    public  static void start() {
        int secim;

        do {
            anaMenuCagir();
            Scanner scan = new Scanner(System.in);
            secim = scan.nextInt();
            switch (secim) {
                case 1:

                    break;

                case 2:

                    break;
                case 0:
                    System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");
            }
        } while (secim != 0);


    }
    //**********************************************************************


    }
