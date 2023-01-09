package day07ifstatements;

import java.util.Scanner;

public class IfStatements06 {
    public static void main(String[] args) {
        /*
 Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
     asagidaki tabloya gore yazdiran kodu olusturunuz
     0 yas alti hata mesaji
     0-4 ==> bebek
     5-12 ==> cocuk
     13-20 ==> genc
     21-30 ==> yetiskin
     30 üstü tanimlanmamis
     Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz

      */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int age = input.nextInt();

        if (age < 0) {
            System.out.println("gecerli bir yas giriniz");
        } else if (age < 5) { //else if(age>= 0 && age <= 4) yazmama gerek
            // yok zaten öncesinde o isi halletik, java ya iki is yaptirmamaliyim
            System.out.println("Bebek");
        } else if (age < 13) {
            System.out.println("Cocuk");
        } else if (age < 21) {
            System.out.println("Genc");
        } else if (age < 31){
            System.out.println("Yetiskin");
        } else {
            System.out.println("Tanimlanmamis yas..");

        }

//Bu tarz sorularda sira ile gir sakin ortadan dalma

        /*if (age<0){
            System.out.println("Lütfen gecerli bir yas giriniz");
        } else if (age>=0 && age<5) {
            System.out.println("bebek");
        } else if (age>4 && age<13) {
            System.out.println("cocuk");

        }else if (age>12 && age<21) {
            System.out.println("genc");

        }else if (age>20 && age<31 ){
            System.out.println("yetiskin");

        }else{
            System.out.println("Tanimlanmammis evre");
        }
BEN BU SEKILDE CÖZMÜSTÜM AMA YAZDIGIM BÖLÜM GEREKSIZMIS TABII SIRA ILE GITMEK SARTTT

*/
    }

}
