package tasks.hastahane;

public class Hastahane extends VeriBankasi{
    private  Doktor doktor;// = new Doktor();
    private  Doktor hasta;// = new Hasta();

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Doktor getHasta() {
        return hasta;
    }

    public void setHasta(Doktor hasta) {
        this.hasta = hasta;
    }
}
