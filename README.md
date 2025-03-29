

---

```markdown
# 🏥 Hastane Otomasyon Sistemi

Bu proje, Java dili kullanılarak geliştirilen basit bir **Hastane Otomasyon Sistemi**dir. Kullanıcılar, randevu alabilir, kayıt olabilir, giriş yapabilir; yöneticiler ise randevuları ve kullanıcıları yönetebilir.

## 🚀 Özellikler

- 👤 Kullanıcı Kaydı ve Girişi
- 🗓️ Randevu Oluşturma ve Listeleme
- 🔐 Yönetici Paneli
- 💾 Veritabanı ile Entegrasyon (MySQL veya benzeri JDBC destekli)
- 🖥️ Swing ile Masaüstü Arayüz

## 🛠️ Teknolojiler

- Java 17+
- Swing GUI
- Maven (Proje yapılandırması)
- JDBC ile Veritabanı Erişimi

## 📁 Proje Yapısı

```
HastaneOtomasyonu/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── hastaneotomasyonu/
│                       ├── Main.java               # Giriş noktası
│                       ├── LoginFrm.java           # Giriş ekranı
│                       ├── RegisterFrm.java        # Kayıt ekranı
│                       ├── AdminFrm.java           # Yönetici ekranı
│                       ├── Appointment.java        # Randevu sınıfı
│                       ├── AppointmentCreation.java# Randevu oluşturucu
│                       ├── HospitalDB.java         # Veritabanı bağlantısı
│                       └── User.java               # Kullanıcı sınıfı
│
├── pom.xml              # Maven bağımlılık ve proje tanımı
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

3. IDE (örneğin IntelliJ IDEA veya Eclipse) ile açıp `Main.java` dosyasını çalıştırarak uygulamayı başlatabilirsiniz.

## 🗃️ Veritabanı Ayarları

Veritabanı bağlantısı `HospitalDB.java` içinde tanımlıdır. Kullanılan JDBC URL'si, kullanıcı adı ve şifresi gerektiğinde özelleştirilmelidir.

```java
String url = "jdbc:mysql://localhost:3306/hospitaldb";
String user = "root";
String password = "sifre";
```


## 📌 Katkı Sağlamak

Katkı sağlamak isterseniz lütfen bir "fork" alın, yeni bir dal (branch) oluşturun ve pull request gönderin.

## 🪪 Lisans

Bu proje MIT lisansı ile lisanslanmıştır.

---

**Not:** Geliştirme veya veritabanı bağlantısı ile ilgili sorunlar yaşarsanız lütfen [issue](https://github.com/kullaniciadi/HastaneOtomasyonu/issues) açın.

```
