package java_core.day07_ifstatements.day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {
    public static void main(String[] args) {

     /*
      Kullanicidan 0 dan kücük 120 den büyük deger giremeyecek sekilde datalari altiktan sonra

     eger calisan kadinsa;
     60 yasindan büyükse emekli olabilir yazdirin.

     eger calisan erkekse;
     65 yasindan büyükse emekli olabilir yazdirin.

      */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyeti giriniz.Erkek , Kadin ve Digerleri");
        String gender = input.next();

        System.out.println("Lütfen Yasinizi giriniz");

        int age = input.nextInt();

        if(age<0 || age>120){
            System.out.println("Lütfen yasi 0 ile 120 arasinda giriniz");

        } else if(gender.equalsIgnoreCase("Kadin")){

            if(age>60){
                System.out.println("Emekli olabilirsiniz");
            }else{
                System.out.println("Emekli olmaniza " + (60-age)+" yil vardir");
            }

        }else if(gender.equalsIgnoreCase("Erkek")){

            if(age>65){

                System.out.println("Emekli olabilirsiniz");

            }else{

                System.out.println("Emekli olmaniza " + (65-age)+"yil vardir");

            }

        }else{
            System.out.println("Tanimli degil");//Digerleri icin senaryo yok texte.
        }

















    }
}
