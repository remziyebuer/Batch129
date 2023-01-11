package java_core.day12_forloop_whileloop;

import java.util.Scanner;

public class FoorLoop01 {

    public static void main(String[] args) {

        /*

      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

            X X X X X
            X X X X X
            X X X X X
*/
        Scanner input = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");//3
        int row = input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");//5
        int column = input.nextInt();

        System.out.print("Lütfen cizilmesini istediginiz karakteri giriniz: ");//X
        char character = input.next().charAt(0);

        for (int i = 1; i < row + 1; i++) {//ya da <=row daha iyi olur dedi hoca

            for (int j = 1; j < column + 1; j++) {// ya da <=column daha iyi olur dedi hoca
                System.out.print(character + " ");
            }

            System.out.println();
        }
    }









    }

