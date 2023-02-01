package übungen;

import java.util.Scanner;

public class DoktorMethodlar {
    public static void doktorMenusuGoster() {
        Scanner scan = new Scanner(System.in);
        int secim;
        do{
            System.out.println("\n=====DOKTOR MENUSU=====\n" +
                    "1-Doktor Ekle\n" +
                    "2-Doktor Listesi Yazdir\n" +
                    "3-Unvandan Doktor Bulma\n" +
                    "4-Doktor Silme\n" +
                    "5-Ana Menu\n" +
                    "6-Cikis" +
                    "Yapmak istediginiz islemi seciniz\n");

            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    //doktorEkle();
                    break;
                case 2:
                   // doktorListesiYazdir();
                    break;
                case 3:
                   // unvandanDoktorBulma();
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");

            }
        }while(secim!=6);

    }
//********************************************************************************************

}
