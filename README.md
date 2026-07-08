# Automation Framework Final Project QA Engineering

Automation Test Framework menggunakan **Java, Selenium WebDriver, Rest Assured, Cucumber, Gradle, JUnit,** dan **GitHub Actions** untuk melakukan pengujian Web UI dan API dalam satu repository.

---

## Technologies
- Java 21
- Gradle
- Selenium WebDriver
- WebDriverManager
- Rest Assured
- Cucumber
- JUnit 4
- GitHub Actions
---
## Framework Features
- Page Object Model (POM)
- Web UI Automation using Selenium
- API Automation using Rest Assured
- Cucumber (Gherkin)
- HTML & JSON Report
- GitHub Actions CI
---

## Project Structure
<img width="357" height="636" alt="final struktur 1" src="https://github.com/user-attachments/assets/5ecf73da-fae7-412f-9860-0f62f274af42" />
<img width="350" height="521" alt="final struktur 2" src="https://github.com/user-attachments/assets/f5b53aa1-9375-41a1-a663-bf546fdc11bd" />

---

## Web UI Test
**Target Website:** https://www.saucedemo.com/
### Scenario:
- Login Success ✅
- Login Failed ✅

---

## API Test
**Target API:** https://dummyapi.io/
### Scenario:
- Get User ✅
- Create User ✅
- Update User ✅
- Delete User ✅
- Get Tag ✅

---

## Run Web Test
```bash
.\gradlew runWeb
```
---

## Run API Test
```bash
.\gradlew runApi
```
---
## Run All Test

```bash
.\gradlew test
```
---

**Framework menghasilkan report dalam format:**

- HTML Report
- JSON Report

**Report disimpan pada folder:**
<img width="186" height="120" alt="report final" src="https://github.com/user-attachments/assets/4f296a4f-fd6e-4c50-94c3-0962ef81dd1e" />

---

## GitHub Actions
Workflow dijalankan dengan:
- Manual Trigger
- Pull Request
