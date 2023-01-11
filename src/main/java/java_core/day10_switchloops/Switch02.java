package java_core.day10_switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz.+ , - , * , / , % 'den birini" +
                "seciniz");

        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(a + "+" + b + "= " + (a + b));
                break;

            case '-':
                System.out.println(a + "-" + b + "= " + (a - b));
                break;

            case '*':
                System.out.println(a + "*" + b + "= " + (a * b));
                break;

            case '/':
                System.out.println(a + "/" + b + "= " + (a / b));
                break;
            case '%':
                System.out.println(a + "%" + b + "= " + (a * b / 100));//Yüzde alma
                break;

            default:
                System.out.println("Bu islem tanimlanmamistir");


        }
//note: biz bes islem yaptik siz isterseniz karekök üslü gibi
// islemleri de ekleyerek daha kapsamli bir hesap makinesi yapabilirsiniz

    }
}
