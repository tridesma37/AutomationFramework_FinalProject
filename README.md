# Automation Framework

Automation Test Framework menggunakan **Java**, **Selenium WebDriver**, **Rest Assured**, **Cucumber**, **Gradle**, dan **GitHub Actions**.

---

# Teknologi
- Java 21
- Gradle
- Selenium WebDriver
- Rest Assured
- Cucumber
- JUnit 4
- WebDriverManager
- GitHub Actions

---

# Project Structure
```text
src
│
├── test
│   ├── java
│   │
│   ├── api
│   │
│   ├── web
│   │
│   └── hooks
│
└── resources
    └── features
```

---

# Web UI Test
Website:
https://www.saucedemo.com/

Scenario:
- Login Success
- Login Failed

---

# API Test
API:
https://dummyapi.io/

Scenario:
- Get User
- Create User
- Update User
- Delete User
- Get Tag

---

# Execute Web Test

```bash
gradlew runWeb
```

---

# Execute API Test

```bash
gradlew runApi
```

---

# Report

Cucumber menghasilkan report:

- HTML
- JSON

Lokasi:

```text
reports/
```

---

# GitHub Actions

Workflow dijalankan dengan:

- Manual Trigger
- Pull Request