package java_core.day03_Scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunlugunu aliniz.
        // Alanini ve cevresini hesaplayiniz

        Scanner input = new Scanner (System.in);
        System.out.println("Lutfen kisa kenari giriniz");
        float shirtSide = input.nextFloat();
        System.out.println("Lutfen uzun kenari giriniz");
        float longSide = input.nextFloat();
        System.out.println("Alan = " + (2* shirtSide * longSide));
        System.out.println("cevre = " + 2*(shirtSide +longSide));
    }

}
