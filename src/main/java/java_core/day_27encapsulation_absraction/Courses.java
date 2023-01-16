package java_core.day_27encapsulation_absraction;

public abstract class Courses {

    /*
    1) Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
    Body'si olmayan method'lara "abstract method"lar denir.

    2)"abstract method"'lar child class'lar tarafindan "override" edilmek zorundadırlar.
    Bu yuzden eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseni
     o method'u  abstract yapmak gerekir.

     3) Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
     "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

     4)"abstract method" lar siradan class'larin icine yazilamazlar."abstract method"larin icine yazildiklari
     class'lar da abstract olmak zorundadirlar.


5)"abstract class" larda hem "abstract method" lar hem de "concrete method" lar kullanilabilir.

6)"concrete class" lar "abstract class" larin child'i olabilirler.
  "abstract method" larin override edilme zorunlulugu "concrete class" lar icindir.

 */
    public abstract void math ();
    public void art() {
        System.out.println("Painting....");
    }
}
