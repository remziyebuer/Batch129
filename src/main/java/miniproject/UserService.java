package miniproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMenu() {
        System.out.println("TECHPROEDUCATION ' a hosgeldiniz");
        System.out.println("1- Uye ol");
        System.out.println("2- Giris yap");
        System.out.println("3- Cikis");
        System.out.println("Seciminizi giriniz: ");


    }

    public void register() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ad soyad giriniz");
        String name = scan.nextLine();
        String username;

        boolean existUsername;
        do {
            System.out.println("Kullanici adinizi giriniz");
            username = scan.nextLine();
            existUsername = usernameList.contains(username);

            if (existUsername) {
                System.out.println("Bu username daha once kullanilmistir.Yeniden deneyiniz.");
            }

        } while (existUsername);

        String email;
        boolean existEmail;
        boolean isValid;

        do {
            System.out.println("E - mail giriniz");
            email = scan.nextLine();
            isValid = validateEmail(email);
            existEmail = emailList.contains(email);

            if (existEmail) {
                System.out.println("Bu email daha once kullanilmistir.Yeniden deneyiniz.");
                isValid = false;
            }

        } while (!isValid);


        String password;
        boolean isValidPsw;


        do {
            System.out.println("Sifre giriniz");
            password = scan.nextLine();
            isValidPsw = validatePassword(password);

        } while (!isValidPsw);


        User user = new User(name, username, email, password);
        System.out.println(user);
        usernameList.add(username);
        usernameList.add(email);
        usernameList.add(password);
        System.out.println("Tebrikler kayit islemi gerceklesti");
        System.out.println("Artik kullanici adi veya sifre ile giris yapabilirsiniz");

    }










        public static boolean validateEmail (String email){
            boolean isValid;

            boolean space = email.contains(" ");
            boolean isContainAt = email.contains("@");

            if (space) {
                System.out.println("Email bosluk icermemeli");
                isValid = false;
            } else if (!isContainAt) {
                System.out.println("Email @ icermemelidir");
                isValid = validateEmail(email);

            } else {
                String firstPart = email.split("@")[0];
                String secondPart = email.split("@")[1];

                boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]", "").length() == 0;
                boolean checkSecond = secondPart.equals("gmail.com") ||
                        secondPart.equals("yahoo.com") ||
                        secondPart.equals("hotmail.com");


                if(!checkFirst){
                    System.out.println("Email büyük-küçük harf,rakam yada -._ karakterler disinda karakter iceremez");
                } else if (!checkSecond) {
                    System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmeli.");
                }


                isValid = checkFirst && checkSecond;

            }
            return isValid;
        }


        public static boolean validatePassword(String password){
        boolean isValid;


            boolean space = password.contains(" ");
            boolean lengthGt6 =  password.length()>=6;
            boolean existUpper = password.replaceAll("[^A-Z]","").length()>0;
            boolean existLower = password.replaceAll("[^a-z]","").length()>0;
            boolean existDigit = password.replaceAll("[\\D]","").length()>0;
            boolean existSymbol = password.replaceAll("[\\P{Punct}]","").length()>0;

            if(space){
                System.out.println("Sifre bosluk iceremez");
            } else if (!lengthGt6) {
                System.out.println("Sifre en az 6 karakter icermelidir");
            } else if (!existUpper) {
                System.out.println("Sifre en az 1 buyuk harf icermelidir");
            } else if (!existLower) {
                System.out.println("Sifre en az 1 kucuk harf icermelidir");
            } else if (!existDigit) {
                System.out.println("Sifre en az 1 rakam icermelidir");
            } else if (!existSymbol) {
                System.out.println("Sifre en az 1 sembol icermelidir");
            }

            isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

            return isValid;
        }


        }







