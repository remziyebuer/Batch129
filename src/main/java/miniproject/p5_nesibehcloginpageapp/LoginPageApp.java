package miniproject.p5_nesibehcloginpageapp;

import java.util.Scanner;

public class LoginPageApp {
    /*

Project: Bir siteye üye olma ve giriş yapma sayfası tasarlayınız.

         menü: kullanıcıya işlem seçimi için menü gösterilir.

         üye olma(register): kullanıcıdan ad-soyad, kullanıcı adı, email ve şifre bilgileri alınız.
                             kullanıcı adı, email ve şifre birer listede tutulur.
                             aynı kullanıcı adı veya email kabul edilmez.

         giriş(login): kullanıcı adı/email ve şifre girilir.
                       kullanıcı adı veya email bulunamazsa kayıtlı değil, üye olun uyarısı verilir.
                       kullanıcı adı/email ile aynı indekste kayıtlı şifre doğrulanırsa siteye giriş yapılır.

         email validation: boşluk içermemeli
                         : @ içermeli
                         : gmail.com,hotmail.com veya yahoo.com ile bitmeli.
                         : mailin kullanıcı adı kısmında(@ den önce) sadece büyük-küçük harf,rakam yada -._ sembolleri olabilir.

         password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli
 */
    public static void main(String[] args) {

        start();


    }

    public static void start() {

        //1-Kullaniciya islem menusu gösterelim.

        Scanner scan = new Scanner(System.in);

        int select;

        do{

            System.out.println("====TECHPROEDUCATION=====");
            System.out.println("1-Uye olma" +
                    "2-Giris yap" +
                    "0-CIKIS");
            select = scan.nextInt();

            switch (select){
                case 1 :
                    break;
                case 2 :
                    break;
                case 0 :
                    System.out.println("Iyi gunler dileriz...");
                    break;
                default:
                    System.out.println("Hatali Giris! Yeniden deneyiniz");
                    break;
            }
        }while(select!=0);
    }
    //2.Tum user ' larin  ortak ozelliklerini tutmak icin bir adet user class i
    // olusturalim
}
