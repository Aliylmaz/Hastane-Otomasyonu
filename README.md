

---

```markdown
# 🏥 Hastane Otomasyon Sistemi

Bu proje, Java dili kullanılarak geliştirilen basit bir **Hastane Otomasyon Sistemi**dir. Kullanıcılar, randevu alabilir, kayıt olabilir, giriş yapabilir; yöneticiler ise randevuları ve kullanıcıları yönetebilir.

## 🚀 Özellikler

- 👤 Kullanıcı Kaydı ve Girişi
- 🗓️ Randevu Oluşturma ve Listeleme
- 🔐 Yönetici Paneli
- 💾 Veritabanı ile Entegrasyon (MySQL)
- 🖥️ Swing ile Masaüstü Arayüz

## 🛠️ Kullanılan Teknolojiler

- Java 17+
- Swing GUI
- Maven
- JDBC (MySQL)

## 📁 Proje Yapısı

```plaintext
HastaneOtomasyonu/
├── pom.xml                                -> Maven yapılandırma dosyası
└── src/
    └── main/
        └── java/
            └── com/
                └── mycompany/
                    └── hastaneotomasyonu/
                        ├── Main.java                  -> Giriş noktası
                        ├── LoginFrm.java              -> Giriş ekranı
                        ├── RegisterFrm.java           -> Kayıt ekranı
                        ├── AdminFrm.java              -> Yönetici ekranı
                        ├── Appointment.java           -> Randevu sınıfı
                        ├── AppointmentCreation.java   -> Randevu oluşturucu
                        ├── HospitalDB.java            -> Veritabanı bağlantısı
                        └── User.java                  -> Kullanıcı sınıfı
```

## ⚙️ Kurulum

1. Bu repoyu klonlayın:
```bash
git clone https://github.com/kullaniciadi/HastaneOtomasyonu.git
cd HastaneOtomasyonu
```

2. Maven ile bağımlılıkları yükleyin:
```bash
mvn install
```

3. IDE (IntelliJ IDEA, Eclipse vb.) ile açın ve `Main.java` dosyasını çalıştırın.

## 🗃️ Veritabanı Bilgisi

Veritabanı bağlantısı `HospitalDB.java` dosyasında aşağıdaki şekilde tanımlıdır:

```java
String url = "jdbc:mysql://localhost:3306/hospitaldb";
String user = "root";
String password = "sifre";
```

> Veritabanınızı bu bilgilere göre oluşturduğunuzdan emin olun.


## 📌 Katkı Sağlamak

Katkı sağlamak isterseniz bir "fork" alın, yeni bir dal (branch) oluşturun ve Pull Request gönderin.

## 🪪 Lisans

MIT Lisansı ile lisanslanmıştır.
```
