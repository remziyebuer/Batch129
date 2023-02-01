package miniproject;

import java.util.Scanner;

public class LoginRunner {
    public static void main(String[] args) {

        start();

    }

    public static void start() {
        UserService menu = new UserService();
        Scanner scan = new Scanner(System.in);
        int tercih;
        do {
            menu.schowMenu();
            tercih = scan.nextInt();
            switch (tercih){
                case 1:
               //   registieren();
                break;
                case 2:
                  //login();
                break;
                case 3 :
                    System.out.println("iyi gunler dileriz");
                break;
                default:
                    System.out.println("Hatali giris yaptiniz.Yeniden deneyiniz");
            }
            } while (tercih!=3);


    }

}