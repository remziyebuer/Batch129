package java_core.scope;

public class C02_ClassLevelVariables {


        // class level variable'lar metotlarin disinda olusturulurlar
        // genel kullanim en üstte olusturulmalaridir

        static String hastaneIsmi = "Yildiz Hastanesi";
        static int hastaSayisi = 23453;
        static String basHekimIsmi;
        String persIsmi;
        String persTelefonu;
        int persYas;

        public static void main(String[] args) {

            // class level variable'lar 2 gruba ayrilirlar.
            // 1. class'a bagli degiskenler ve objeye bagli degiskenler
            // clas'a bagli degiskenlere class üzerinden ulasilabilirken
            // objeye bagli degiskenlere (obje degiskeni veya instance) obje üzerinden ulasilabilir
            // class variable'lar static kelimesi ile isaretlenir
            // instance variable'lara static metotlardan ulasilamaz iken,
            // class level variable'lara her metottan ulasilabilir


        /*
            Class level variable'lara deger atanmamis ise Java default degerleri kullanir
            Sayisal degerler icin : 0
            String degiskenler icin : null
            boolean icin : false
            char icin : ''
            Ama genel kullanim null yerine "deger atanmadi" gibi bilgi girmektir
         */
        }

        public static void method1() {
            System.out.println(hastaneIsmi);        // diger degiskenlere ulasilamiyor
            System.out.println(basHekimIsmi);       // cünkü onlar instance variable
            System.out.println(hastaSayisi);
            int x = 5;

        }

        public void method2() {
            System.out.println(hastaSayisi);        // hem class level variable'lara hem de instance variable'lara ulasilabiliyor
            System.out.println(hastaSayisi);
            System.out.println(basHekimIsmi);
            System.out.println(persIsmi);
            System.out.println(persTelefonu);
            System.out.println(persYas);
        }


    }

