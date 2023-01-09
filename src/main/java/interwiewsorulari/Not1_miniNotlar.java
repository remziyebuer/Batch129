package interwiewsorulari;

import javax.management.MBeanAttributeInfo;

public class Not1_miniNotlar {
    public static void main(String[] args) {


//post ve pre increment decrement interwiew de sorulabilir

// iki sayinin isareti ayni ise bu sayilari carpan isaretleri farkli
        // ise farkli isaretli sayilari carpamiyorum mesaji veren kodu yaziniz.

        int m = 5;
        int n = -6;
        //Object Java da bütün " non-primitive  data typ"(Class) larinin ortak "Parent"
        // (baba) idir.Farkli data type 'lari icin ortak bir variable olusturmak isteediginizde
        //data type olarak object kullanabilirsiniz
        //Java da "object" insanlik aleminde Hz Adem' e benzer.

        Object r = (m > 0 && n > 0) || (m < 0 && n < 0) ? m * n :
                "Farkli isaretleri carpamiyorum";

        System.out.println(r);

        //Example ; Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //   -4 ==> -1*4    4==>4     0==>0

        int c = -4;
        int r2 = c < 0 ? -1 * 4 : c;



//hoca oracle sertifikasini kurs bitimine dogru tavsiye etti ve kaynak verebilecekl.söyledi


















    }



}
