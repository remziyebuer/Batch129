package practiceday02;

public class Soru {

    public static void main(String[] args) {
        // Bir Stringin son karakterini nasil buluruz
        String str = "Java ile hayat cok güzel";
//Son karakter sonuncu indexte oldugundan ve de sonuncu index toplam
// karakter sayisindan bir eksik oldugundan metnin uzunlugu metodu
// ile uzunluguna bakar sonra index icin bir eksiltiriz.Cünkü Indexler 0 'dan basliyordu

        int sonuncuIndex = str.length() - 1;
        System.out.println("sonuncuIndex = " + sonuncuIndex);//23
        char sonKarakter = str.charAt(23);
        System.out.println("sonKarakter = " + sonKarakter);// l
    }
}
