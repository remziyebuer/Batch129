package advanced_java.practice5;

public class Q05_Arrays_ToplamVeVeriler {
    /*
   Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.

   {4,6,5,-10,8,5,20} ===> 10
   4 + 6 = 10
   5 + 5 = 10
  -10 + 20 = 10
   */
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, -10, 8, 5, 20};

        ikililleriBul(arr, 100);

    }

    public static void ikililleriBul(int[] arr, int toplam) {
        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == toplam) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + toplam);
                    sayac++;
                }
            }
        }

        if(sayac==0){
            System.out.println("Toplama eşit sayı ikilileri bulunmamaktadır");
        }
    }
}
