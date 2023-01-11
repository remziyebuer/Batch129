package java_core.day14_arrays_foreachloop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        //Interwiew sorusu : Arrayler cok sorulur cünkü kendi mantigimizi kullaniriz
        //Example 1: String bir array olusturunuz,
        // 6 tane eleman yerlestiriniz, character sayisi
        // 5 den cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]
        //Logic : Yeni bir Array olusturup , karakter sayisi 5 ve 5' ten kucuk olan elemanlari
        //yeni array ' e transfer edecegiz.Böylelikle yeni array ' de karakkter sayisi 5 ' den
        // buyuk olan hic bir eleman olmayacak

//Verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulmaliyiz
        int counter = 0;

        for (String w : colors) {
            if (w.length() <= 5) {
                counter++;
            }
        }//Verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var bulduk
        System.out.println(counter);//4
//Eleman sayisi 4 tane olan bir Array olusturdum

        String newColors[] = new String[counter];//Eleman sayisi 4 tane olan bir Array olusturdum
        //Görüntüsü su an su sekildedir [null, null, null, null]

        int idx = 0;

        for (String w : colors) {
            if (w.length() <= 5) {
                newColors[idx] = w;
                //indexe eleman koyuyoruz ilk index 0 ve ilk w:Red oldugundan
                //newColors[0] = "Red";// sonra increment yapilir
                //newColors[1] = "Blue";// sonra increment yapilir
                //newColors[2] = "Green";// sonra increment yapilir
                //newColors[3] = "Brown";// sonra increment yapilir
                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]
    }
}
