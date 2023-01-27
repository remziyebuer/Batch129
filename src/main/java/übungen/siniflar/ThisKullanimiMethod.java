package übungen.siniflar;

public class ThisKullanimiMethod {

    public static void main(String[] args) {

        ThisKullanimiMethod obje = new ThisKullanimiMethod();

obje.sayiSay();//1
obje.sayiSay();//2
obje.sayiSay();//3
obje.sayiSay();//4

obje.sayiSay().sayiSay().sayiSay();//5,6,7,
       obje.yazdir();//7


    }

    int sayi= 0;
    public ThisKullanimiMethod sayiSay(){
        this.sayi++;
        return this;
    }

    public void yazdir(){
        System.out.println("sayi : "+sayi);
    }










}
