package sulehocaexceptions;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
        3)ArrayIndexOutOfBoundExceptions
         */

        //Bir String Array den  verilen indexteki datayi donduren bir metod olusturun

        String [] arr = {"Ali","Can","Tarik","Ayse"};

        getElementFromAway(arr,2);//pozitif senaryo
        getElementFromAway(arr,0);//pozitif senaryo
        getElementFromAway(arr,4);//negatif senaryo

    }

    private static void getElementFromAway(String[] arr, int i) {
        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
          // e.getMessage(); birsey göstermiyor o yüzden sout a aldim o zaman gösteriyor?
            System.out.println("Array 'in indexinde olmayan data istendi= " + e.getMessage());
            e.printStackTrace();
            System.out.println("Burasi renkli farki görün diye");//renkli yazdirir.sout' a almiyorum cünkü metodun kendisi zaten sout icine yazdiran bir method
            //bu sekilde iki rapor turunu beraberde  cagirabiliriz.hoca bu sekilde ikili yazdirmayi tercih ediyormus
        }
    }
}
