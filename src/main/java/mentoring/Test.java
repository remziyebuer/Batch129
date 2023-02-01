package mentoring;

import java.sql.SQLOutput;
import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.DAYS;

public class Test  {
    public static void main(String[] args) {

//
//
//    LocalDate dateBefore = LocalDate.of(2022, Month.FEBRUARY, 24);
//
//    LocalDate dateAfter = LocalDate.of(2023, Month.MARCH, 29);
//    long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
//        System.out.println(noOfDaysBetween);


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen alis tarihi giriniz");
        String startDate= scan.nextLine();


        System.out.println("lutfen alis tarihi giriniz");
        String endDate= scan.nextLine();

      //  long noOfDaysBetween = DAYS.between(startDate, endDate);







}
}