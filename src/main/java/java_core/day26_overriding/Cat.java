package java_core.day26_overriding;

public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats meow...");
    }

    //@Override : Override Annotation ' i denir bunu buraya koyarak
    // Java nin override ' i kontrol etmesini saglariz.Override kurallarinin java tarafindan
    //kontrol edilmesini saglar.
    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }
//bu boslukta tikla kutuda generate cikan kutuda override sec cikan metinde super.eat();
// sil  System.out.println("Cats eat..."); yaz.Babanin yazligini kendin kullanabilecegin
// sekilde düzenlemeye benzer.Childda ki

    @Override
    public Cat create() {//raturn type olusturdugumuz objenin aynisi olabilir ya da parenti olabilir
        return new Cat();
    }

    //metod ta isim ve paranteze dokunulamaz sadece access modifier ve return type dokunulabilinir***
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a * b;
    }

    @Override
    public void eat() {
        System.out.println("Cats eat...");

        //kirmizi oka basarsak bizi bu metodun parent klassinda ki eat metoduna götürür.
        // Orda asagi mavi oka basarsak tekrar geri burdaki klassa ve bu sekilde yapilan
        // hale gecer


    }
}
