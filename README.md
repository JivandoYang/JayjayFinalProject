# Final Project Automation Testing
Repository ini dibuat untuk Final Project di Jayjay.  
Project ini mencakup automation API testing pada website https://dummyapi.io/docs/ dan automation web testing menggunakan Selenium pada website https://www.demoblaze.com/

# Tools & Library
- Java
- Gradle
- JUnit = Framework untuk assertion dan validasi testing
- Cucumber = Framework untuk menjalankan automation testing berbasis Gherkin
## Web Automation
- WebDriverManager = Mengelola browser driver Chrome secara otomatis
- Selenium WebDriver = Framework untuk automation testing UI web
## API Automation
- Rest Assured = Framework untuk automation API testing
- JSON (org.json) = Library untuk membuat dan memproses data JSON pada API testing

# Cara Menjalankan Testing
## Api testing menggunakan command
./gradlew apiTest, bisa digunakan tags untuk menjalankan feature spesifik seperti ./gradlew apiTest -Ptags="@delete-user"
## Web testing menggunakan command
./gradlew webTest, bisa digunakan tags untuk menjalankan feature spesifik seperti ./gradlew webTest -Ptags="@login"

## Warning
Untuk demoblaze website ada bug / test scenario yang pasti gagal berupa :
- Dapat melakukan pembayaran dengan keranjang kosong
- Dapat mengirim pesan kontak tanpa input informasi apapun
