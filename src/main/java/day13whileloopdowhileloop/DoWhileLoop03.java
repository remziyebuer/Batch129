package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {

        /*
        Username = "admin" ve Password = "pwd123" dur.
        Kullanicidan username ve password ' u alin.
        Username ve password dogru ise ekrana "Hesabiniza hosgeldiniz." yazdiriniz
        Username veya password yanlis ise 3 kere "Username ve password' unuzu giriniz" mesaji verin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek
        islemi tamamlayiniz
         */


        Scanner input = new Scanner(System.in);

        int counter = 0;

        do {
            if (counter == 4) {
                System.out.println("Hesabiniz bloke olmustur!");
                break;
            }

            System.out.println("Username'i giriniz...");
            String username = input.next();

            System.out.println("Password'u giriniz...");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")) {
                System.out.println("Hesabiniza hosgeldiniz!");
                break;
            }
            counter++;

        } while (true);

    }

}





























