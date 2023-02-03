package mentoring;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {


    static LocalDate randevuGunu;
    static String randevuSaati;
    static Scanner input = new Scanner(System.in);

    public static void tarihOlusturma() {

        do {
            System.out.println("Lütfen size uygun randevu tarihini su formatta " +
                    "giriniz \"yyyy-MM-dd\"");
            String tarih = input.nextLine();
            LocalDate randevuGunu = LocalDate.parse(tarih);

            boolean result = randevuGunu
                    .isAfter(LocalDate.now());
            boolean result2 = randevuGunu
                    .isBefore(LocalDate.of(2023, 8, 30));
            System.out.println(result2);

            if (result == true) {

                if (result2 == true) {
                    System.out.println("Randevu gununuz basarili bir sekilde kaydedilmistir");
                    break;

                } else {
                    System.out.println("Ancak 2023-8-30 tarihine kadar termin verebiliyoruz.");
                }


            } else {
                System.out.println("Müsait olmayan ya da hatali bir randevu saati girdiniz.");
            }
        }while(true);

    }
//********************************
    public static void saatOlusturma() {
        List<String> saatler = new ArrayList<>();
        saatler.add("09:30");
        saatler.add("09:45");
        saatler.add("10:00");
        saatler.add("10:30");
        saatler.add("11:15");
        saatler.add("13:30");
        saatler.add("14:45");
        saatler.add("15:30");
        saatler.add("16:00");//bu listi veri bankasina koyup ordan cagirabilirsiniz
        // güya iste o gün müsait saatler bunlarmis bunlardan sececek sectikce
        // listeden silinecek ki baskasi o gune termin alamasin


        do {
            System.out.println("Lütfen asagidaki uygun randevu saatlerinden birini giriniz: " +
                    "\n" + saatler);

            randevuSaati = input.nextLine();
            if (saatler.contains(randevuSaati)) {
                saatler.remove(randevuSaati);
            }

            boolean silindiMi = saatler.remove(randevuSaati);
            if (silindiMi) {
                System.out.println("Randevu saatiniz basarili bir sekilde kaydedilmistir");
                break;
            } else {
                System.out.println("Müsait olmayan ya da hatali bir randevu saati girdiniz.");
            }

        } while (true);

    }

   //**************************************************
    public static void randevuOlusturma() {

        tarihOlusturma();
        saatOlusturma();


        System.out.println("SON MESAJ KISMINI SIZE BIRAKIYORUM ARKADASLAR:)))dilediginiz ama dinamik" +
                "bir sekilde yazabilirsiniz ");
//yardimci olur diye koydum asagidakini
        System.out.println("Randevu saati: \n " + randevuSaati + " Randevu Gününüz : \n"
                + randevuGunu + "Randevunuz basarili bir sekilde kaydedilmistir\n");

    }
}
