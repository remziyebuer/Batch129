package java_core.day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdawiederholung2 {




    public static void main(String[] args) {


                List<Double> myList = new ArrayList<>();
                myList.add(12.0);
                myList.add(4.0);
                myList.add(7.0);
                myList.add(3.6);
                myList.add(26.8);
                myList.add(38.4);
                myList.add(26.8);

                List<Double> half = gethalfteUmgekehrtenReihnefolgeList(myList);
                System.out.println(half);//[19.2, 13.4, 6.0, 3.5]
        System.out.println("\n-----------------------");
        System.out.println(umgekehrtList(myList));

                List<String> list = new ArrayList<>();
                list.add("Hans");
                list.add("Gani");
                list.add("Ajda");
                list.add("BerTa");
                list.add("Remziye");
                list.add("klaus");
                list.add("MAria");
                list.add("Elfida");

        printalphabeticherReihenfolge(list);//HANS GANI AJDA BERTA KLAUS MARIA REMZIYE
        System.out.println("\n-----------------------");

        printAllesAlphabetischLowerDistinct(list);//remziye maria klaus hans gani berta ajda
        System.out.println("\n-----------------------");
                System.out.println();
        printAllesSortierenMitLengthUpperDistinct(list);
                System.out.println("\n-----------------------");
        printAllesSortierenMitLastCharUpperDistinct2(list);
        System.out.println("\n-----------------------");
        printAlleesSortierenMitLengthUpperDistinctGleichLengthsInAalphabetischer(list);
        System.out.println("\n-----------------------");
                System.out.println(removeElementWennLengthgrosserfünf(list));
        System.out.println("\n-----------------------");
                System.out.println(removeElementeWennStartsWithAoderrEndsMitD(list));
        System.out.println("\n-----------------------");
                System.out.println(printLengthQuadrat(list));
        System.out.println(printElementsLengthgeradeZahl(list));
            }


    // 1-Die Hälfte der Elemente, die größer als 5 in einer Liste sind,
    //sind in einer anderen, umgekehrten Reihenfolge

            public static List<Double> gethalfteUmgekehrtenReihnefolgeList(List<Double> myList) {
                return   myList.stream().distinct().filter(t->t>5).map(t->t/2).
                    sorted(Comparator.reverseOrder()).collect(Collectors.toList());
     //sorted(Comparator.reverseOrder()) normalweise von kleinsten zum größten aber mit Comparator umgekehrt.
     // Collect in List wollt deswegen collect(Collectors.toList()); man kann toSet sein.

            }

    public static List<Double> umgekehrtList(List<Double> myList){
        return myList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
//*********************************

    ////Lambda in Strings verwenden;



            //2- Drucken Sie die Elemente der Um-Liste in Großbuchstaben
            // in alphabetischer Reihenfolge ohne Wiederholungen.
            public static void printalphabeticherReihenfolge(List<String> list) {
                list.
                    stream().
                        distinct().
                        map(t->t.toUpperCase()).
                        sorted().forEach(t-> System.out.print(" "));

            }
            //Verwenden Sie map, um Zeichenfolgen in Großbuchstaben umzuwandeln

            public static void printAllesAlphabetischLowerDistinct(List<String> list) {
                list.
                        stream().
                        distinct().
                        map(t->t.toLowerCase()).
                        sorted(Comparator.reverseOrder()).
                        forEach(t-> System.out.print(t +" "));

            }

            //4: Drucken Sie alle Listenelemente in Großbuchstaben,
            // in aufsteigender Reihenfolge ihrer Länge, ohne Wiederholungen.
            public static void printAllesSortierenMitLengthUpperDistinct(List<String> list) {
                list.
                   stream().distinct().
                        map(t->t.toUpperCase()).
                        sorted(Comparator.comparing(t->t.length())).
                        forEach(t-> System.out.print(t+" "));
                // comparing =vergleich
            }

            //5: Drucken Sie alle Listenelemente in Großbuchstaben,
            // aufsteigend nach dem letzten Buchstaben, ohne Wiederholung.
            public static void printAllesSortierenMitLastCharUpperDistinct1(List<String> list) {

                list.
                        stream().
                        distinct().
                        map(t->t.toUpperCase()).
                        sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//letze Chrakter
                        sorted(Comparator.reverseOrder()).
                        forEach(t-> System.out.println(t+" "));

            }
    public static void printAllesSortierenMitLastCharUpperDistinct2(List<String> list) {

        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(UtilsforLambda::getNimmtChar).reversed()).//letze Chrakter
                forEach(UtilsforLambda::printImgleichZeileMitLeerzeichnen);

    }

            // 6-Drucken Sie alle Listenelemente in Großbuchstaben, in aufsteigender Reihenfolge der Länge, ohne Wiederholung.
            //Elemente gleicher Länge sollten in alphabetischer Reihenfolge sein


            public static void printAlleesSortierenMitLengthUpperDistinctGleichLengthsInAalphabetischer(List<String> list) {
                list.stream().distinct().map(String::toUpperCase).
                        sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                        forEach(System.out::print);

                //String :: length : Methode Referenz.Geht mal String Class und benutzt length Methode.
                // thenComparing nochmal vergleich.naturel Sortieren
                //t->t.toUpperCase() == String :: toUpperCAse
                //t->t.charAt(t.length()-1)) Lambda Expression
                // method ref. bevorzugt
            }
            //8) Elemente mit mehr als 5 Zeichen löschen.

            public static List<String> removeElementWennLengthgrosserfünf(List<String> list) {

           //Wenn Sie ein Element gemäß einer bestimmten Bedingung löschen möchten,
           //sollten Sie removeif() verwenden, aber diese Methode
           // Es gibt keinen Stream, also verwende ich keinen Stream.


                list.removeIf(t -> t.length() > 5);

                return list;
            }

            //8)Entweder A oder mit D angefangende Elemente als List sollte man löschen.
            public static List<String> removeElementeWennStartsWithAoderrEndsMitD(List<String> list) {
                list.removeIf(t->t.startsWith("A")||t.endsWith("d"));
                  return list;
            // || oder && kann man benutzen für Bedinungen
            // NOTE : wenn du Stream benutzen möchtest kannst du im return einfügen.
            // Beispiel return list.stream().distinct().collect(Collectors.toList());
            }

            //9-Nehmen Sie die Quadrate der Buchstabennummern der
            // Listenelemente und drucken Sie sie als Liste auf dem Bildschirm aus.

            public static List<Integer> printLengthQuadrat(List<String> list){

                return    list.stream().map(UtilsforLambda::getLengthQaudrat).collect(Collectors.toList());
                //length Datentyp ist int deswegen muss als List umwandeln.
                // t.length()*t.length() man kann als Met.Ref. Utils::getLengthSquare schreiben.
                //Utils sürekli kullanilan Metotlar gibi Wie Hammer

            }
            //10) Ausgabe der Listenelemente mit gerader Zeichenzahl auf dem Terminal in einer Liste.


            public static List<String> printElementsLengthgeradeZahl(List<String> list) {
        return list.stream().filter(UtilsforLambda::isGeradeZahl).collect(Collectors.toList());

            }



        }





