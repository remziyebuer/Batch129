package java_core.day01_variables;

public class Deutch_Variables01 {
    public static void main(String[] args) {
        // Package-Namen bestehen aus Kleinbuchstaben, wir schreiben sie niemals in Großbuchstaben.
        // Klassennamen beginnen mit Großbuchstaben, wir verwenden niemals Kleinbuchstaben, um sie zu beginnen.
        // Methodennamen und Variablennamen werden in CamelCase geschrieben.
        // ________________________________
        System.out.println("Ali");
        System.out.println("Can");
      // Variable erstellen
      // Ein Satz in Java ist ein Statement.
      // Wenn Sie keinen Zugriffsmodifikator angeben, bedeutet "default", dass der Zugriffsmodifikator "default" ist.
      // Wenn Sie eine Variablendeklaration machen, aber keine Zuweisung vornehmen, setzt Java eigene Werte (Standardwerte).
      // Die Standardwerte für Zahlen sind 0.
      // Der "Default-Wert" für Strings ist "null"; das Fehlen des Fehlens ist wie die leere Menge, die Teilmenge jeder Menge ist.
        //1. Daten Typ: int, String, char, boolean, byte, short, long, float, double
      //2. Variablenname: studentName, yas, isminIlkHarf, emeklimisin, studentAge, siteNufusu, countryPopulation, cellNumberInHumanBody, weightOfSun
      //3. Attributionsoperator: =
      //4. Variablenwert: 13, "Ali Can", 'A', false, 23, 1200, 1864184648, 87654321356788L, 1234567

              int yas = 13;
              String studentName1 = "Ali Can"; // zwischen dem Datentyp und dem
        // Variablennamen sollte mindestens ein Leerzeichen stehen, aber mehr als
        // eins wäre auch kein Problem.

        // HOCA'S ANMERKUNGEN:
        // Variable erstellen
        // Java-Satz = Statement
        // In Java bedeutet "=" "Zuweisungsoperator". Es nimmt den Wert auf der rechten
          // Seite und legt ihn in das Feld auf der linken Seite.Wenn Sie keinen
          // Zugriffsmodifikator angeben, bedeutet "default", dass der Zugriffsmodifikator
          // "default" ist.
          // Datentyp + Variablenname ==> Variablendeklaration
          // Zuweisungsoperator + Variablenwert ==> Zuweisung
          // Wenn Sie eine Variablendeklaration machen, aber keine Zuweisung vornehmen, setzt
          // Java ihre eigenen Werte (Standardwerte).
          // Die Standardwerte für Zahlen sind 0.
          // Schreiben Sie den Datentyp auf Englisch, schreiben Sie den Variablennamen, den
          // Zuweisungsoperator und den Variablenwert. Beenden Sie den Satz wie im Englischen
          // mit einem Semikolon ;

        // Beispiel 1: Erstellen Sie eine Variable für den Namen des Studenten und weisen
        // Sie den Wert "Ali Can" zu.
        // String-Werte müssen in doppelte Anführungszeichen eingeschlossen sein.
        // Der "Default-Wert" für Strings ist "null".
                String studentName = "Ali Can";

        /*
           In Java gibt es grundsätzlich zwei Arten von Daten:
           1) primitive Datentypen:
                char: Wird für einzelne Zeichen verwendet. A, x, ?, 5
                boolean: Booleans können nur zwei verschiedene Werte annehmen: true (wahr)
                oder false (falsch).
                byte: Wird für Ganzzahlen von -128 bis +127 verwendet (1 Byte).
                short: Wird für Ganzzahlen von -32768 bis 32767 verwendet (2 Byte).
                int: Wird für Zahlen von -2.147.483.648 bis 2.147.483.647 verwendet (4 Byte).
                long: Wird für Zahlen von -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
                verwendet (8 Byte).
                float: ...
                double: ...
           2) nicht-primitive Datentypen

        */

          // Beispiel 2: Erstellen Sie eine Variable vom Datentyp char für den ersten Buchstaben
          // Ihres Namens und weisen Sie einen Wert zu.
          // Hinweis: Im Datentyp char müssen Werte in einfache Anführungszeichen eingeschlossen
          // werden.
                char isminIlkHarf = 'A';

          // Beispiel 3: Erstellen Sie eine Variable vom Datentyp boolean, um zu überprüfen, ob
          // Sie im Ruhestand sind, und weisen Sie den Wert false zu.
                boolean emeklimisin = false;

          // Beispiel 4: Erstellen Sie eine Variable vom Datentyp byte für das Alter des Schülers
          // und weisen Sie einen Wert zu.
                byte studentAge = 23;

          // Beispiel 5: Erstellen Sie eine Variable für die Bevölkerungszahl einer Website und
          // weisen Sie einen Wert zu.
                short siteNufusu = 1200;

          // Beispiel 6: Erstellen Sie eine Variable für die Bevölkerungszahl eines Landes
          // und weisen Sie einen Wert zu.
                int countryPopulation = 1864184648;

        // Beispiel 7: Erstellen Sie eine Variable für die Anzahl der Zellen im menschlichen
        // Körper und weisen Sie einen Wert zu.
        // Hinweis: Wenn eine Zahl in einen long-Datentyp zugewiesen wird, fügen Sie "L"
        // (bevorzugt) oder "l" am Ende hinzu.
                long cellNumberInHumanBody = 87654321356788L;

        // Wenn der zugewiesene Wert einer long-Variablen in den Bereich der int-Variablen passt,
        // ist das Hinzufügen von "L" am Ende nicht erforderlich.
          long weightOfSun = 1234567;
    }
}
