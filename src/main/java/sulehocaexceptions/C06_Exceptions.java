package sulehocaexceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

//Java ayni anda birden fazla exception firlatmaz teker patlarsa yola devam etmezsin ki benzin de bitsin

//String ' i Integer' a ceviriniz; Integer' i character sayisina bolunuz.

        double d = divideString(null);
        double d2 = divideString2("12k34");//2.metodla


        System.out.println(d);


    }

    private static double divideString(String str) {//cikan metodu kendime gore sekillendirdim void i double yaptim
        //parametre ' yi String yaptim

        int length = 0;
        int i = 0 ;
        double sonuc = 0;

        try {
            length = str.length();//sadece ilk etapta bu kodu aldi alttaki iki satiri ben kesip bu
            // satirin altina kopyaladim ayri kalmasin diye dedi hocamiz.
            i = Integer.valueOf(str);
             sonuc = i / length;


        } catch (NullPointerException e) {
            System.out.println("d null degerinden kaynaklanan NullPointerException verdi; " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("d rakam disi karakterden kaynaklanan NumberFormetException verdi; " + e.getMessage());
        }catch (ArithmeticException e){
                System.out.println("d bolme isleminden kaynaklanan ArithmeticException verdi; " + e.getMessage());
            }//hatalarin sirasinin önemi yok yani catch blok sirasinin önemi yok istisnai durumlar disinda.
        //istisna parent exceptions ustte olmasi child larin altta olma durumu bu durumda üstte child alta
        // parent olmali ama hepsi burdaki gibi child ise hic farketmez

                return sonuc;
    }

//*************************  parent - child siralama icin tekrar kopy. asagi yapistirdim ********

    private static double divideString2(String str) {//cikan metodu kendime gore sekillendirdim void i double yaptim

        int length = 0;
        int i = 0 ;
        double sonuc = 0;

        try {
            length = str.length();//sadece ilk etapta bu kodu aldi alttaki iki satiri ben kesip bu
            // satirin altina kopyaladim ayri kalmasin diye dedi hocamiz.
            i = Integer.valueOf(str);
            sonuc = i / length;


        }  catch (NumberFormatException e) {
            System.err.println("d2 rakam disi karakterden kaynaklanan NumberFormetException verdi; " + e.getMessage());
         }catch (Exception e){
            System.err.println("d2 Parent class tarafindan tutulan Exception verdi; " + e.getMessage());
        }//hatalarin sirasinin önemi yok yani catch blok sirasinin önemi yok istisnai durumlar disinda.
        //istisna parent exceptions ustte olmasi child larin altta olma durumu bu durumda üstte child alta
        // parent olmali ama hepsi burdaki gibi child ise hic farketmez

        return sonuc;
    }


}
