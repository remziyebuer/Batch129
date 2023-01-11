package java_core.day05_typecasting_swap_stringmanipulations;

public class SwapValues {
    //Swap----> Yer degistirme demektir.
    public static void main(String[] args) {
       int a = 12;
       int b = 5;//Swap 'dan sonra ===> a=5 ve b=12
       int temp=0;//temp= gecici demek
        System.out.println("\n******1.Yol***\n17");
        // 1.adim
        temp =a;
        System.out.println("a = " + a);
        System.out.println("temp = " + temp);
        //2.adim
        a=b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //3.adim
        b=temp;
        System.out.println("b = " + b);
        System.out.println("temp = " + temp);

        System.out.println("a = " + a);


    }
}
