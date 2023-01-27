package übungen.overriding;

public class Calisan {


        private double maas;
        private String isim;
        private String soyisim;



        public Calisan(double maas, String isim, String soyisim) {

            this.maas = maas;
            this.isim = isim;
            this.soyisim = soyisim;
        }




        public void BilgileriGoster(){


            System.out.println("İsim       : " + isim);
            System.out.println("Soyisim    : " + soyisim);
            System.out.println("Maaşı      : " + maas);

        }



    }
