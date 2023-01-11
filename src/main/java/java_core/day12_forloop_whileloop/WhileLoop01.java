package java_core.day12_forloop_whileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3'den 10'a kadartamsayilari consola yazdiriniz

        for (int i = 3; i < 11; i++) {
            System.out.print(i + " ");

        }

        System.out.println(" ");

        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        //daha cok while kullanilir
        System.out.println(" kod arasi");
        //Example 2; 23'den 12'ye cift sayilari while ile yazdiriniz

        int k = 23;

        while (k > 23) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k--;
        }

        System.out.println();
        // Example 3;Verilen bir tamsayinin rakamlari toplamini yazdiriniz

        int num = 578;
        num = Math.abs(num);

        int sum = 0;

        while (num > 0) {

            sum += num % 10;

            num /= 10;
        }
        System.out.println(sum);

        //2.yol for loop

        int toplam = 0;
        for (int number = 578; number > 0; number /= 10) {
          toplam+=number%10;
        }
        System.out.println(toplam);
    }
}
