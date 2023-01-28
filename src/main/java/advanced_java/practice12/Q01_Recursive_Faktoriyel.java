package advanced_java.practice12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir kod yaziniz.(Loop kullanmayiniz)
    public static void main(String[] args) {
        System.out.println("faktoriyel = " + faktoriyel(-6));


    }

    public static int faktoriyel(int sayi) {

        if(sayi>=0) {
            if (sayi == 0 || sayi == 1) {
                return 1;
            } else {
                return sayi * faktoriyel(sayi-1);
            }

        }else{
            throw new ArithmeticException("Sayi sifirdan kucuk olamaz");
        }

    }

    }

