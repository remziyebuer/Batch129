package sulehocaexceptions;

public class C05_Exceptions {
    public static void main(String[] args) {

        /*

     5)ArithmeticExceptions

      */

        divide(6,2);// pozitif 3
        divide(0,2);// pozitif 0
        divide(6,0);//negatif bolunmez
        divide2(6,0);//negatif bolunmez

    }

    private static void divide2(int a, int b) {
        try {
            System.out.println(a / b);
            System.out.println("try kismi calisti");
        } catch (ArithmeticException e) {
            e.printStackTrace();
             System.out.println("catch kismi calisti ; " + e.getMessage());//neden
            // bu yukardaki e.printStackTrace den önce calisti???
             System.err.println("Bolmede hata olustu");//renkli yazar
        }
    }
    //************iki farkli metod var dikkat
    private static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayi sifir ile bolunemez= if blogu calisti");
        } else {
            System.out.println(a / b);
        }//tercih edilmez
    }
}
