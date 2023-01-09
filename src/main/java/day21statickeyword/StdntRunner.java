package day21statickeyword;

public class StdntRunner {
    public static void main(String[] args) {
        //StdName static oldugundan , ona ulasmak icin object olusturmadim.
        // Sadece Class adini kullanmak yeterlidir.
        System.out.println("Student Name = " + Student.stdName);//class adi
        //yaz nokta koy==> Tom Hanks

        //age non - static oldugundan ona ulasmak icin object olusturmak zorundayiz.12
        Student std1 = new Student();
        System.out.println("std1.age = " + std1.age);//obje adi yaz nokta
        // koy age cikinca sec ==> 13


        Student std2 = new Student ();//ikinci bir obje olusturdum.
        System.out.println("std2.age = " + std2.age);

        //static olam metod a ulasmak icin;
        String initials =   Student.getInitials("Tom Hanks");
        System.out.println("initials = " + initials);//TH

       //non - static olan metod a ulasmak icin;
        int vowels = std1.countVowels("Tom Hanks");
        System.out.println("vowels = " + vowels);//2


    }
}
