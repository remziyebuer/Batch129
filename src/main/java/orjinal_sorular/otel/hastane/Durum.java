package orjinal_sorular.otel.hastane;

public class Durum {

    private boolean acilMi;
    private Durum aciliyetDurumu;

    public boolean isAcilMi() {
        return acilMi;
    }

    public void setAcilMi(boolean acilMi) {
        this.acilMi = acilMi;
    }

    public Durum getAciliyetDurumu() {
        return aciliyetDurumu;
    }

    public void setAciliyetDurumu(Durum aciliyetDurumu) {
        this.aciliyetDurumu = aciliyetDurumu;
    }
}
