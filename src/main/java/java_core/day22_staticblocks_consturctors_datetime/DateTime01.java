package java_core.day22_staticblocks_consturctors_datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {
        Date myDate = new Date();//Date objesi olusturdum.non - staticleri
        // görmek istiyorum
        System.out.println("myDate = " + myDate);//myDate = Sat Jan 07 21:27:12 CET 2023
        System.out.println("myDate.getTime() = " + myDate.getTime());//1 Ocak 1978 den
        // bu yana gecen milisaniyeleri verir.Bu tarih digital zamanin baslangic tarihidir
       //( insan oglu hic yerinde durmuyor. 1ms de artik aslinda bir önceki konumunda olmuyor.
        // Dünya hep dönüyor ayni anda iki farkli kisinin alma ihtimali yok)

        //Icinde bulundugumuz an nasil alinir?
        System.out.println("LocalDate.now() = " + LocalDateTime.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        LocalDateTime.now().atZone(ZoneId.of("Asia/Tokyo"));
        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:46:03.823077500
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:46:03.824073500
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:03.824073500

//Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12

//Geriki bir tarihe nasil gideriz?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2)) ;//2018-10-05

//Ileriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().plusHours(3)); //02:56:25.564030700

//Geriki bir zamana nasil gidertiz?
        System.out.println(LocalTime.now().minusMinutes(45)); //23:13:17.952923300

//Zaman'da belli bir bölümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//16:2

        //Tarih'de belirli bir bolumu nasil aliriz ?
        System.out.println(LocalDate.now().getMonth() + " " + LocalDate.now().getDayOfMonth());//JANUARY 8
        System.out.println(LocalDate.now().getMonthValue() + "." + LocalDate.now().getDayOfMonth());//1.8

    }
}
