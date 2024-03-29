package advanced_java.practice13;
import java.util.Arrays;
import java.util.Scanner;
public class Q04_KursaOgrenciSec {

/*
 Spor kursu için seçilecek öğrencileri belirleyen bir kod yazınız.
       kurs gereklilikleri:
            erkekler: boy: 1.60 ve üstü
                      kilo:70-90 kg
            kızlar: boy: 1.50 ve üstü
                    kilo:50-70 kg
       kullanıcıdan öğrenci sayısı ve herbir öğrenci
       için isim , cinsiyet, kilo ve boy bilgilerini girmesini
       isteyiniz.
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ogrenci sayisini giriniz");
        int ogrenciSayisi= input.nextInt();

        String [] isimArr = new String[ogrenciSayisi];
        String [] cinsiyetArr = new String[ogrenciSayisi];
        double [] kiloArr  = new double[ogrenciSayisi];
        double [] boyArr  = new double[ogrenciSayisi];




        for (int i = 0; i <ogrenciSayisi ; i++) {
            input.nextLine();//dummy
            System.out.println(i+1+". ismi giriniz: ");
            isimArr[i] =input.nextLine();
            System.out.println("Cinsiyeti giriniz (E,K): ");
            String cinsiyet= input.next().toLowerCase().trim().substring(0,1);
            if(cinsiyet.equals("e")||cinsiyet.equals("k")){
                cinsiyetArr[i]=cinsiyet;
            }else {
                System.out.println( "Hatali giris !!! yeniden giriniz...");

                i--;
                continue; //continue'de yanlış girildiyse başa dön demek. bu for loop için geçerli hangisinni içindeyse onu başa alır
            }

            System.out.println("Kilo giriniz (kg.):");
            kiloArr[i] =input.nextDouble();

            System.out.println("Boy giriniz (mt):");
            boyArr[i] =input.nextDouble();

        }
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));
        System.out.println("Arrays.toString(cinsiyetArr) = " + Arrays.toString(cinsiyetArr));
        System.out.println("Arrays.toString(kiloArr) = " + Arrays.toString(kiloArr));
        System.out.println("Arrays.toString(boyArr) = " + Arrays.toString(boyArr));
        int sayac = 0;
        System.out.println("Kursa Secilen Ogrenciler:");
        for (int i = 0; i < ogrenciSayisi; i++) {
            if (cinsiyetArr[i].equals("k") && kiloArr[i] >= 50 && kiloArr[i] <= 70 && boyArr[i] >= 1.5) {
                System.out.println(isimArr[i]);
                sayac++;
            } else if (cinsiyetArr[i].equals("e") && kiloArr[i] >= 70 && kiloArr[i] <= 90 && boyArr[i] >= 1.6) {
                System.out.println(isimArr[i]);
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Kursa secilen ogrenci yoktur!!!");
        }




    }

}
