package orjinal_sorular.otel.hastane;

public class Runner {

    private static Hastane hastane = new Hastane();



    public static void main(String[] args) {
        String hastaDurumu = "Bas Agrisi";
        String unvan = doktorUnvan(hastaDurumu);
        hastane.setDoktor(doktorBul(unvan));

        System.out.println("hastane.getDoktor().getIsim() = " + hastane.getDoktor().getIsim());
        System.out.println("hastane.getDoktor().getsoyIsim() = " + hastane.getDoktor().getSoyisim());
        System.out.println("hastane.getDoktor().getunvan() = " + hastane.getDoktor().getUnvan());


    }

    private static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i <hastane.unvanlar.length ; i++) {
            doktor.setIsim(hastane.doktorIsimleri[i]);
            doktor.setSoyisim(hastane.doktorSoyIsimleri[i]);
            doktor.setUnvan(unvan);


        }

    return doktor;
    }

    private static String doktorUnvan(String hastaDurumu) {
         if ( hastaDurumu.equals("Alerji")){
             return  hastane.unvanlar[0];
         } else if (hastaDurumu.equals("Bas Agrisi")) {
             return hastane.unvanlar[1];

         } else if (hastaDurumu.equals("Diyabet")) {
        return hastane.unvanlar[2];
         } else if (hastaDurumu.equals("Kalp Spazmi")) {
             return hastane.unvanlar[3];
         }else

         return "yanlis durum";
    }
}
