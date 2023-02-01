package java_core.day22_staticblocks_consturctors_datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Calisma {
    public static void main(String[] args) {

        Date myObj = new Date();
        System.out.println("myObj = " + myObj);

        System.out.println("1 Ocak 1978 (digital zaman baslangici)'den bu yana gecen zaman = " + myObj.getTime());

        System.out.println("Su an bulundugum yerde tarih = " + LocalDate.now());

        System.out.println("Su an bulundugum yerde zaman = " + LocalTime.now());

        System.out.println("Su an bulundugum yerde tarih ve zaman birlikte = " + LocalDateTime.now());


        System.out.println("Tokyo ' da tarih zaman = " + LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println("Viana ' da tarih zaman = " + LocalDateTime.now(ZoneId.of("Europe/Vienna")));
        System.out.println("Moscow 'da tarih zaman = " + LocalDateTime.now(ZoneId.of("Europe/Moscow")));


        System.out.println("Tarihte ileri gitme " + LocalDate.now().plusYears(5)
                .plusMonths(5).plusWeeks(5).plusDays(5));

        System.out.println("Tarihte geri gitme = " + LocalDateTime.now().minusYears(5)
                .minusMonths(5).minusDays(5));

        System.out.println("Zamanda ileri gitme = " + LocalTime.now().plusHours(5)
                .plusMinutes(45));
        System.out.println("Zamanda geri gitme = " + LocalTime.now().minusHours(5)
                .minusMinutes(15));


        System.out.println("Tarihin istenilen bir bolumunu alma =  "
                + LocalDate.now().getDayOfMonth() + " . " + LocalDate.now().getMonthValue());

        System.out.println("Zamanin istenilen bir bolumunu alma = "
                + LocalTime.now().getHour() + " : " + LocalTime.now().getMinute());


        // iki tarih karsilastirma
        boolean buyukMu = LocalDate.of(2013, 04, 18).
                isEqual(LocalDate.of(2016, 05, 18));

        System.out.println("buyukMu = " + buyukMu);

        //tarihlerin formati nasil degistirilir

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Tarihi formatla = " + dtf.format(LocalDate.now()));

        //Time i formatlayiniz
        LocalTime myTime = LocalTime.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh-mm");
        System.out.println("Zamani formatla = " + dtf.format(myTime));
    }
}