package day11forloop;

public class NestedForLoop {

    public static void main(String[] args) {


/*
    Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
*/


   for( int i = 1; i<5; i++){

    System.out.println("Week : " + i);

    for( int k = 1; k<8 ; k++){

        System.out.println("  Day : " + k);
    }

}

//Mecbur kalmadikca kullanmayiz ama nested  for loop ile ilgili
// interwiew 'de soru sorarlar ve bilmemiz lazim



    }
}
