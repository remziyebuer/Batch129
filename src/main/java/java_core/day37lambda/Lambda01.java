package java_core.day37lambda;



import java_core.day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer>myList = new ArrayList<>();
        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getMultiplicationFromThreeToNine());
        System.out.println(getMultiplicationFromThreeToNine2());
        System.out.println(getFaktoriyel(5));
        System.out.println(getGetSumOfEvensBetweenTwoInt (5,14));
        System.out.println(getSumOfDigitBetweenTwoInts(120,98));

    }

    //1)Verilen list'de ki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List <Integer> myList){
       return  myList.stream().reduce(Math::addExact).get();//eger reduce  metodunu
        // baslangic degeri olmadan kullanirsam Optional verecek o yuzden get kullanyrm
    }
    //2) 7'den 70 ' e kadar tum tamsyailarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy(){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }
//3) 3 ' den 9 ' a tum sayilarin carpimini veren metodu olusturunuz
    public static  int getMultiplicationFromThreeToNine(){
     return    IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }

    public static  int getMultiplicationFromThreeToNine2(){
        return    IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }

    //4)Size verilen sayinin faktoriyrlini hesaplayiniz.interwiew de sorarlarsa böyle yapin hayran kalirlar

    public static int getFaktoriyel(int x){
        if(x==0){//filter kullanamayiz mecbur if else ile halledecez.
            return 1;
        }else  if (x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;//negatif sayilar icinde int dondurmemeiz lazim yoksa metod hata verir cun ki metod
            // ta int dönecek dedik ve java genelde hatalar icin -1 verir bizde -1 yazariz bu yüzden.
        }else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }
    //5) Bize verilen iki tamsayi arasinda ki tum cift sayilarin toplamini veren kodu yaziniz.

    public static int getGetSumOfEvensBetweenTwoInt (int a, int b) {
  if(a>b){//swap yapmaliyim
    int temp = a;
    a=b;
    b= temp;
}

     return   IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();
//range te once buyuk sayi sonra kucuk yazabilirler o yuzden if kullanmaliyim.
    }

    //6)Size verilen iki tamsayi arasinda ki tüm tamsayilarin rakamlari toplamini
    // veren kodu yaziniz.
    //yani 12 ve 18 ==> 13,14,15,16,17==> 4+5+6+7+8=30 olmali.

    public static int getSumOfDigitBetweenTwoInts(int a , int b){
        if(a>b){//swap yapmaliyim
            int temp = a;
            a=b;
            b= temp;
        }//kullaniciya cok is birakmayin sevmez muhtemel hatalara göre kod yazin

        return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();//reduce yapmistik
        // hata verdi hoca map olarak degistirdi cun ki tek tek alacakmis.
    }
}