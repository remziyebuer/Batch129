package java_core.day36lambda;

public class Utils {
    //utils lazim olacak metodlarin konuldugu yer.depo gibi.
    //mesela projemde durmadan bir sayinin karesini alacaksam;
    public static  int getLengthSquare(String s){
      return s.length()*s.length();
    }

    public static  boolean isLengthEven(String s){
        return s.length()%2==0;
    }
    //utis'i kalabaliklastirmayin bir defa kullanacaginiz seyi
    // koymayin cöplüge cevirmeyelim bir seyi utils ekoyacaginizda
    // suna emin olmalisniz:bu herkesin isine yarayacak bir sey.

    public static boolean isNumberEven(int x){
       return  x%2==0;
    }

    public static String getLastChar(String s){
        return s.substring(s.length()-1);
    }

    public  static  void printInTheSameLineWithSpace(Object obj ){// hem Stringler hem de int'ler icin
        // kullanabilmeliyim

        System.out.println(obj + " ");
    }

    public static  int getSumOfDigits(int x ){
        int sum = 0 ;
        while (x!=0){
            sum = sum + x%10;
            x = x/10;
        }
        return sum;
    }
    //adam metod olusturmus isminde hata yapmis 100 yerde kullanmis 100 unude degistiremez ki
    // o zaman metodun ismine tiklayin rename refactor mouse istedigin yere koy degismek istedigin
    // yeri degistir enter bas metod ismi projenin heryerinde degisir
}
