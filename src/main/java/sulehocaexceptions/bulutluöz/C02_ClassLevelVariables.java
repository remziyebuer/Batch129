package sulehocaexceptions.bulutluöz;

public class C02_ClassLevelVariables {

    //Class level variable lar methodlarin disnda olusturulur
    //genel kullanim en ustte olusturulmalidir

    static String hastaneIsmi= "Yildiz Hastanesi";
    static int hastaSayisi= 23546;
    static String basHekimSayisi;
    String persIsmi;
    String persTelefonu;

    //static bir klup gibidir static olan  metodlar static olmayan ile muhatap olmazlar
    public static void main(String[] args) {
        System.out.println(hastaneIsmi);//zaten atanmis
        System.out.println(basHekimSayisi);//null****local variablelarda deger konmamissa kullanilamaz
        //Class level variable'larda  deger atamasi yapilmamissa bile default olarak tanimlanan
        // degerleri atar
       // sayisal Variable'lar =0;
        //boolean=false;
        //Objeler(String dahil ) = null yazar ama bunun  yerine  "isim atanmadi" yazmak daha iyi olur.
        //char='';

    }

    public void method1(){

    }

    public void method2(){

    }






}
