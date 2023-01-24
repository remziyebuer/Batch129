package sulehocapractice.otel;

public class TekKisilik extends Otel {
    public static void main(String[] args) {
        TekKisilik musteri1  = new TekKisilik();
        System.out.println("musteri1.tv(5) = " + musteri1.tv(5)+ "$");
    }

    @Override
    public void kahvalti() {
        System.out.println("sandvic");
    }


    public int tv (int saat){
        return saat*2;
    }
}
