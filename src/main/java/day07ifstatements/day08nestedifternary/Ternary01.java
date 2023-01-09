package day07ifstatements.day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example ; Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan)
        // sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();
//
//        if(a<b){//iki kod kullanmamak icin a<=b yazmadik
//            System.out.println(a);
//        }else{
//            System.out.println(b);
//        }


        //2.yol:Ternary:if le yazilan hersey bunla yazilir kisa ve daha okunur
//Sart?   sart dogru ise calisir : sart yanlis ise calisr;===>Ternary syntax
//if(sart){dogru ise code1} else{yanlis ise code2 calisir}===>If syntax

        double result =  a<b? a:b;//bu kodu calistirdigimizda bize verilen datalarin
        // ikiside double bunu double kaba koymaliyim.Icinde ne var görmek icin yazdiririz.
        System.out.println(result);

//Bir soruyu (if else barindiran) ternary ile cözebiliyorsaniz mutlaka önce ternary kullanin
// ama ternary ile cözemiyorsaniz kimse size neden if else kullandin demez.






    }
}
