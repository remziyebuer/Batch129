package advanced._practice.practice01;

import java.util.Scanner;

public class GaniRegex {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Bosluk birakarak adyoad");
        String adsoyad= input.nextLine().replaceAll("[^a-zA-Z]"," ")
                .replaceAll("\\s+"," ")
                .trim();
        System.out.println("adsoyad = " + adsoyad);
        String ad= adsoyad.split(" ")[0];
        String soyad=adsoyad.split(" ")[1];
        String adilkharf= ad.substring(0,1).toUpperCase();
        String soyadilkharf=soyad.substring(0,1).toUpperCase();
        System.out.println("adilkharf = " + adilkharf);
        System.out.println("soyadilkharf = " + soyadilkharf);
        String formatliad=adilkharf+ad.substring(1).toLowerCase();
        String formatlisoyad=soyadilkharf+soyad.substring(1).toLowerCase();
        System.out.println("formatliad = " + formatliad);
        System.out.println("formatlisoyad = " + formatlisoyad);

    }
}
