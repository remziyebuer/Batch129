package tasks.projehastahane;

public class Hasta {
    private String isim;
    private String soyIsim;
    private int hastaId;
    private String hastaDurumu;//Durum classinda pdf te

    public Hasta(String isim, String soyIsim, int hastaId, String hastaDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaId = hastaId;
        this.hastaDurumu = hastaDurumu;
    }

    public Hasta() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaId() {
        return hastaId;
    }

    public void setHastaId(int hastaId) {
        this.hastaId = hastaId;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}
