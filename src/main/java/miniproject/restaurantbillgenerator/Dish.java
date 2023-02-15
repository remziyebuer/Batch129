package miniproject.restaurantbillgenerator;

public class Dish {
    //4.yiyeceklerin fieldlarina okunsun ancak degistirilemesin
    private int code;
    private String name;
    private double price;

    //yiyecek olusturulurken özellikler set edilsin.

    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Disch{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
