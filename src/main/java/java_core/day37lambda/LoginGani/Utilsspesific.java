package java_core.day37lambda.LoginGani;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Utilsspesific {
    /*
    * Bir özel String işlemleri util'i: Örneğin, bir özel URL oluşturma işlemi için kullanılan bir util yazabilirsiniz. Bu util, verilen bir temel URL ve ek parametreler listesi kullanarak, özelleştirilmiş bir URL oluşturur. Örneğin, kullanıcının seçtiği bir arama terimini alarak,
    * arama motorunun URL'sini oluşturan bir util yazabilirsiniz.*/
    public static String buildSearchUrl(String baseUrl, String searchTerm) {
        return baseUrl + "?q=" + searchTerm;
    }

    /*
    *Bir özel veritabanı işlemleri util'i:
    *  Örneğin, bir özel veritabanı bağlantısı oluşturma işlemi için kullanılan bir util yazabilirsiniz. Bu util, veritabanına bağlanmak için gerekli olan bilgileri alır ve gerekli bağlantıyı oluşturur. Örneğin, veritabanı bağlantısını
    * şifrelemek için özelleştirilmiş bir util yazabilirsiniz.
    * */
//    public static Connection getConnection(String url, String username, String password) throws SQLException {
//        String encryptedPassword = encryptPassword(password);
//        Properties props = new Properties();
//        props.setProperty("user", username);
//        props.setProperty("password", encryptedPassword);
//        return DriverManager.getConnection(url, props);
//    }
/*
* Bir özel tarih işlemleri util'i:
* Örneğin, belirli bir tarihin hafta sonuna
* denk gelip gelmediğini kontrol eden bir util yazabilirsiniz.
* Bu util, verilen bir tarihi alır ve
*  bu tarihin hafta sonuna denk gelip gelmediğini kontrol eder.*/

    public static boolean isWeekend(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        return (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY);
    }

    /*Bir özel dosya işlemleri util'i:
     Örneğin, bir dosya yolu verildiğinde,
     bu dosyanın var olup olmadığını kontrol eden bir util yazabilirsiniz.
    Bu util, dosya varsa "true", yoksa "false" döndürür.*/
    public static boolean isFileExists(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }


}
