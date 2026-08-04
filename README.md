# 🔐 Java Password Generator

A simple Java console application that generates secure passwords based on user-defined criteria. The project is built using Object-Oriented Programming (OOP) concepts and Java's `SecureRandom` class to create strong and customizable passwords.

---

## ✨ Features

- Generate passwords of any desired length
- Include or exclude:
  - Uppercase letters
  - Lowercase letters
  - Numbers
  - Special characters
- Uses `SecureRandom` for stronger randomness
- Automatically shuffles characters for better security
- Checks whether the generated password is strong
- Demonstrates Java OOP concepts such as:
  - Classes and Objects
  - Constructors
  - Encapsulation
  - Inheritance
  - Method decomposition

---

## 📂 Project Structure

```
passwordgenerator/
│
├── Main.java
├── PasswordCriteria.java
├── AdvancedPasswordCriteria.java
├── PasswordGenerator.java
└── CheckPassword.java
```

---

## 📖 Classes Overview

### Main.java
- Takes user input
- Creates password criteria
- Generates password
- Checks password strength

### PasswordCriteria.java
Stores password generation settings:
- Password length
- Uppercase option
- Lowercase option
- Numbers option
- Special characters option

### PasswordGenerator.java
Responsible for:
- Generating random passwords
- Using `SecureRandom`
- Ensuring selected character types are included
- Shuffling the final password

### CheckPassword.java
Validates password strength by checking:
- Uppercase letters
- Lowercase letters
- Numbers
- Special characters

### AdvancedPasswordCriteria.java
Extends `PasswordCriteria` by adding support for optional ambiguous character handling.

---

## 🖥️ Sample Output

```
Enter password length: 12
Include uppercase letters? (true/false): true
Include lowercase letters? (true/false): true
Include numbers? (true/false): true
Include special characters? (true/false): true

Generated Password :: P@8g#M1qaL$2
The password is strong.
```

---

## 💻 Technologies Used

- Java
- Object-Oriented Programming (OOP)
- SecureRandom
- Java Collections & Character Utilities

---

## 🚀 How to Run

1. Clone the repository

```bash
git clone https://github.com/your-username/Java-Password-Generator.git
```

2. Open the project in your preferred Java IDE
   - Eclipse
   - IntelliJ IDEA
   - VS Code

3. Compile and run `Main.java`

---

## 📚 Concepts Demonstrated

- Encapsulation
- Inheritance
- Constructors
- Method Calls
- Random Password Generation
- SecureRandom API
- User Input using Scanner
- Password Validation

---

## 🔒 Password Strength Rules

A password is considered **strong** if it contains:

- ✅ At least one uppercase letter
- ✅ At least one lowercase letter
- ✅ At least one digit
- ✅ At least one special character

---

## 🔮 Future Improvements

- GUI version using Java Swing or JavaFX
- Export generated passwords to a file
- Copy password directly to clipboard
- Exclude ambiguous characters (I, l, 1, O, 0)
- Password entropy calculation
- Password history
- Unit testing with JUnit

---

## 👨‍💻 Author

**HaleemaKhan**

GitHub: https://github.com/your-HaleemaKhan

---

⭐ If you found this project useful, consider giving it a star!
