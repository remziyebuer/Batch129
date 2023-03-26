package java_core.day37lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaWiederholung3 {
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSummmeAllElements(myList));
        System.out.println("---------------------------------");
        System.out.println(getSumvon7bis70());
        System.out.println("---------------------------------");
        System.out.println(getMultiVon3Bis9());
        System.out.println("---------------------------------");
        System.out.println(getMultiVon3Bis9zwei());
        System.out.println("---------------------------------");
        System.out.println(getfaktorielleOperation(5));
        System.out.println("---------------------------------");
        System.out.println(getSummeMitzwischenZahl (5,14));
        System.out.println("---------------------------------");
        System.out.println(getSumvonZifferZwischenZahl(120,98));

    }

    //1)Erstellen Sie die Methode, die die Summe aller Zahlen in der angegebenen Liste liefert.

    public static int getSummmeAllElements(List <Integer> meinList){
        return  meinList.stream().reduce(Math::addExact).get();
        // Kommt Optional wir wandeln int um.
        // addExact Methode wird angegebenen Liste Summe
    }
    //2) Schreiben Sie den Code, der die Summe aller ganzen Zahlen von 7 bis 70 ergibt
    public static int getSumvon7bis70(){ //Wenn wir kein List haben benutzen wir mit InStream
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
                //rangeClosed Methode 7 und 70 inklusive
                // getAsInt Methode nimmt als int

    }
    //3) Von 3 bis 9 ganze Zahle multipieren...
    public static  int getMultiVon3Bis9(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    public static  int getMultiVon3Bis9zwei(){
        return    IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }           //ranagevon 3 bis 9 außer 10. wie substring

    //4)Berechnen Sie die Fakultät der Ihnen gegebenen Zahl
    public static int getfaktorielleOperation(int x){

        IntStream.rangeClosed(1,x).reduce(Math::addExact).getAsInt();
        //Wenn -5 gibt
        if(x==0){
            return 1;
        } else if (x<0) {
            System.out.println("Diese geht nicht mit Minus Zahl leider");
            return -1;
        }else {
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }

    }


    //5) Schreiben Sie den Code, der uns die Summe aller
    // geraden Zahlen zwischen zwei uns gegebenen ganzen Zahlen liefert.

    public static int getSummeMitzwischenZahl(int a , int b){

        // außer a und b
        //Du kannst manchmal stattdesen Reduce sum benutzen
        //Im Parameter können sie zuerst eine große Zahl
        // und dann eine kleine schreiben, also sollte ich if verwenden.

        // Es ist ein SWAP!!!
        if (a>b){      // 5<15
            int temp=a;// neu a
            a=b;       // a=b
            b=temp;    // b=a
        }
         return IntStream.range(a+1,b).filter(UtilsforLambda2::isGeradeZahl).sum();
    }

    //6)Schreiben Sie den Code, der Ihnen die Summe der Ziffern aller ganzen Zahlen zwischen den beiden gegebenen ganzen Zahlen gibt.
    //Also ; Es sollte 12 und 18 sein ==> 13,14,15,16,17==> 4+5+6+7+8=30

    public static int getSumvonZifferZwischenZahl(int a , int b){
        if (a>b){      // 5<15
            int temp=a;// neu a
            a=b;       // a=b
            b=temp;    // b=a
        }
         return  IntStream.range(a+1,b).map(UtilsforLambda2::getSumvonZiffer).sum();
    }



}