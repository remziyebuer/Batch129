package java_core.day_27encapsulation_absraction;

public class Student {
    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor= true;
    //Encapsulation yapilmis datayi okuyabilirmiyiz?
    //get methodlar encapsulation(saklanmis) edilmis datayi okumamiza yarar
    //get methodlar her zaman public olur.
    //get methodlarin return type`i variable data type ile ayni olur
    //get methodlar (getter) isimleri get + variable name seklinde olur.
    //get methodlar (getter) isimleri variable booelan ise "is + variable name seklinde olur.
    //get methodlar (getter) parametre kullanmazlar
    public String getStdId(){
        return stdId;
    }
    public double getGpa(){
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }
    //Encapsulation yapilmis datalarin degeri degistirilebilir mi?
//set method'lar (setter) encapsule edilmis datalarin degerlerini update etmemize
// ( degistirmemize) yarar.
//set method'lar (setter) her zaman "public" olur.
//set method'larin (setter) return type'i her zaman void olur.
//set method'larin (setter) isimleri "set + variable name" seklinde olur.
//set method'lar (setter) variable ile ayni data type' inda parametre kullanir.
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

}
