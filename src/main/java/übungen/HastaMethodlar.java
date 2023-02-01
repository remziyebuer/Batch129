package übungen;



import java.util.Scanner;

public class HastaMethodlar {

    public static void hastaMenusuGoster() {
        System.out.println("=====HASTA MENUSU=====\n" +
                "1-Hasta Ekle\n" +
                "2-Hasta Listesi Yazdir\n" +
                "3-Hasta Durumu Listele\n" +
                "4-Hasta Silme\n" +
                "5-Hasta Bulma\n" +
                "6-Ana Menu\n" +
                "7-Cikis" +
                "Yapmak istediginiz islemi seciniz\n");

        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                //hastaEkle();
                break;
            case 2:
               // hastaListesiYazdir();
                break;
            case 3:
               // hastaDurumListele();
                break;
            case 4:
                break;
            case 5:
                //hastaBul();
                break;
            case 6:

                break;
            case 7:
                System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
                break;
            default:
                System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");


        }
    }
    //******************************************************************************
}
