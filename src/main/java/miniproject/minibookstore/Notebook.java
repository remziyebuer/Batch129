package miniproject.minibookstore;

public class Notebook extends Product{
    private String brand;
    private int shett;
    private int code;

    public Notebook(String name, String price, int stok, String brand, int shett, int code) {
        super(name, price, stok);
        this.brand = brand;
        this.shett = shett;
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getShett() {
        return shett;
    }

    public void setShett(int shett) {
        this.shett = shett;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
