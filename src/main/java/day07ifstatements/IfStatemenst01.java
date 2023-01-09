package day07ifstatements;

import java.util.Scanner;

public class IfStatemenst01 {

    public static void main(String[] args) {

   //Soru1:Kullanicidan bir karakter alalim karakter büyük harf  ise ekrana
        // "Büyük  Harf" yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char ch = scan.next().charAt(0);

        boolean buyukHarf = 'A' <= ch && ch <= 'Z';//Burda hem esitlik hem büyüklük sorguluyor
        //ASCII tabloya göre alt ve üst limit belirleyip tek sorgulamaya indirebiliriz ama
        //insanlar garip karsilar orda ünlem görünce mesela ne alaka der karisik olur
        // o yüzden bunu tercih ederiz
        //if lerde regex kullanilmaz dedi hoca

        boolean kucukHarf = 'a' <= ch && ch <= 'z';
        if (buyukHarf) {
            System.out.println("Buyuk Harf");
        } else if (kucukHarf) {
            System.out.println("Kucuk Harf");

        } else {
            System.out.println("Harf Degil");
        }

















    }


    }

