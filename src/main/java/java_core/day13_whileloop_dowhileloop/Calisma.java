package java_core.day13_whileloop_dowhileloop;

import java.util.Scanner;

public class Calisma {
    public static void main(String[] args) {




        // yazdiren kodu yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        int i = 1;

        while (i < 11) {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
            i++;
        }

        //Example Verilen bir String' de her harfin sonrasina "*" sembolunu ekleyiniz.
        //Java ====> J*a*v*a*
        System.out.println("Bir kelime  giriniz");
        String word = scan.next();
String newWord = "";

int k=0;
while (k<word.length()){
    newWord = newWord + word.charAt(k)+"*";
    k++;
    System.out.println(newWord);
}

System.out.println(newWord);
    }
}
