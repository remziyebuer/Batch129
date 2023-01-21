package sulehocaexceptions;

public class C02_Exceptions {
    public static void main(String[] args) {
    /*

    2) StringIndexOutOfBoundsException

     */


        //Bir String' in istedigimiz indexteki datasini bize veren kodu yaziniz.

        char ch = getCharFromString("Hakan", 5);
        System.out.println("ch= "+ ch );//ch = yazar hatali kismi yazdirmaz ama koduda calistirir.


    }

    private static char getCharFromString(String str, int i) {
        char c = ' ';
        try {
            c =str.charAt(i);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();//hata raporu uste olur alta calisan kod bunu nereden
            // anliyorz hic calismayan kod kalmadi 0 diyor. Process finished with exit code 0
          // e.printStackTrace(); bunun yerine kendimizde sout icinde mesaj yazabiliriz
            // e yazip nokta koyunca hangi rapor turu secebilirsin
        }
        return c;
    }


}
