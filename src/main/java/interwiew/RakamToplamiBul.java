package interwiew;

public class RakamToplamiBul {


    public static void main(String[] args) {

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

        System.out.println(toplam);

        }//for

    } //main
}//class