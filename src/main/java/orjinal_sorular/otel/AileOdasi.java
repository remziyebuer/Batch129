package orjinal_sorular.otel;

public class AileOdasi extends Otel {

    public static void main(String[] args) {
        AileOdasi musteri2 = new AileOdasi();
        musteri2.kahvalti();
        System.out.println("musteri 2 wifi ucreti ; "+musteri2.wifi(4));
    }
    @Override
    public void kahvalti() {
        System.out.println("serpme kahvalti");
    }
}
