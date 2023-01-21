package sulehocaexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C09_Exceptions {
    public static void main(String[] args) throws IOException {
        //avalaible metodu; kullanilabilir byte sayisini bize verir


        FileInputStream fis = null;
        try {
            //onceden disarda  FileInputStream fis = new FileInputStream("src/main/java/sulehocaexceptions/Taskexceptions")
            // vardi burda doysa bulamam hatasi endisesinden buraya gelip try catch yaptik ortaya bu göruntu cikti
            fis = new FileInputStream("src/main/java/sulehocaexceptions/Taskexceptions");
        } catch (FileNotFoundException e) {
            System.out.println("problem olustu : " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("kullanilabilir byte sayisini bize verir: " + fis.available());//6222

        fis.read();
        fis.read();
        fis.read(); //Dosyadan 3 byte lik veri okudu

        System.out.println("kullanilabilir byte sayisini bize verir: " + fis.available());//6219 kaldi






    }
}
