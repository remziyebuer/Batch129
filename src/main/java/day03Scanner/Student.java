package day03Scanner;

public class Student {
    public String name = "Tom Hanks";
    public byte grade = 8;
    public String address = "Miami"; //bunlar pasif özellikler

    // Aktif özellikler
    public void  study(){
        System.out.println("Gunu gunune  ders calisir..");
    }
    public  void feed (){
        System.out.println("Saglikli beslenir..");//iki tane de metod ekledim//runner a git
    }
}
