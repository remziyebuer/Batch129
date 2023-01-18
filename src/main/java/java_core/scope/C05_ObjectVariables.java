package java_core.scope;

public class C05_ObjectVariables {

    public static void main(String[] args) {

        // C03'teki instance variable'lara nasil ulasabiliriz
        // El-Cevap: Obje üzerinden, yani önce class'tan obje olusturmaliyiz
        // sonra o obje üzerinden degiskenlere ulasiriz

        C03_ObjectVariables pers1=new C03_ObjectVariables();        // obje olusturalim
        pers1.persIsmi="Mehmet";        // obje üzerinden degiskenlere ulastik
        pers1.persTelefonu="0158-2567939";
        pers1.persYas=46;

        System.out.println("Personel adi : "+pers1.persIsmi);
        System.out.println("Personel telefonu : "+pers1.persTelefonu);
        System.out.println("Personel yasi : "+pers1.persYas);

        System.out.println();

        C03_ObjectVariables pers2=new C03_ObjectVariables();
        pers2.persIsmi="Sedat";
        pers2.persYas=40;
        pers2.persTelefonu="0175-2564128";

        System.out.println("Personel adi : "+pers2.persIsmi);   // null
        System.out.println("Personel telefonu : "+pers2.persTelefonu);  // null
        System.out.println("Personel yasi : "+pers2.persYas);   // 0

        System.out.println();

        C03_ObjectVariables pers3=new C03_ObjectVariables();
        // obje olusturduk, ama deger atamadik.
        // yazdirdigimizda default degerler gelecek

        System.out.println("Personel adi : "+pers3.persIsmi);
        System.out.println("Personel telefonu : "+pers3.persTelefonu);
        System.out.println("Personel yasi : "+pers3.persYas);



    }
}
