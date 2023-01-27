package sorucözümlerim;

import java.util.Scanner;

public class MeineSubString {
    public static void main(String[] args) {
        meineSubString();
    }
    public static void meineSubString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir text giriniz");
        String str = scanner.nextLine();
        System.out.println("Lutfen baslangic ve bitis degeri giriniz");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        String sub="";

        if(baslangic>bitis){
            System.out.println("baslangic indexi bitisten buyuk olamaz");

        } else{

            for (int i = baslangic; i < bitis; i++) {

                sub +=  str.charAt(i);

            }

        }

        System.out.println(sub);
    }

}
