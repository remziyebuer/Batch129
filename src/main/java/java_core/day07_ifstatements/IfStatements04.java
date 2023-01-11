package java_core.day07_ifstatements;

import java.util.Scanner;

public class IfStatements04 {

    public static void main(String[] args) {

        // Soru; Gün sayisini verdiginizde gün kodunu yazan kodu yaziniz.
        //Java 1.günü pazar sayiyor

        Scanner input = new Scanner (System.in);

        System.out.println("Lütfen kacinci gün oldugunu giriniz");
         byte num = input.nextByte();
         // 7 gün var 7 ihtimal ve de yanlis girilen sayi icin digerleri ihtimali eder 8

        if(num == 1){
            System.out.println("Sunday");
        } else if(num == 2){
            System.out.println("Monday");
        }else if(num == 3){
            System.out.println("Wednesday");
        }else if(num == 4){
            System.out.println("Thursday");
        }else if(num == 5){
            System.out.println("Tuesday");
        }else if(num == 6){
            System.out.println("Friday");
        }else if(num == 7){
            System.out.println("Saturday");
        }else {
            System.out.println("Hatali giris yaptiniz." +
                    "Lütfen 1 ile 7 arasinda bir sayi giriniz");
        }

       //Boundry Value Analysis = BVA test yaptin mi ?Kritik degerler test edilmeli
        //Kritik degerlerden bir önceki ve bir sonraki degerde test edilmeli
        //burda kritik degrler 1,2,3,4,5,6,7 öncesi 0 ya da-2 kontrol edilebilir
        //sonrasi icin 8 ve de 11 i secebiliriz.Java dogruyu bulduktan sonra diger
        // satirlari okumaz
    }
}
