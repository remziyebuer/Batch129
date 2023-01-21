package sulehocaexceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

       /*
       1)NumberFormatException; uygun olmayan formatta verilen data türü icin hata

        */

//Bir String ' i alip int' e ceviren kodu yaziniz.

        String str = "123"; //Pozitif senaryo daha sonra araya harf koy negatif senaryo dene.


        int result = convertStringToInteger(str);//String 'i Integer ' ceviriniz
        // bu metodu yazinca altini kirmizi cizdi meodun ustune fare ile
        // geliyorsun create metod diyor bas altta sana metod verecek
//ctrl + alt + t ya da Code box'undan SurroundWith den cikan box tan try/catch sec
        System.out.println("resul + 5 = " + ( result + 5));


        String st = "123a";
        int result2 = convertStringToInteger(st);
        System.out.println("result2 + 5 = " + (result2 + 5));
    }

    private static int convertStringToInteger(String str) {
        int i = 0;
        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolümü");
        } catch (NumberFormatException e) {
            System.out.println("Rakam olmayan karakter iceren Stringler int cevrilemez");
        }
        return i;
    }
}
