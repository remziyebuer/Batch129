package advanced._practice6;

public class Q04_MethodOverloading_Hacim {
    //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan bir
    // kod yaziniz.(Method overloading kullanınız)
    public static void main(String[] args) {


        Hacim obje = new Hacim();//Her class bir data tipidir ama her data tipi
        // bir class degildir.Her class bir data type dir o yuzden hacim yazdik.

        int kupunHacmi = obje.hacimHesapla(5);

        System.out.println("kupunHacmi = " + kupunHacmi);//25


    }


}
