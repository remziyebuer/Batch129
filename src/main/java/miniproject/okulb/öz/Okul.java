package miniproject.okulb.öz;

public class Okul {
    //heryerden ulasilabilmesi icin static (amam degistirilebilir)degistirilmesini
    // istemedigimiz icin final yapalim hem tum claslardan ulasirlar hem de degistiremezler.
    static final String OKUL_ISMI = "Yildiz Koleji";
    static final String ADRES = "Cankaya / ANKARA";
    static final String TELEFON = "0412 456 32 07";
    // obje olusturulamamasi icin const. yazip private yapiyorum***
    private Okul(){

    }
}
