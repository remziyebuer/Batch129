package übungen.overriding;

public class Memur extends Calisan {
    private String departman;
    public Memur(double maas, String isim, String soyisim, String departman) {
        super(maas, isim, soyisim);

        this.departman = departman;
    }


    public void BilgileriGoster(){ //Overriding İşlemi

        super.BilgileriGoster();

        System.out.println("Departmanı : " + this.departman);


    }
}
