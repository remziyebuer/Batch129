package sulehocaexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_Exceptions {
    public static void main(String[] args) throws FileNotFoundException {

// skip metodu;

        try {//obje icerdede olusturulur

            FileInputStream fis = new FileInputStream("src/main/java/sulehocaexceptions/Taskexceptions");
            fis.skip(45);//45 byte lik data atlanildi
            System.out.println("45 byte lik data atlanildi");
            int i = fis.read();
            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
            }

        } catch (Exception e) {//altta parent olacak yoksa child ulasilmaz kod olur.
            System.out.println("Dosya okurken problem olustu : " + e.getMessage());
            e.printStackTrace();
        }


    }
}
