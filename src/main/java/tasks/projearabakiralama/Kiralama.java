package tasks.projearabakiralama;

public class Kiralama {

    private String alınacaksehir;
    private String alınacakgun;
    private String alıssaati;
    private String teslimGunu;
    private String teslimSaati;

    public Kiralama(String alınacaksehir, String alınacakgun,
        String alıssaati, String teslimGunu, String teslimSaati) {
        this.alınacaksehir = alınacaksehir;
        this.alınacakgun = alınacakgun;
        this.alıssaati = alıssaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;
    }

    public String getAlınacaksehir() {
        return alınacaksehir;
    }

    public void setAlınacaksehir(String alınacaksehir) {
        this.alınacaksehir = alınacaksehir;
    }

    public String getAlınacakgun() {
        return alınacakgun;
    }

    public void setAlınacakgun(String alınacakgun) {
        this.alınacakgun = alınacakgun;
    }

    public String getAlıssaati() {
        return alıssaati;
    }

    public void setAlıssaati(String alıssaati) {
        this.alıssaati = alıssaati;
    }

    public String getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public String getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(String teslimSaati) {
        this.teslimSaati = teslimSaati;
    }
}
