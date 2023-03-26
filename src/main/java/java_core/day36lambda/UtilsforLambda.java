package java_core.day36lambda;
//wieder und wieder spezielle Methoden erforderlich
// wie Hammer braucht man

public class UtilsforLambda {
    public static int getLengthQaudrat(String s){
        return  s.length()*s.length();
    }

    public static boolean isGeradeZahl(String s){//ist es gerade oder?
        return s.length()%2==0;
    }

    public static String getNimmtChar(String s){
        return s.substring(s.length()-1);
    }
    public static void printImgleichZeileMitLeerzeichnen(Object obj){
        System.out.println(obj+" ");

    }
}
