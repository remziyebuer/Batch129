package mentoring;


import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalismaBolumu {
    public static void main(String[] args) {

    /*
    3)Tek bir string icerisinde verilen euro ve dolarin ayri ayri toplamlarini bulan kod yaziniz.
        String= $1 "$12 €34 €56 $45 €78";
        dolarToplami:58
        euroToplami:168      (Q05_ForEach_EuroDolar)

  */
        String str ="$1 $12 €34 €56 $45 €78";
        String arr[]=str.split(" ");

        System.out.println(Arrays.toString(arr));
        int dolarTop = 0;
        int euroTop = 0;
        for (String w : arr){
            if(w.contains("$")){
                w.replace("\\D","");
             dolarTop  += Integer.valueOf(w);
            }
            else {
                w.replace("\\D","");
                euroTop +=  Integer.valueOf(w);
            }
        }
        System.out.println("dolarTop = " + dolarTop);
        System.out.println("euroTop = " + euroTop);
    }
}

