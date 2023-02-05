package java_core.day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    /* 1) Lambda functional programming' dir.
              2) "functional programming" = ne yapmak gerekir? ile ilgilenir. "Nasıl yapmak gerekir? ile ilgilenmez.
              3) "Functional programming" collection'lar ve Array'ler de kullanilir.
      4)  Lambda, Java ya, Java 8 ' de eklendi.

     */
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        System.out.println(nums);


        System.out.println();

        printElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareofOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        farkliCiftEamanlarinKaresininCarpimi(nums);
        getMaxValue(nums);
        getMaxValue2(nums);
        getMaxValue3(nums);
        getMinValue(nums);
        getMinValue2(nums);
        getMinValue3(nums);
        getMinValue4(nums);
        getMinGreaterThanSevenEven(nums);

    }

    //1)Create a method to print the list elements on the console in the same line with a
    // space between two consecutive elements.(Structured)
    //Bir List'teki elemanlari ayni satirda bosluk koyarak yazdiran methodu olusturunuz
    public static void printElements1(List<Integer> nums) {
        for (Integer w : nums) {
            System.out.print(w + " ");
        }

    }

    //2)Create a method to print the list elements on the console in the same line with a
    // space between two consecutive elements.(Functional)
    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u
    //  olusturunuz.(Functional)
    public static void printElements2(List<Integer> nums) {
        //12 9 131 14 9 10 4 12 15
        nums.stream().forEach(t -> System.out.print(t + " "));
    }

    //"stream" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e
    // cevirir öyle calisir

    //3)Create a method to print the even list elements on the console in the same line with
    // a space between two consecutive elements.(Structured)
    //Bir List'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz

    public static void printEvenElements1(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }
    }


    //4)Create a method to print the "even" list elements on the console in the same line with
    // a space between two consecutive elements.(Structured)
    //Bir List'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran methodu olusturunuz
    public static void printEvenElements2(List<Integer> nums) {
        //  nums.stream().filter(t ->t%2==0).forEach(t -> System.out.print(t + " "));
        //  bu asagidaki formatta kullanilir

        nums.
                stream().//Burada dikey formata geldi
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " "));


    }

    //5)Create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki tek sayı olan elemanların karelerini aynı satırda ara

    public static void printSquareofOddElements(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 1).
                map(t -> t * t).
                forEach(t -> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums) {
        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " "));

    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {
        Integer sum = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }
   /*     "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
        "filter()" filtrelemek icin kullanilir.
        "map()" u var olan elemani degistirmek icin kullanilir.
        "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
        Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
        "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
        Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
        "u" ise degerlerini her zaman "stream" den alir*/

    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements.
    //8)tekrarsiz cift elemanlarin karesinin carpimini hesaplayan metodu

    public static void farkliCiftEamanlarinKaresininCarpimi(List<Integer> nums) {
        int product = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9)Create a method to find the "maximum value" from the list elements.

    //9)Elemanlarin en yuksek degerli olanini bulan metodu olusturun

    //1.yol
    public static void getMaxValue(List<Integer> nums) {
        //reduce () kullanacagim cun ki max degerini bulmak demek tek degere dusurmek demek ayni zamanda.

        //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
        //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol
    public static void getMaxValue2(List<Integer> nums) {
        //hocamizin ilk anlatimlarinda ki ilk elemanlari alarak konteynira koyup karsilastirmak.
        // bu da bir yol ama ilkine göre daha fazla performans harcar.

        Integer max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //3.yol
    public static void getMaxValue3(List<Integer> nums) {
        //iki tane sayi görürsen hep ikinciyi sec cün ki sorted yaptik böylece en sonda
        // olan büyügü almis olacak.reduce ten sonra birsey yazmassak alti kirmizi yanar cun ki Optional dir
        //o yüzden sona get() koyariz bu metod Optional Integer'i Normal Integer ' a cevirir.
        Integer max = nums.stream().distinct().sorted().reduce((t, u) ->u).get();// reduce isleminin
        // icine direkt kod yazdik diger reduce lerden farkli olarak ondan altini kirmizi cizdi.
        System.out.println(max);

    }

    //10)Create a method to find the minimum value from the list elements
    //10)elemanlarin minimum valusunu bulunuz

    //1.yol

    public static  void getMinValue(List<Integer>nums){
       Integer min =  nums.stream().distinct().reduce((t,u)->t>u? t : u).get();
        //baslangic degeri vermedigimden alti kirmizi yanar o yüzden get() kullaniriz.
    }
        //2.yol

        public static  void getMinValue2(List<Integer>nums) {
            Integer min = nums.
                    stream().
                    distinct().
                    sorted(Comparator.reverseOrder()).
                    reduce((t,u)->u).get();//bu iki degerden u ' yu al

//sorted(Comparator.reverseOrder()):tersten sirala demektir en kucugu bulacam buyukten kucuge siralayacagim.
        }

    //3.yol

    public static  void getMinValue3(List<Integer>nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t).get();//bu iki degerden t ' yi al;
        //eger buyukten kucuge siraladigimizda buyuk degeri degilde t yani kucuk degeri alirsak ta
        //min degeri buluruz.

        //4.yol
    }
        public static  void getMinValue4(List<Integer>nums) {
            Integer min = nums.stream().distinct().reduce((t, u)-> Math.min(t,u)).get();
            // burda sorted() yapmiyoruz.hey java iki sayi aldigin da math classina git o sayilardan
            // kucuk olani al***sevdim bu yolu.

        }


        //11)Create a method to find the minimum value which is greater than 7 and even from the list
        //11)Minimum value 7 den buyuk ve cift olsun

    public static  void getMinGreaterThanSevenEven(List<Integer>nums) {
        Integer min = nums.
                stream().
                distinct().
                filter(t->t>7 && t%2==0).
                reduce((t, u)-> Math.min(t,u)).get();
        System.out.println(min);
    }
    }

