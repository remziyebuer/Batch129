package practiceday03;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {
        /*
Kullanicidan bir gun alin
- Eger gun cuma ise "Muslumanlar icin kutsal gun"
- Eger gun cumartesi ise "Muslumanlar icin kutsal gun"
- Eger gun pazar ise "Hiristiyanlar icin kutsal gun"
Yazdiran kodu yaziniz
 */

        Scanner scan = new Scanner(System.in);

        String gun = scan.next().toLowerCase();

        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        }else if(gun.equals("cumartesi")){
                System.out.println("Yahudiler icin kutsal gun");
            }else if(gun.equals("pazar")){
                System.out.println("Hristiyanlar icin kutsal gun");
        }else {System.out.println("Kutsal gun degil");}








































    }
}
