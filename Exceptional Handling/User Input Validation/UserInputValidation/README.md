# User Input Validation in Java

## 📌 Overview
This project demonstrates **user input validation** for an online registration form in Java.  
It uses **custom exceptions** to handle invalid inputs, such as:
- Missing required fields
- Invalid email format
- Age restrictions (via Date of Birth validation)

It also demonstrates **OOP concepts** like:
- Encapsulation
- Custom Exception Handling
- Data Validation

---

## 🚀 Features
- **Name validation** – Must not be empty.
- **Email validation** – Validates format using **regex**.
- **Date of Birth validation** – Must be at least 18 years old.
- **Custom exceptions** – `MissingFieldException`, `InvalidEmailException`, `AgeRestrictionException`.
- **Throw and catch** exceptions to handle invalid inputs gracefully.
- **Educational example** of Java's `java.time` API for date parsing.