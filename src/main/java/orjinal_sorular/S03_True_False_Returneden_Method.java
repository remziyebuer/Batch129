package orjinal_sorular;

import java.util.Arrays;

public class S03_True_False_Returneden_Method {
    public static void main(String[] args) {


/*
   6.soru: Verilen bir array'in istenen bir elemani icerip icermedigini kontrol edip, bize
    true veya false sonucu donen bir method olusturun.

    Es gibt angegebene Array und erzeugen Sie bitte ein Method,der true oder false zurückgibt,
    und danach überprüfen Sie ,ob eingegebene Wert im Array ist.
 */

        String[] arr = {"ali", "veli", "ahmet", "mehmet"};

        String arananIsim = "";


        boolean sonuc = isimAra("ahmet", arr);

        System.out.println("sonuc = " + sonuc);
        boolean ergebniss = search("ahmet", arr);


        System.out.println("ergebniss = " + ergebniss);
        boolean ergebniss2 = search("gani", arr);
        System.out.println("ergebniss = " + ergebniss2);


    }

    public static boolean isimAra(String arananIsim, String[] arr) {
        boolean isimVarMi = true;
        for (String w : arr) {
            if (w.equalsIgnoreCase(arananIsim)) {
                isimVarMi = true;
                break;
            } else {
                isimVarMi = false;
            }
        }

        return isimVarMi;
    }


    //burada Array Liste gibimis oluyor ve contains ile icinde olup olmadigini boolean olarak döndürüyor.Java 8 de böyle yaziliyormus.
    public static boolean search(String searchname, String[] arr) {
        return Arrays.stream(arr).toList().contains(searchname);
    }

    //burada Array Liste gibimis oluyor ve contains ile icinde olup olmadigini boolean olarak döndürüyor.Java 9 dan itiabren böyle yaziliyor.
    public static boolean search2(String searchname, String[] arr) {
        return Arrays.toString(arr).contains(searchname);
    }
}