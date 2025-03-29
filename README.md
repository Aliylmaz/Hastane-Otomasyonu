

---

```markdown
# 🏥 Hastane Otomasyon Sistemi

Java dili ile geliştirilen bu masaüstü uygulama, temel bir **hastane otomasyon sistemi** sunar. Uygulama, hasta ve yönetici kullanıcıları için iki farklı arayüz içerir ve hastane işleyişine yönelik temel işlevleri yerine getirir:

- Yeni kullanıcıların sisteme kaydolması
- Kayıtlı kullanıcıların giriş yapması
- Randevu alma ve görüntüleme
- Yönetici paneli ile kullanıcı ve randevu kontrolü
- Veritabanı üzerinden bilgi yönetimi

Uygulama, **Swing GUI** bileşenleri ile görsel bir arayüze sahiptir ve **MySQL veritabanı** ile JDBC üzerinden haberleşmektedir.

---

## 🚀 Özellikler

### 👤 Kullanıcı Arayüzü
- Kayıt ekranı üzerinden yeni kullanıcı oluşturma
- Kullanıcı adı ve şifre ile giriş
- Randevu oluşturma arayüzü
- Kullanıcıya özel alınan randevuların listelenmesi

### 🛡️ Yönetici Arayüzü
- Sistemde kayıtlı tüm kullanıcıları listeleme
- Kullanıcıların randevularını görüntüleme
- Veritabanına doğrudan erişim gerektirmeden sistem kontrolü

### 💾 Veritabanı
- Kullanıcı ve randevu bilgilerinin tutulduğu iki temel tablo
- `HospitalDB.java` üzerinden JDBC bağlantısı kurulumu
- Kullanıcı doğrulama ve veri sorgulama işlemleri

---

## 🛠️ Kullanılan Teknolojiler

| Teknoloji | Açıklama |
|----------|----------|
| Java     | Ana programlama dili |
| Swing    | Masaüstü arayüz geliştirme |
| JDBC     | Veritabanı bağlantısı için |
| MySQL    | Arka planda çalışan veritabanı |
| Maven    | Proje bağımlılık yönetimi |

---

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
                        ├── Main.java                  -> Ana çalışma noktası
                        ├── LoginFrm.java              -> Kullanıcı giriş ekranı
                        ├── RegisterFrm.java           -> Kayıt ekranı
                        ├── AdminFrm.java              -> Yönetici paneli
                        ├── Appointment.java           -> Randevu modeli (nesnesi)
                        ├── AppointmentCreation.java   -> Randevu oluşturma ekranı
                        ├── HospitalDB.java            -> Veritabanı bağlantı sınıfı
                        └── User.java                  -> Kullanıcı modeli
```

---

## 🧪 Uygulama Akışı

1. **Kullanıcı Kayıt**
   - Kullanıcı `RegisterFrm` üzerinden kayıt olur.
   - Bilgiler veritabanına kaydedilir.

2. **Giriş**
   - `LoginFrm` ile kullanıcı girişi yapılır.
   - Kullanıcı yetkisine göre yönlendirme (kullanıcı/administrator).

3. **Randevu Alma**
   - Kullanıcı `AppointmentCreation` ekranından doktor seçip tarih ve saat girerek randevu oluşturur.

4. **Yönetici Paneli**
   - `AdminFrm` ile giriş yapan yönetici, sistemdeki tüm kullanıcıları ve randevuları listeleyebilir.

---

## ⚙️ Kurulum Adımları

1. **Projeyi Klonlayın**
```bash
git clone https://github.com/kullaniciadi/HastaneOtomasyonu.git
cd HastaneOtomasyonu
```

2. **Veritabanı Oluşturun**
   - `hospitaldb` adında bir MySQL veritabanı oluşturun.
   - Kullanıcı ve randevu tablolarını manuel olarak ya da gerekli SQL dosyaları ile oluşturun.

3. **Bağlantı Ayarlarını Yapın**
`HospitalDB.java` dosyasındaki bağlantı bilgilerini kendi ortamınıza göre değiştirin:
```java
String url = "jdbc:mysql://localhost:3306/hospitaldb";
String user = "root";
String password = "sifre";
```

4. **Projeyi Maven ile Derleyin**
```bash
mvn install
```

5. **IDE ile Başlatın**
   - `Main.java` dosyasını çalıştırarak uygulamayı başlatabilirsiniz.

---

## 📸 Ekran Görüntüleri

> 📷 Buraya uygulamanın login, kayıt ve randevu arayüzlerinden ekran görüntüleri eklenebilir.

---

## 📌 Katkı Sağlamak

- Fork’layın
- Yeni bir branch oluşturun (`feature/yenilik`)
- Değişikliklerinizi commit'leyin
- Pull Request gönderin

---

## 🪪 Lisans

Bu proje MIT Lisansı ile yayınlanmıştır. Daha fazla bilgi için `LICENSE` dosyasına göz atabilirsiniz.

---
```

