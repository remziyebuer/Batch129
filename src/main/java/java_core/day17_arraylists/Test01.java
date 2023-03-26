package java_core.day17_arraylists;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf.format(date));
    }
}