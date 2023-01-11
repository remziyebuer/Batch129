package advanced_java.practice4;

public class ArraysOrtalama {
    public static void main(String[] args) {

//Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran
// bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11, 3};

        double toplam = 0;

        for (int w : arr) {
            toplam += w;
        }
        System.out.println("toplam = " + toplam);

        double ortalama = toplam / arr.length;
        System.out.println("ortalama = " + ortalama);

        System.out.print("Ortalamadan büyük elementler: ");
        for (int w : arr) {

            if (w > ortalama) {
                System.out.print(w + " ");
            }
        }

        //System.out.printf("%.2f",ortalama);




















    }
}
