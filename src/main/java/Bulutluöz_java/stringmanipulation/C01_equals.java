package Bulutluöz_java.stringmanipulation;

public class C01_equals {

    public static void main(String[] args) {

      //C01_equals

        String str1 = "ALI";
        String str2 = "Ali";
        String str3 = "ali";
        String str4 = "Ali";
        boolean esitMi = str1 == str2;
        System.out.println("esitMi = " + esitMi);
        System.out.println(str3 == str4);
        boolean esitMi2 = str1.equals(str2);
        System.out.println("Esit mi? = " + esitMi2);
        System.out.println("Esit mi? = " + str2.equals(str4));

        /*
         Stringler'i karsilastirirken karsilastirirken bekledigimiz sonuclsri vermeyebilir
         String'lerde metinlerin ayni olup olmadigini karsilastirmak icin
         == yerine equals() kullanilir
         */





    }

}
