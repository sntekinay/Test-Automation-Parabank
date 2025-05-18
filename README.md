# 🚀 Test Automation Project - DemoBlaze

Bu proje, [DemoBlaze](https://www.demoblaze.com/) web uygulamasının temel kullanıcı senaryolarını **Selenium**, **TestNG** ve **Allure** raporlama araçları kullanarak otomatize eder.

## 🔧 Teknolojiler ve Araçlar

- 🧪 **TestNG** – Test Framework
- 🌐 **Selenium WebDriver** – UI test otomasyonu
- 📦 **Maven** – Bağımlılık yönetimi
- 📸 **Allure** – Test raporlama aracı
- ⚙️ **Jenkins** – CI/CD entegrasyonu
- ☕ **Java** – Programlama dili

## 📁 Proje Yapısı
Test-Automation-DemoBlaze/
│
├── drivers/ → ChromeDriver dosyası
├── Pages/ → Page Object Model sınıfları (LoginPage, SignInPage)
├── Tests/ → Test sınıfları (LoginTests, SignInTests)
├── Base/ → BaseTest ve BaseLibrary sınıfları
├── testng.xml → TestNG yapılandırması
├── pom.xml → Maven bağımlılıkları
└── README.md → Proje açıklama dosyası

## 🧪 Test Senaryoları

### ✅ Login Testleri (`LoginTests.java`)
- Geçerli kullanıcı ile başarılı giriş
- Geçersiz kullanıcı adı ile giriş denemesi
- Yanlış şifre ile giriş denemesi

### 📝 Register Testleri (`SignInTests.java`)
- Yeni kullanıcı kaydı başarılı
- Daha önce kayıtlı kullanıcı adıyla tekrar kayıt olunamaz

## 🧾 Allure Raporları

Test çalıştırmalarının ardından **Allure** ile otomatik olarak rapor oluşturulmuştur.

### Genel Görünüm (Overview)
![Allure Overview](./screenshots/Ekran%20Alıntısı.PNG)

### Test Detayları (Login & SignUp)
![Test Suites](./screenshots/Ekran%20Alıntısı1.PNG)

![Test Details](./screenshots/Ekran%20Alıntısı2.PNG)

> *Not: Görseller `screenshots/` klasörüne kaydedilip GitHub'a eklenmelidir.*

## ▶️ Nasıl Çalıştırılır?

1. **Projeyi klonlayın**
   ```bash
   git clone https://github.com/sntekinay/Test-Automation-DemoBlaze.git
