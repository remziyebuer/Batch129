package tasks.hastahane;

public class Hastahane extends VeriBankasi{
    private  Doktor doktor;// = new Doktor();
    private  Hasta hasta;// = new Hasta();

    public Hastahane() {
    }

    public Hastahane(Doktor doktor, Hasta hasta) {
        this.doktor = doktor;
        this.hasta = hasta;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        this.hasta = hasta;
    }
}
