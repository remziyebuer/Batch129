package advanced_java.practice2;

public class Q06_ForLoop_Sekil {

/*
		Şekli Yazdırınız:

        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F

        */

    public static void main(String[] args) {

        char ch = 'A';
        for(int i=0; i<6; i++){

            for(int j=0; j<=i; j++){
                System.out.print((char)(ch+i)+" ");
            }
            System.out.println();
        }
    }




}
