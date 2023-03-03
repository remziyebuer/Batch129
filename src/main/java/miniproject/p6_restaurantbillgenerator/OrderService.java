package miniproject.p6_restaurantbillgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//10.Order islemler
public class OrderService {
    Scanner scan = new Scanner(System.in);
    List<Order> orderList= new ArrayList<>();

    //11.Siparis olusturma
    public void createOrder(){
        int dishCode;
        do{
            System.out.println("Lutfen urun kodu giriniz:(CIKIS ICIN 0 GIRINIZ.)");
dishCode= scan.nextInt();

        }while(dishCode!=0);
    }

}
