package java_core.day30_Exceptions_interface;
/*
1)Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz.
2)Java parent'lar Class oldugunda "multiple parent"a musaade etmez ama biz bazen "multiple parent"a ihtiyac duyariz.
  Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
  Bu yapi sayesinde bir Class icin coklu interface parent olusturabiliriz.
  3)Coklu interface parent'lerin herbirinin icine ayni ismli metodlar koyabiliriz
  4)Child class herhangibirini override ettiginde hepsini override etmis gibi olur sonrada body i
  Child Class#da yazarak uygulamasini yazmis olur
 */
public class Civic implements Ac, Engine, Security{
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("AC runs perfecttly.");
    }
}
