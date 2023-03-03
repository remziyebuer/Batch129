package miniproject.p5_nesibehcloginpageapp;

public class User {
    //3.ad_soyad bilgisi, kullanici adi e-mail bilgisi ce password olacak tum
    // userlarin ortak özelligi
    private String name;
    private String username;
    private String email;
    private String password;
    //4.User objesi olusturulurken bu özellikler set edilsin istiyorum

    public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }
//5.getter metodlari olusturulur
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
