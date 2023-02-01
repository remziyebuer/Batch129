package miniproject.biletbus;

import java.util.Scanner;

public class Runner {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int km = 0;
        int yas = 0;
        int yolculukTipi = 1;
        System.out.println("Lutfen gideceginiz mesafeyi km olarak giriniz");
        km = input.nextInt();

        System.out.println("Lutfen yasinizi giriniz");
        yas = input.nextInt();

        System.out.println("Lutfen yolculuk tipini giriniz " +
                "Sadece Gidis ise 1\nGidis-Donus ise 2");
        yolculukTipi = input.nextInt();

        if (km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double biletUcreti = km * 0.10;
            double yasIndirimOrani = 0;

            if (yas < 12) {
                yasIndirimOrani = 0.5;
            } else if (yas > 24) {
                yasIndirimOrani = 0.1;

            } else if (yas > 65) {
                yasIndirimOrani = 0.3;

            }


        }}
}
