package java_core.day37lambda.LoginGani;

import java.util.*;
import java.security.*;
import java.util.regex.*;

public class SecureLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String username;
        String password;

        // Kullanıcı adı ve parola girişini isteyin
        System.out.print("Kullanıcı Adı: ");
        username = input.nextLine();
        System.out.print("Parola: ");
        password = input.nextLine();

        // Parolayı hashleyin
        String hashedPassword = hashPassword(password);

        // Kullanıcı adı ve hashlenmiş parolayı veritabanıyla karşılaştırın
        if (validateUser(username, hashedPassword)) {
            System.out.println("Başarılı giriş.");
        } else {
            System.out.println("Geçersiz kullanıcı adı veya parola.");
        }
    }

    public static String hashPassword(String password) {
        // Parolayı SHA-256 algoritması kullanarak hashleyin
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes("UTF-8"));
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean validateUser(String username, String hashedPassword) {
        // Kullanıcı adı ve hashlenmiş parolayı veritabanıyla karşılaştırın
        String savedHash = "7d793037a0760186574b0282f2f435e7";
        return username.equals("admin") && hashedPassword.equals(savedHash);
    }
}
