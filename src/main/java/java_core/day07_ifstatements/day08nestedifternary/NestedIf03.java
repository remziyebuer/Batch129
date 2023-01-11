package java_core.day07_ifstatements.day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {
    public static void main(String[] args) {

       /* Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin*/

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen passwordunuzu giriniz");

        String pwd = input.nextLine();

        char  firstChar = pwd.charAt(0);//6 kere String class a gidip alirsak java cok yavaslar
        // o yüzden alip memory e koyacaz.Direk ordan kullanacaz.kod yazma standarti;
        // eger bir kodu cok defa kullanacaksaniz sonucu önce bir variable a koyun
        // bunu mutlaka yapin yoksa hicbisey bilmiyor derler

        if (firstChar  >= 'A' && firstChar  <= 'Z') {

            if (firstChar  == 'A') {//Stringler icin equals charlar icin == kullanilir//65==65 true olur
                System.out.println("Password gecerlidir");
            } else {
                System.out.println("Passwort büyük harf ama A degil bu yüzden gecersiz");
            }


        } else if (firstChar >='a'&& firstChar <='z') {

            if (firstChar =='z'){
                System.out.println("Passwort gecerlidir");
            }else{
                System.out.println("Passwort büyük harf ama A degil bu yüzden gecersiz");
            }

        }else{
            System.out.println("ilk karakter harf olmali");
        }


    }
}
