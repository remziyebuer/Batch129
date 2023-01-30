package mentoring;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Test  {
    public static void main(String[] args) {



    LocalDate dateBefore = LocalDate.of(2022, Month.FEBRUARY, 24);

    LocalDate dateAfter = LocalDate.of(2023, Month.MARCH, 29);
    long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
}
}