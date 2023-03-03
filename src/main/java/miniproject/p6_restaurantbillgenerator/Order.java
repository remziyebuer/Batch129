package miniproject.p6_restaurantbillgenerator;

public class Order {
    public static int count=999;
    public int orderCode;
    public int numOfDish;
    public double orderPrice;
    public Dish dish;
    //8. yemek ve adet parametreleri ile obje olusturalim

    public Order (Dish dish, int numOfDish){
        count++;
        this.orderCode=count;
        this.dish= dish;
        this.numOfDish=numOfDish;
    }

    //9.siparis fiyatini hesapla
    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numOfDish;
    }



}
