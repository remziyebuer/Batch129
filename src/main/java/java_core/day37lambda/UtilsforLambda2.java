package java_core.day37lambda;
//wieder und wieder spezielle Methoden erforderlich
// wie Hammer braucht man

public class UtilsforLambda2 {
    public static int getLengthQaudrat(String s){
        return  s.length()*s.length();
    }

    public static boolean isGeradeZahl(String s){//ist es gerade oder?
        return s.length()%2==0;
    }

    public static boolean isGeradeZahl(int s){//ist es gerade oder?
        return s%2==0;
    }
 public static int getSumvonZiffer(int x){

        int sum = 0;
        while (x!=0){
            sum += x%10; // zuerste Ziffer von letzte nimmt danach addiert sum danach erzuegt neu Container
            x=x/10; //decrement
        }
        return sum;
 }


    public static String getNimmtChar(String s){
        return s.substring(s.length()-1);
    }
    public static void printImgleichZeileMitLeerzeichnen(Object obj){
        System.out.println(obj+" ");

    }
}
