package miniproject.p5_nesibehcloginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    //6.User objesi ile ilgili islemler
    // kullanici bilgilerini tutmak icin list olusturalim.
    List<User> userList = new ArrayList<>();
    //tum User objelerini bir list te tutabilirm.Data type User olan...

    Scanner scan = new Scanner(System.in);
    //tum metodlarda kullanici ile iletisime gecmek icin olusturalim
    //7.username veya email ile kayitli User' i getirme icin bir method olusturalim.

    private User getUser(String userNameorEmail) {
        for (User user : userList) {
            if (user.getPassword().equals(userNameorEmail)) {
                return user;
            } else if (user.getPassword().equals(userNameorEmail)) {
                return user;
            }
        }

        return null;
    }

     //8.email validation

    private static boolean validateEmail(String email) {
        boolean isValid = false;

        boolean isExistSpace = email.contains(" ");//bosluk iceriyor mu?
        if (isExistSpace) {
            System.out.println("Email bosluk icermemeli");
            isValid = false;
        }

        boolean isExistAt = email.contains("@");

        if (!isExistAt) {
            System.out.println("Email @ icermelidir");
            isValid = false;

        } else if (email.replace("[^@]", "").length() != 1) {
            System.out.println("Lutfen sadece bir tane @ kullaniniz");
            isValid = false;

        } else {

            String firstPart = email.split("@")[0];
            boolean firstPartLength = firstPart.length() > 0;//icinde eleman olmali bos olmamali
            // yoksa asagidaki kod true verir bos olmasina ragmen
            if (!firstPartLength) {
                System.out.println("@ ten once karakter olmali");
                isValid = false;

            } else {


                boolean validateFirstPart = firstPart.replace("[^a-zA-Z0-9_.-]", "").isEmpty();
                if (validateFirstPart) {
                    System.out.println("Sadece buyuk kucuk harfler ile _ . ve - ile e mail adresi olusturabilirsiniz");
                    isValid = false;
                }

            }


            String secondPart = email.split("@")[1];

            boolean validateSecondPart = secondPart.equals("gmail.com") ||
                    secondPart.equals("yahoo.com") ||
                    secondPart.equals("hotmail.com");
            if (!validateSecondPart) {
                System.out.println("E-mail @ ' ten sonra gmail.com, yahoo.com  ya da hotmail.com ile bitmelidir");
                isValid = false;
            }
        }
        if (!isValid) {
            System.out.println("lutfen tekrar deneyiniz");
        }
        return isValid;

    }

    public static boolean validatePassword(String password) {
        boolean isValid;
        boolean existSpace = password.contains(" ");
        boolean lengthGtSix = password.length() >= 6;
        boolean existUpper = password.replaceAll("[^A-Z]", "").length() > 0;
        boolean existLower = password.replaceAll("[^a-z]", "").length() > 0;
        boolean existDigit = password.replaceAll("[\\D]", "").length() > 0;
        boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;

        if (existSpace) {
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengthGtSix) {
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

        isValid = !existSpace && lengthGtSix && existUpper && existLower && existDigit && existSymbol;

        return isValid;
    }


}