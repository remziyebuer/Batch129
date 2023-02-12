package java_core.day36lambda;

import java.sql.SQLOutput;

public class Utils {
    //utils lazim olacak metodlarin konuldugu yer.depo gibi.
    //mesela projemde durmadan bir sayinin karesini alacaksam;
    public static  int getLengthSquare(String s){
      return s.length()*s.length();
    }

    public static  boolean isEven(String s){
        return s.length()%2==0;
    }
    //utis'i kalabaliklastirmayin bir defa kullanacaginiz seyi
    // koymayin cöplüge cevirmeyelim bir seyi utils ekoyacaginizda
    // suna emin olmalisniz:bu herkesin isine yarayacak bir sey.

    public static String getLastChar(String s){
        return s.substring(s.length()-1);
    }

    public  static  void printInTheSameLineWithSpace(Object obj ){// hem Stringler hem de int'ler icin
        // kullanabilmeliyim

        System.out.println(obj + " ");
    }
}
