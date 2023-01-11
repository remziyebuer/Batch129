package java_core.day13_whileloop_dowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

      /*

    IT'de yeni bir sey ogrenirken;
    i) "Ne? Nedir?" oldugunu ogren
    ii) "Neden var? Nicin var?" oldugunu ogren
    iii) "Simple Implementation - Basit Uygulama"
         "Mid-Level Implementation - Orta Duzey Uygulama"
         "Advance-Level Implementation - Ileri Duzey Uygulama"
         "Project-Level Implementation - Proje Duzeyinde Uygulama"
          yapmak lazim.

    Piyasadakiler simple'da takilir. Siz simple-mid arasi levelde takilirsaniz ise girersiniz, dedi


      */


        //Array nasil olusturulur?

        String stdNames[] = new String[5];

        //System.out.println(stdNames);//adresi yazdirir

        //Array consol ' a nasil yazdirilir
        //to String()method'unu kullanmadan sadece array ismi
        // ile yazdirirsaniz Java o Array ' in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

//Array'e eleman ekleme nasil yapilir?
        stdNames[2] = "Ajda";
        System.out.println(Arrays.toString(stdNames));//[null,null,Ajda,null,null]
        stdNames[0] = "Cuneyt";
        stdNames[1] = "Kemal";
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames));//[Cuneyt, Kemal, Ajda, Ezel, Besir]


    }
}
