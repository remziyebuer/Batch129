package tasks.nesibehcloginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    //6.kullanici bilgilerini tutmak icin list olusturalim.
    List<User> userList = new ArrayList<>();
    //tum User objelerini bir list te tutabilirm.Data type User olan...

    Scanner scan = new Scanner(System.in);
    //tum metodlarda kullanici ile iletisime gecmek icin olusturalim
    //7.username veya email ile kayitli User' i getirme icin bir method olusturalim.

    private User getUser(String userNameOrEmail) {
        for (User user : userList) {
            if (user.getUsername().equals(userNameOrEmail)) {
                return user;
            } else if (user.getPassword().equals(userNameOrEmail))
                return user;
        }
        return null;
    }
//8.E-mail Validation
    private static  boolean validateEmail(String email){
        boolean isValid=true;
        boolean isExistSpace=email.contains(" ");
        boolean isAt=email.contains("@");
        if(isExistSpace){
            System.out.println("Email bosluk iceremez");
            isValid=false;
        }

        return isValid;
    }
}