package advanced_java.practice1;

import java.util.Scanner;

public class Q02_Variables_Hipotenus {
    public static void main(String[] args) {

        // Hipotenus hesaplayan bir kod
        //birinci dik kenarin karesi ve ikincinin karesinin karekökü hipotenusu verir

        Scanner input = new Scanner(System.in);

        System.out.println("Kenar degerlerini giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double hipotenus = Math.sqrt(a * a + b * b);
        System.out.println("hipotenus = " + hipotenus);


    }


}
