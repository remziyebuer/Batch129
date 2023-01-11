package java_core.day09_incrementdecrement_ternary_switch;

public class Switch01 {

    public static void main(String[] args) {


       String dayName = "Tuesday";

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }

        //2.yol: SWITCH==>degis demek bir duruma göre bir is yapmak baska bir
        // duruma göre bir is yapar

        switch (dayName) {//anlami day name in degerine göre degis.bunu yaparken farkli
            // durumlar olabilir case durum demek Sunday olma durumunda 1 yazip tenefüs alir

            case "Sunday": //iki nokta ya dikkat et
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case"Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Lütfen gecerli gun ismi giriniz");


        }


    }
}
