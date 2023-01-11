package java_core.day14_arrays_foreachloop;

import java.util.Arrays;

public class Calisma {
    public static void main(String[] args) {

        int ages[] = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));


        System.out.println(ages[0] + ages[ages.length - 1]);

        //2.yol for each ile

        int minimum = ages[0];
        int maximum = ages[0];
        for (int w : ages) {
            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }

        System.out.println(minimum + maximum);

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

        System.out.println(Arrays.toString(colors));

        int counter = 0;


        for (String w : colors) {  //sayisini bulmak icin
            if (w.length() < 6) {
                counter++;
            }
        }
        System.out.println("counter = " + counter);

        String newColors[] = new String[counter];

        System.out.println(Arrays.toString(newColors));

        int index = 0;

        for (String w : colors) {

            newColors[index] = w;

            index++;
        }


    }
}
