package java_core.day03_Scanner;


import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args){
        //1. adim ; Scanner Class indan object olustururuz
        Scanner input = new Scanner(System.in);
        //2.adim ; Kullanicidan  data aliriz.
        System.out.println("Lütfen yasinizi girirniz");
        //3.adim ; Aldigimiz data yi memory e koyacaz
        byte age = input.nextByte();
        System.out.println(age);

       // System.out.println( input.nextByte( ));-----> bu sekilde'de memorye koymadan görebiliyorum









    }
}
