package miniproject.p6_restaurantbillgenerator;

import java.util.Scanner;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public class RestaurantBillGenerator {
    public static void main(String[] args) {



    }
   //1.islem secimi ici menu gosterelim.
    //2.menu tekrarli olsun

   public static void getSelectionMenu(){

          Scanner scan = new Scanner(System.in);
          DishService dishService = new DishService();

        int select=-1;//while da kullanmak icin ilk asama sda kullanmayacagim bir deger giriyorum
        while (select!=0){
            System.out.println("_____________________________________________");
            System.out.println("*****Lezzet Restaurant Siparis Uygulamasi****");
            System.out.println("_____________________________________________");
            System.out.println("1-Menu" +
                    "2-Siparis Gir" +
                    "3-Siparisi Iptal Et" +
                    "4-Hesap Olustur" +
                    "0-CIKIS" +
                    "SECIMINIZ: \n" +
                    "_________________________________________________");

            select = scan.nextInt();

            switch (select){
                case 1:
                   ;
                    break;
                case 2:

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 0 :

                    break;
                default:
                    System.out.println("Hatali giris yaptiniz.Yeniden deneyiniz");
            }


          //  3.yiyecekler icin class lazim

        }

   }
}
