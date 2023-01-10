package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {


/*
   6.soru: Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
    true veya false sonucu donen bir method olusturun.
 */

        String[] arr={"ali", "veli","ahmet","mehmet"};

        String arananIsim= "";

        boolean isimVarMi=false; // false

 boolean sonuc = isimAra(isimVarMi,"gani",arr);

        System.out.println("sonuc = " + sonuc);
        boolean ergebniss=search("ahmet",arr);
        System.out.println("ergebniss = " + ergebniss);
        boolean ergebniss2=search("gani",arr);
        System.out.println("ergebniss = " + ergebniss2);



    }

    public static boolean isimAra(boolean isimVarMi,String arananIsim,String []arr){

        for (String w : arr) {

            if (w.equalsIgnoreCase(arananIsim)){
                isimVarMi=true;
                break;
            }else {
                isimVarMi=false;

            }
        }

return isimVarMi;
    }



    //burada Array Liste gibimis oluyor ve contains ile icinde olup olmadigini boolean olarak döndürüyor.Java 8 de böyle yaziliyormus.
    public static boolean search(String searchname,String []arr){
        return Arrays.stream(arr).toList().contains(searchname);
    }

    //burada Array Liste gibimis oluyor ve contains ile icinde olup olmadigini boolean olarak döndürüyor.Java 9 dan itiabren böyle yaziliyor.
    public static boolean search2(String searchname,String []arr){
        return Arrays.toString(arr).contains(searchname);
    }
}