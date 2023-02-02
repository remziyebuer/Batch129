package tasks.hastahane;

public class Runner {

    private static Hastahane hastane  = new Hastahane();
     static Doktor doktor = new Doktor();
    public static void main(String[] args) {

        String hastaDurumu="Bas agrisi";
        String unvan = doktorUnvani(hastaDurumu);

       hastane.setDoktor(doktorBul(unvan));



       System.out.println("Doktor ismi : " + hastane.getDoktor().getIsim());
       System.out.println("Doktor Soy ismi : " + hastane.getDoktor().getSoyIsim() );
       System.out.println("Doktor unvani : " + hastane.getDoktor().getUnvan());




    }

    public static String doktorUnvani(String hastaDurumu) {

        if (hastaDurumu.equalsIgnoreCase("Alerji")) {
            return hastane.unvanlar[0];

        } else if (hastaDurumu.equalsIgnoreCase("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (hastaDurumu.equalsIgnoreCase("Diyabet")) {
            return hastane.unvanlar[2];

        } else if (hastaDurumu.equalsIgnoreCase("Soguk alginligi")) {
            return hastane.unvanlar[3];

        } else if (hastaDurumu.equalsIgnoreCase("Migren")) {
            return hastane.unvanlar[4];

        } else if (hastaDurumu.equalsIgnoreCase("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }

        return "yanlis durum";
    }
   public static  Doktor doktorBul(String unvan) {


        for (int i = 0; i <hastane.unvanlar.length; i++){

          doktor.setIsim(hastane.doctorIsimleri[i]);
          doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
          doktor.setUnvan(unvan);

        }

       return doktor;

   }




}
