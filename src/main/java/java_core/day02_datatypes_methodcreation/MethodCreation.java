package java_core.day02_datatypes_methodcreation;

public class MethodCreation {
    public static void main(String[] args) {


        int sonuc =add(30, 50);//Java 3 ve 5 i topla dedim.
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3, 6);
        System.out.println(carpmaSonucu);

        int cikarmaSonucu =cikarma(9,4);
        System.out.println(cikarmaSonucu);

        int ucSayiSonuc = firstTwoMultiplyThirdAdd(6,5, 2);
        System.out.println(ucSayiSonuc);

      double kup = getCube(5);
      System.out.println(kup);

    }
    /*
    Java' da metod nasil olusturulur?

    1)Method main metodun disina yazilir icinde olusturulamaz.
    2)Access Modifier + Return Type + Method ismi + () + {}

    //Olusturulan metodlar nasil kullanilir?
    1)main metodu icinden kullanilir.
    2)toplama islemini kullanmak icin main e gir metodun ismi + () yaz.
    islem yapacaginiz sayilari parantezin icine yazin.sikayet yaziyor
    main metodda kullandigim metodlara static eklemeliyim metoda static ekle
    onu memory de bir yer ayirip oraya koy bunun icin de int sonuc yaz.sonucu int e atti.
     */

    public static int add(int a, int b) { //metod parantezine kullanacagimiz datalar yazilir.
        System.out.println(a+b);

        return a + b;//return yazmak bana bu sonucu ver demek.Olmasi gerek.
    }

    protected static long multiply(int a, int b) {
        return a * b;//simdi olusturdugumuz bu metodlari kullanacagiz.
    }
    public static int cikarma(int a , int b){ // icerdeki data type ile disarda ki ayni olmak zorunda degil.
        return a - b;
    }
 // örnek; verilen üc sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan metodu olusturunuz

    private static int firstTwoMultiplyThirdAdd( int a, int b, int c){
        return a*b+c;
    }
    //örn 2 ; Verilen bir ondalik sayinin küpünü hesaplayan metodu olusturup kullaniniz.
    //Access Modifier i "default " yapmak icin access modifier yazilmaz.

    public  static double getCube (double a){
        return a*a*a;
    }

//Bu metodlar static eklenmeden bu classtan obje olusturmak
// icin yeniden düzenlendi.
    public  int add1(int a, int b) { //metod parantezine kullanacagimiz datalar yazilir.
        return a + b;//return yazmak bana bu sonucu ver demek.Olmasi gerek.
    }

    protected  long multiply1(int a, int b) {
        return a * b;//simdi olusturdugumuz bu metodlari kullanacagiz.
    }
    public  int cikarma1(int a , int b){ // icerdeki data type ile disarda ki ayni olmak zorunda degil.

        return a - b;
    }
    // örnek; verilen üc sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan metodu olusturunuz

    private  int firstTwoMultiplyThirdAdd1( int a, int b, int c){
        return a*b+c;
    }
    //örn 2 ; Verilen bir ondalik sayinin küpünü hesaplayan metodu olusturup kullaniniz.
    //Access Modifier i "default " yapmak icin access modifier yazilmaz.

    public   double getCube1 (double a){
        return a*a*a;
    }

}