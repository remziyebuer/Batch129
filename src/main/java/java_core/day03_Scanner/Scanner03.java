package java_core.day03_Scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // Kullanicidan adresini aliniz ve ekrana yazdiriniz.
        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen adresinizi giriniz..");
        //nextLine() metodu kullanicidan cok kelimeli String almak icn kullanir

        String address = input.nextLine();
        System.out.println(address);

    }
}
