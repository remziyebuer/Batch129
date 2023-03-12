package minigrupcalismalar;

import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        Scanner input =new Scanner(

                System.in

        );
        System.out.println("Hosgeldiniz...");
        double kiloMetre;
       /* int counter=0;
        do {
        System.out.println("Lütfen kac km gideceğinizi giriniz");

        kiloMetre = input.nextDouble();
        if (kiloMetre<0){
            System.out.println("Km sıfırdan buyuk olmalıdır");
        }else{
            System.out.println("Km basarılı bir sekilde girilmiştir");
            counter++;
        }

        }while(counter!=0);
        */

        do {
            System.out.println("Lütfen kac km gideceğinizi giriniz");

            kiloMetre = input.nextDouble();
            if (kiloMetre<0){
                System.out.println("Km sıfırdan buyuk olmalıdır");
            }else{
                System.out.println("Km basarılı bir sekilde girilmiştir");
                break;
            }

        }while(true);


        do {
            System.out.println("Gidis-donüs biler almanız durumunda %20 indirim uygulanacaktır." +
                    "Gidis/donüs bilet almak icin '1' giriniz." +
                    "Tek yon icin '2' yaziniz");
            String yon = input.nextLine();
            if (yon.equals("1") || yon.equals("2")){
                break;
            }else{
                System.out.println("Hatalı veri girdiniz.Lütfen tekrar deneyiniz....");
            }

        }while(true);

        do {
            System.out.println("yas indirimden faydalanmak icin lütfen yasınızı giriniz");
            int yas =input.nextInt();
            if (yas <0){
                System.out.println("yas sıfırdan buyuk olmalıdır");
            }else{
                System.out.println("yas basarılı bir sekilde girilmiştir");
                break;
            }

        }while(true);



    }
    public static int ucretHesapla(double kilometre, char yon, int yas) {


        return 5;
    }

}