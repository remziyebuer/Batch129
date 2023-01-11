package advanced_java.practice1;

import java.util.Scanner;

public class GaniwhileLoop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Eine nummer bitte");
        int kullanicinu=input.nextInt();
        //1.yol
        int sonRakam= kullanicinu%10;
        System.out.println("sonRakam = " + sonRakam);
        int ilkrakam=kullanicinu;

        while (ilkrakam>9){
            ilkrakam/=10;
        }
        System.out.println("ilkrakam = " + ilkrakam);
        System.out.println("Toplam = "+ (ilkrakam+sonRakam));
        //2.Yol
        String sayiSTring=String.valueOf(kullanicinu);
        int strilkRakam=Integer.parseInt(sayiSTring.substring(0,1));
        //char first= sayiSTring.toUpperCase().charAt(0);

        int strsonRakam=Integer.parseInt(sayiSTring.substring(sayiSTring.length()-1));
        System.out.println("Toplam = "+(strilkRakam+strsonRakam));

    }
}
