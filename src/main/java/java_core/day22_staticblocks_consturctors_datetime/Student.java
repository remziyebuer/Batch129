package java_core.day22_staticblocks_consturctors_datetime;

public class Student {

    String name ;
    int age;
    int grade;
    String stdId;
    String address;


    //Otomatik olusturtuk
    public Student(String name, int age, int grade, String stdId, String address) {

        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }
    //objeleri ekranda görmek icinse toString()

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +     //bu formatla oynayabilirsin.grade cikar yazmazmis
                                     // deneharfleri degistirerek buyuk kucuk yapabilirsin
                                      // Student i return önunde ki silebilir sin.
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
