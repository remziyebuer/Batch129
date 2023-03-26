package java_core.day37lambda.LoginGani;

import java.util.*;

public class LoginErklarung {
    /*
    * Bir web uygulaması için tamamen güvenli bir login işlemi oluşturmak oldukça zor bir iştir.
    *  Ancak, aşağıdaki önlemler alınarak güvenli bir login işlemi oluşturulabilir:

Parolaların hashlenmesi: Parolaların hashlenmesi, kullanıcıların parolalarının açık metin olarak depolanmasını önler.
*  Hashlenmiş parolalar, saldırganlar tarafından geri dönüştürülemeyecek şekilde depolanır.

Şifre karmaşıklığı gereksinimleri:
*  Kullanıcıların parolalarının en az bir büyük harf, bir küçük harf,
* bir rakam ve bir özel karakter içermesi gerektiği gibi karmaşıklık gereksinimleri belirlemek, şifreleri daha güçlü hale getirir.

Kullanıcıların giriş denemelerinin sınırlandırılması: Kullanıcıların
* belirli bir süre içinde belirli bir sayıda giriş denemesi yapmalarına izin vermek,
*  otomatik olarak hesaplarının kilitlenmesine neden olabilir. Bu, saldırganların hesapları ele geçirmelerini önler.

Oturum açma işlemi için HTTPS kullanımı: Oturum açma işlemlerinin
*  HTTPS üzerinden gerçekleştirilmesi, kullanıcıların kimlik bilgilerinin şifrelenmesini sağlar.

Oturum zaman aşımı: Oturumların belirli bir süre içinde sona ermesi,
* kullanıcıların bilgisayarlarında unutulması veya başka birisi tarafından ele geçirilmesi durumunda hesapların korunmasını sağlar.

Brute-force saldırılarını önlemek için CAPTCHA: Kullanıcıların giriş yaparken
* CAPTCHA gibi bir doğrulama yöntemi kullanmaları, botların otomatik giriş denemelerini engeller.

Güvenli şifre sıfırlama işlemi: Kullanıcıların parolalarını sıfırlamak için kullanabilecekleri bir
*  güvenli şifre sıfırlama işlemi sağlamak, kullanıcıların hesaplarının güvenliğini artırır.

Kullanıcı adı veya parola hatası verirken ayrıntılı hata mesajlarından kaçınmak:
* Kullanıcı adı veya parolayı yanlış girerken verilen ayrıntılı hata mesajları,
*  saldırganların hesapları ele geçirmelerine yardımcı olabilir.

Daha güvenli kimlik doğrulama yöntemleri: Biyometrik kimlik doğrulama yöntemleri
*  gibi daha güvenli kimlik doğrulama yöntemleri kullanmak, kullanıcıların hesaplarının güvenliğini artırabilir.*/


/*Das Erstellen eines vollständig sicheren Anmeldeprozesses
für eine Webanwendung ist eine ziemliche Herausforderung. Es kann jedoch eine sichere Anmeldung erstellt werden, indem die folgenden Vorsichtsmaßnahmen getroffen werden:

Hashing von Passwörtern: Das Hashing von Passwörtern verhindert,
 dass die Passwörter der Benutzer im Klartext gespeichert werden. Gehashte
 Passwörter werden gespeichert, damit sie von Angreifern nicht wiederhergestellt werden können.

Anforderungen an die Kennwortkomplexität: Das Festlegen von Komplexitätsanforderungen,
 z. B. dass Benutzerkennwörter mindestens einen Großbuchstaben, einen Kleinbuchstaben,
  eine Zahl und ein Sonderzeichen enthalten müssen, macht Kennwörter stärker.

Beschränken der Anmeldeversuche von Benutzern: Wenn Benutzern erlaubt wird,
innerhalb eines bestimmten Zeitraums eine bestimmte Anzahl von Anmeldeversuchen durchzuführen,
kann dies automatisch dazu führen, dass ihr Konto gesperrt wird. Dies verhindert, dass Angreifer Konten kapern.

Verwendung von HTTPS für den Anmeldeprozess: Durch die Durchführung von Anmeldungen
über HTTPS wird sichergestellt, dass die Anmeldeinformationen der Benutzer verschlüsselt werden.

Sitzungs-Timeout: Ermöglicht den Schutz von Konten für den Fall,
dass Sitzungen innerhalb eines bestimmten Zeitraums ablaufen, auf den Computern der Benutzer vergessen oder von jemand anderem entführt werden.

CAPTCHA zur Verhinderung von Brute-Force-Angriffen: Benutzer, die beim Anmelden
eine Validierungsmethode wie CAPTCHA verwenden, hindern Bots an automatischen Anmeldeversuchen.

Sicherer Kennwortzurücksetzungsprozess: Die Bereitstellung einer sicheren Kennwortzurücksetzung,
mit der Benutzer ihre Kennwörter zurücksetzen können, erhöht die Sicherheit der Benutzerkonten.

Vermeidung detaillierter Fehlermeldungen bei der Eingabe eines Benutzernamen- oder Passwortfehlers:
Detaillierte Fehlermeldungen bei der Eingabe eines falschen Benutzernamens oder
 Passworts können Angreifern dabei helfen, Konten zu kapern.

Sicherere Authentifizierungsmethoden: Die Verwendung sichererer Authentifizierungsmethoden,
 z. B. biometrischer Authentifizierungsmethoden, kann die Sicherheit der Benutzerkonten erhöhen.*/







}
