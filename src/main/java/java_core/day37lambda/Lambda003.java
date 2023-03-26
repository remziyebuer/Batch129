package java_core.day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda003 {
    public static void main(String[] args) {
        Kurse_ kursTag = new Kurse_("Sommer", "Vormittag Deutsch", 87, 128);
        Kurse_ kursAbend = new Kurse_("Winter", "Nachmittag Deutsch", 98, 154);
        Kurse_ kursKurdischTag = new Kurse_("Fruehling", "Vormittag Kurdisch", 95, 132);
        Kurse_ kursKurdsichAbend = new Kurse_("Winter", "Nachmittag Kurdisch", 93, 144);


        //Lambda arbeitet mit List deswegen fuegen wir einer List ein. Datentype Kurse_
        //
        List<Kurse_> coursesList = new ArrayList<>();
        coursesList.add(kursTag);
        coursesList.add(kursAbend);
        coursesList.add(kursKurdischTag);
        coursesList.add(kursKurdsichAbend);

        //1) Überprüfen Sie, ob alles durchschnittliche Punktzahl >91 ist






    }
}
