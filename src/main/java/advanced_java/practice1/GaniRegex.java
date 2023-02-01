/*
package advanced_java.practice1;

import java.util.Scanner;

public class GaniRegex {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Geben SIe bitte eine Vorname-Nachname");
        String adsoyad= input.nextLine().replaceAll("[^a-zA-Z]"," ")
                .replaceAll("\\s+"," ")
                .trim();
        System.out.println("VorNachname = " + adsoyad);
        String vorname= adsoyad.split(" ")[0];
        String nachname=adsoyad.split(" ")[1];
        String adilkharf= ad.substring(0,1).toUpperCase();
        String soyadilkharf=soyad.substring(0,1).toUpperCase();
        System.out.println("ersteBuchstabenVorname = " + adilkharf);
        System.out.println("ersteBuchstabennachname = " + soyadilkharf);
        String formatliad=adilkharf+ad.substring(1).toLowerCase();
        String formatlisoyad=soyadilkharf+soyad.substring(1).toLowerCase();
        System.out.println("formatliVorname = " + formatliad);
        System.out.println("formatliNachname = " + formatlisoyad);

    }
}
*/
