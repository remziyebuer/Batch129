package day23datetime_stringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //Example 1 : Time 'i formatlayiniz.
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//19:44:46.694079800

        //hh==> kucuk olan 12 saat lik saat sistemini kullanir.hh
        // kullandiginizda AM ya da PM demelisiniz, BUnu demek icin 'a'
        // yazmaniz yeterlidir.Yani "hh:mm a"
        DateTimeFormatter dtf =DateTimeFormatter.ofPattern("hh-mm a");
        System.out.println(dtf.format(myTime));//07-45 PM
        //HH ==> 24 saatlik saat sistemini kullanir
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH-mm ");
        System.out.println(dtf1.format(myTime));//19-48

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm :ss a ");
        System.out.println(dtf2.format(myTime));//07:49 :32 PM
    }
}
