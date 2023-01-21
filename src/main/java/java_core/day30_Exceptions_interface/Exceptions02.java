package java_core.day30_Exceptions_interface;

public class Exceptions02 {
    public static void main(String[] args) {


    }

    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}