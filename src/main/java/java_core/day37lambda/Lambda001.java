package java_core.day37lambda;

import java_core.day36lambda.Utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda001 {


    public static void main(String[] args) throws IOException {
    // Der Text vom LambdaWiedeholungTextFile gibt Console aus.

        Files.lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).
              forEach(System.out::println);
        //lines Zeilen
        // Der Text vom LambdaWiedeholungTextFile sollte man alles Charakter groß sein.



        Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpace);
        // Der Text vom LambdaWiedeholungTextFile möchte ich wissen,ob diese Wort gibt.

        boolean ergebnis=Files.
             lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).//Stream 4 Zeilen
                map(t->t.split(" ")). //Jede Zeile teilt mit Leerzeichnen. Split Methode erzuegt für jede Zeile Array
                flatMap(Arrays::stream). //jedes Wort wird erzuegt.Dann wurde Array abgebrochen.
                anyMatch(t->t.contains("Java"));//Gibt es Java im Text? dh anyMatch Methode jedes passende Wort gibt es?
        System.out.println(ergebnis);
        // Der Text vom LambdaWiedeholungTextFile möchte ich wissen, ob jedes Wort "a" Charakter gibt.

        boolean ergebnis2=Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).//Stream 4 Zeilen
                        map(t->t.split(" ")). //Jede Zeile teilt mit Leerzeichnen. Split Methode erzuegt für jede Zeile Array
                        flatMap(Arrays::stream) //Jedes Wort wird erzeugt.Dann wurde Array abgebrochen.
                .allMatch(t->t.contains("a")); // Alle Wörter im alles Text sollte man "a" Character  haben.
                //.allMatch(t->t.length()>2)
        System.out.println(ergebnis2);

        // Für Text vom LambdaWiedeholungTextFile gibt eine Methode, die zeigt, dass kein Wort das Zeichen "x" enthält

        boolean ergebnis3=Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).//Stream 4 Zeilen
                        map(t->t.split(" ")). //Jede Zeile teilt mit Leerzeichnen. Split Methode erzuegt für jede Zeile Array
                        flatMap(Arrays::stream) //Jedes Wort wird erzeugt.Dann wurde Array abgebrochen.
                .noneMatch(t->t.contains("x")); // kein "x" im Text dh man sollte keine enthalten
        System.out.println(ergebnis3);


        //Schreiben Sie den Code, der die Wörter zählt, die mit „r“ enden, im Text
       long ergebnis4 =Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).//Stream 4 Zeilen
                        map(t->t.split(" ")). //Jede Zeile teilt mit Leerzeichnen. Split Methode erzuegt für jede Zeile Array
                        flatMap(Arrays::stream).
                filter(t->t.endsWith("e")).
                count(); //Zahl Count Methode ist LONG wird umgewandelt.
        System.out.println(ergebnis4);

            //Zweite WEG ohne Count
        long ergebnis5 =Files.
                lines(Paths.get("src/main/java/java_core/day37lambda/LambdaWiederholungTextFile.txt")).//Stream 4 Zeilen
                        map(t->t.split(" ")). //Jede Zeile teilt mit Leerzeichnen. Split Methode erzuegt für jede Zeile Array
                        flatMap(Arrays::stream).
                filter(t->t.endsWith("e")).
                collect(Collectors.toList()).size();
        System.out.println(ergebnis4);

    }



}
