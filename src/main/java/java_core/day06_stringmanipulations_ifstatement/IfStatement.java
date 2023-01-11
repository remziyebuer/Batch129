package java_core.day06_stringmanipulations_ifstatement;

public class IfStatement {
    public static void main(String[] args) {

        //Soru ; sayi pozitif ise ekrana pozitif yazdirin

        int sayi1 = 56;

        if (sayi1 > 0) {
            System.out.println("Pozitif sayi");
        }

        // Soru ; Sayi -1 ile 10 arasinda ise ekrana "Rakam" yazdirin

        int sayi2 = 9;

        if (sayi2 > (-1) && sayi2 < 10) {
            System.out.println(sayi2 + " Rakamdir");
        }


        //Example 3 ; Sayi uc basamakli ise ekrana "Woaaaaw ! " yazdirin

        int n = 123;
        n = - 123;
        n = Math.abs(n);

        if (n > 99 && n > 10) {
            System.out.println("Woaaaaw!");
        }

    }
}
