package java_core.day12_forloop_whileloop;

import java.util.Scanner;

public class FoorLoop02 {
    public static void main(String[] args) {

        /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column = input.nextInt();


        for (int i = 1; i < row; i++) {


            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");

            }


        }


    }
}
