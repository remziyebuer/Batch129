package orjinal_sorular.otel;

public class KralDairesi extends Otel {

    public static void main(String[] args) {


        KralDairesi musteri3 =  new KralDairesi();
        musteri3.kahvalti();
        System.out.println("musteri3.tv(\"international\", 7) = " + musteri3.tv("international", 7)+ "$");
        System.out.println("musteri3.wifi ucreti = " + musteri3.wifi(8) + "$");


    }
    @Override
    public void kahvalti() {
        System.out.println("kahvalti yataga gelir");
    }

    public int tv (String international, int saat){
        if(international.equalsIgnoreCase("international")){
           return saat*100;
        }else
            return 0 ;
    }
}
