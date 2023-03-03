package java_core.day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdawiederholung1 {

        /*        1) Lambda ist F.programming.dh mit Methode Code zu schreiben
                  2) "Functional programming" =Bezüglich was zu tun ist? nicht wie zu tun ist.
                  3) "Functional programming" wird mit Collections und Array benutzt.
                  4) Lambda wurde mit Java 8 eingefügt.
                  // zb. was ich verstehe :) Spielzeug selbst(Structured) aufbauen umständlich Aber mit Lego(Lambda-Functional) einfach;

         */
        public static void main(String[] args) {
            List<Integer> nums = new ArrayList<>();

            nums.add(12);
            nums.add(9);
            nums.add(131);
            nums.add(14);
            nums.add(9);
            nums.add(10);
            nums.add(4);
            nums.add(12);
            nums.add(15);



            System.out.println("1-Einfach List : ");
            System.out.println(nums);
            System.out.println();
            System.out.println("2-gerade Elemente-Struc : ");
            printElementsstruc(nums);
            System.out.println();
            System.out.println("3-gerade Elemente-Funk : ");
            printElementsfunc(nums);
            System.out.println();
            System.out.println("4-ungerade Elemente-Funk : ");
            printungeradeElements(nums);
            System.out.println();
            System.out.println("5-Quadrat Elemente");
            printQuadratungeradenElemente(nums);
            System.out.println();
            System.out.println("6-gerade mit ein paar Bedinungen Elemente");
            printSummeQuadratGerade(nums);
            System.out.println();
            System.out.println("7-gerade mit ein paar Bedinungen Elemente");
            geradeZahlQuadratsmitDistinct(nums);
            System.out.println();
            System.out.println("8-gerade mit ein paar Bedinungen Elemente");
            geradeZahlQuadratsmitDistinct(nums);


        }


        //1- Setzen Sie einen Methode, die Werte der einer List gleich Zeile mit Leerzeichnen gibt, um.
        public static void printElementsstruc(List<Integer> num) {
            for (Integer w : num) {
                System.out.print(w + " ");
            }

        }


        //2- Setzen Sie einen Methode, die Werte der einer List gleich Zeile mit Leerzeichnen gibt, um.(Functional)
        public static void printElementsfunc (List<Integer> nums){
            //wandelt Stream um dann wird Schleif t-> for t macht
            //Stream wird von oben zum hinten zuordnet .
            nums.stream().forEach(t-> System.out.print(t+" "));
        }


        // Setzen Sie einen ungerade Methode, die Werte der einer List gleich Zeile mit Leerzeichnen gibt, um.(Functional)

    public static void printungeradeElements (List<Integer> nums){
            for (Integer w:nums){
                if (w%2==0){
                System.out.print(w+" ");
            }}
        }



        //Setzen Sie einen ungerade Methode, die Werte der einer List gleich Zeile mit Leerzeichnen gibt, um.Functional
        public static void printungeradaElements(List<Integer> nums) {
            //  nums.stream().filter(t ->t%2==0).forEach(t -> System.out.print(t + " "));
            //Es ist besser zum Lesen

               nums.
                    stream().
                    filter(t -> t%2 == 0).//Filter- wird t und wenn du neu Bedinungen einfügen möchtest mit && zeichnen
                    forEach(t -> System.out.print(t + " "));
        }

    //Setzen Sie einen ungerade Methode, die Werte der einer List gleich Zeile mit Leerzeichnen gibt, um.Functional


        public static void printQuadratungeradenElemente(List<Integer> nums) {
            // map Methode um den bestehenden Wert zu ändern
                    nums.
                        stream().
                        filter(t->t%2!=0).
                        map(t->t*t).//map wie Set Method
                        forEach(t-> System.out.print(t+" "));

        }

        //Eine Methode, die die Würfelwerte mit gerade Zahl gibt.
       public static void printWürfelWerte(List<Integer> nums){
                nums.
                    stream().
                    distinct(). //Ohne wiederholungende Werte mit neu List wird erzeugt.Egal du kannst distinct irgendwo anlegen.
                                //Aber man sollte beste Ort finden für Performans
                    filter(t->t%2!=0).

                    map(t->t*t*t).forEach(t-> System.out.println(t +" "));
        }

    // Bedinungen Summe+Quadrat+gerade Zahlen+sich nicht wiederholende Zahlen
        public static void printSummeQuadratGerade(List<Integer> nums) {
             Integer sum=   nums.
                    stream().
                    distinct().
                    filter(t->t%2==0).
                    map(t->t*t).
                    reduce(0,(t,u)->t+u); // mach aus viel eins birden cok degerden bir tek degere indirme//erste Wert mit 0(zero) gibt.
            System.out.print(sum);

        }


   /*     "stream()“ ordnet die Elemente von oben nach unten an. „Lambda“ wandelt die Liste in „stream“ um.
        "filter()" für Filter
        "map()" u map wie Set Methode
        "distinct()" zeigt die wiederholten Elemente nur einmal und die nicht wiederholten Elemente so wie sie sind.
        Wenn due die Distinct-Methode an erster Stelle steht, wird "Lambda" weniger Arbeit erledigen.for Performans

        Orn; reduce(0,(t,u)->t+u) ==> "t" nimmt den ersten Wert von „Null“, die nächsten Werte aus dem Ergebnis der Addition.
        "u" bekommt seine Werte immer von "stream" zb. erste Wert 0 dann kommt erste Werte von List 0+144 dann wird 144+ 196...
        */
            //Setzen Sie eine Methode,die der größten Wert findet, um.
        public static void geradeZahlQuadratsmitDistinct(List<Integer> nums) {
            double wert= nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
           //reduce Methode ist ein Generic Class identiy wenn es Double wäre dann kommt ausgabe als Double
            System.out.println(wert); // wenn minus kommt kommt großer Zahl als Integer Wert,der großten Werte nimmt.
        }


        //Frage maX Werte zu kriegen
        //erste Weg
        public static void getMaxWert(List<Integer> nums) {
            Integer max= nums.
                    stream().
                    distinct().
                    reduce(Integer.MIN_VALUE,(t,u)->t>u ? t:u);


            //// Ich werde Reduce() verwenden, da das Finden des Maximalwerts auch bedeutet,
            // ihn auf einen einzelnen Wert zu reduzieren.

            //Es ist üblich, Integer.MIN_VALUE zu verwenden, wenn nach dem Maximalwert gesucht wird.
            //oder umgekehrt, Integer.MAX_VALUE zu verwenden, wenn nach dem Mindestwert gesucht wird.

            System.out.println(max);
        }

        //zweite Weg FRage maX Werte zu kriegen
        public static void getMaxWert2(List<Integer> nums) {

            Integer max = nums.stream().distinct().reduce(nums.get(0),(t,u)->t>u ? t:u);
            System.out.println(max);

        }

        //3.Weg FRage maX Werte zu kriegen
                public static void getMaxValue3(List<Integer> nums) {
        // Optional Data Type zum Integer wandelt mit get() um.
                    // Werte sortieren
            Integer max = nums.stream().distinct().sorted().reduce((t, u) ->u).get();
        /*
        Integer (opsiyonel int)
        Definition: Ein normaler Integer ist ein Zahntyp und kann standardmäßig einen Wert enthalten oder auch nicht.
        Optional Integer ist ein Zahntyp und kann unsicher einen Wert enthalten oder auch nicht.
        Verwendung: Ein normaler Integer kann zu Fehlern führen, wenn kein Wert zugewiesen wird.
        Optional Integer verhindert Fehler, indem es einen leeren Wert anzeigt, wenn kein Wert zugewiesen wird.*/

            System.out.println(max);
        }

        //Minumum Werte zu finden

         //1. Weg

        public static  void getMinWert(List<Integer>nums){


            Integer min =  nums.stream().distinct().reduce((t,u)->t>u ? t : u).get();
            System.out.println(min);

        }
          //2.Weg
        public static  void getMinWert2(List<Integer>nums) {
            Integer min = nums.
                    stream().
                    distinct().
                    sorted(Comparator.reverseOrder()).//umgekehrte Reihenfolge normalerweise sorted() vom kleinsten zum größten.
                    reduce((t, u) -> u).get();//bu iki degerden u ' yu al

////sorted(Comparator.reverseOrder()):bedeutet umgekehrte Reihenfolge,
// ich finde die kleinsten, ich sortiere sie vom größten zum kleinsten.       }
        }
           //3.Weg

        public static  void getMinWert3(List<Integer>nums) {
            Integer min = nums.stream().distinct().reduce((t, u) -> t).get();


            // t von diesen beiden Werten nehmen;
            //Wenn wir vom größten zum kleinsten sortieren, nehmen wir den kleinen Wert t, nicht den großen Wert.
            // Finde den Mindestwert.

            //4.Weg
        }
        public static  void getMinWert4(List<Integer>nums) {
            Integer min = nums.stream().distinct().reduce((t, u)-> Math.min(t,u)).get();
             // Math.MIN Method ruft

        }


        //Minimum Wert,der großer >7 und gerade Zahl

        public static  void getMingrosserSiebenGeradeZahl(List<Integer> nums){
          Integer min=  nums.stream().filter(t->t>7 && t%2==0).sorted().reduce((t,u)->t).get();
            System.out.println(min);
        }
    }


