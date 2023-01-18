package java_core.scope;

public class C03_ObjectVariables {
    static String hastaneIsmi="Yildiz Hastanesi";
    static int hastaSayisi=23453;
    static String basHekimIsmi;
    String persIsmi;
    String persTelefonu;
    int persYas;

        /*
            Class level variable'larin scope'u tüm classtir
            Static kelimesi ile isaretlenmis variable'lara class icerisinden her yerden ulasilabildigi icin diger adi class variable'dir

            Static kelimesi ile isaretlenmemis class level variable'lara instance variable denir
            Instance variables'lar objelere bagli olduklarindan bu variable'lara object variables da denir
         */

    public static void main(String[] args) {

    }

}
