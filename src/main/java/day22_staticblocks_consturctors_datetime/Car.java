package day22_staticblocks_consturctors_datetime;

public class Car {
    /*
     Constructor nedir?
    (Class bir kalipti ama bu kalibi kullanip kek yapacak birine
    yani constructors a ihtiyacimiz vardir)

    Class'dan object  uretmemize yarayan code vloack'laridir.

    Class olusturdugumuzda Java bize otomatik olarak bir Constractor verir.
   Ama bu constractor gozle gorulmez, gozle gorulmeyen otomatik olarak Java tarafindan
    verilen bu Constractor'lara "default constractor" denir.(bos default constructor hep vardir)

    "default constractor" lar "Car(){}" seklindedir.

    Siz kendi constructors inizi olusturdugunuz da java default constructor ' u siler.(kiskanctir)

   Bir Class'da farkli parametreler kullanarak istediginiz kadar Constructor olusturabilirsiniz.

   Farkli constractor'lar sayesinde bir class'dan farkli farkli object'ler olusturabiliriz.

   Interview sorusu : Method ile constructor'in farki varmidir? varsa nedir?
   Cevap           : Method ile constructor farkli yapilardir.
                   i)Method'larda return type vardir ama constructor'larda return type yoktur
                   ii)Method'larin ismi yaptiklari ise gore developer'lar tarafindan belirlenir.
                      Constructor'larin ismi ise her zaman Class ismi ile ayni olmalidir.

 */
    String marke = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;
//Genellikle Constructor'lari public yaparlar.yapilmamissa default demektir
   public Car(String marke , String model , int year , boolean hybrid){
        this.marke = marke;
        this.model = model;  //biz olusturduk
        this.year = year;
        this.hybrid = hybrid;
    }

   public Car(String marke , String model){

        this.marke = marke;
        this.model = model;//biz olusturduk

        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }
    }
   //Genellikle Constructor'lari biz olusturmayiz intelij ey e olusturturuz.
    // otommatik constructor olusturma icin class ' ta sag tikla Generate sec cikan kutuda
    // en uste constructora tikla acilan listede controle basili olarak istedigin öz. sec
    // ve ok de.

    public Car(String marke, int year) {
        this.marke = marke;
        this.year = year;       //Otomatik olusturtuk
    }
    // "class ta sag tikla>Generate>tostring" hepsinin secilmesinden emin olarak oku tuslayin
    @Override
    public String toString() {
        return "Car{" +
                "marke='" + marke + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';


    }
}
