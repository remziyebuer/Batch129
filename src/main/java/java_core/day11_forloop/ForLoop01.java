package java_core.day11_forloop;

public class ForLoop01 {


    public static void main(String[] args) {

        //Example ;  Verilen bir String'de ilk 'a' harfinden önceki tüm karakterleri
       // sira ile yazdiriniz.
        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);// iki kere kullanmak yerine kaba koyup kullanalim

            if (ch == 'a') {
                break;
            }
            System.out.println(ch);
        }

        //Example 2; Verilen bir String'de son 'a'dan sonraki tüm karakterleri
        // ters sirada yazdiriniz. "Germany" ==> yn

        String t = "Germany";

        for (int i =  t.length() -1 ; i>=0 ; i--) {

            char ch = t.charAt(i);

            if(ch  == 'a'){
                break;
            }
            System.out.println(ch);
        }

        //BENIM KESFETTIGIM CÖZÜM

        String str = "Germany";

        //1.soru

        for (int i = 0; i < str.indexOf('a'); i++) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        System.out.println("   ");
        //2.soru

        for(int i = str.length()-1; i>str.lastIndexOf('a'); i--){
            char ch = str.charAt(i);
            System.out.print(ch);
        }



    }
}

