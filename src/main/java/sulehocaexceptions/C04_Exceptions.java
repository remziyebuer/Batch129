package sulehocaexceptions;

public class C04_Exceptions {

    public static void main(String[] args) {

    /*

    4) NullPointerExceptions

     */

        // Bir Stringde bulunan karakter sayisini veren kodu yaziniz

        String str = "Fatma";
        //getNumOfChars(str);//charlarin sayisini getir.//5
        String str2 = "";
       // getNumOfChars(str2);//charlarin sayisini getir.
        String str3 = null;
        getNumOfChars(str3);//charlarin sayisini getir.


    }

    private static void getNumOfChars(String str) {
        try {
            System.out.println(str.length());//sule hoca burayi kapatip parametreyi str2 ve
            // 3 yapip souta da bunlari yazdirip yukardaki metodlari kapatmadi benle farki ne?
        } catch (NullPointerException e) {
            System.err.println("lenght() hata olustu");//out yerine err yazip renkli yazdirabiliriz
            //sout yazmak yerine serr yazinca cikiyor***
            e.printStackTrace();
        }

    }
}