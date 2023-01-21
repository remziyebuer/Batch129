package sulehocaexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C10_Exceptions {
    public static void main(String[] args) {
        /*
    9)InputMismatchExceptions; data uyusmazligi girisi kullanici tarafindan mesela sayi girecek iken harf girmesi

     */
//Verilen bir arr'den kullanicidan index isteyin verilen indexdeki datayi yazdirin
       int [] arr= {1,2,3,4,5};
        Scanner input =  new Scanner(System.in);
        System.out.println("Lutfen index icin sayi giriniz");
        int index= 0;
        try {
            index = input.nextInt();
            System.out.println("Girilen indexteki eleman ; " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz indexte eleman array de yok : " + e.getMessage());
            e.printStackTrace();
         }catch (InputMismatchException e) {
            System.out.println("Girdiginiz index sayi olmali InputMismatchException : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Durmak yok yola devam");









    }
}