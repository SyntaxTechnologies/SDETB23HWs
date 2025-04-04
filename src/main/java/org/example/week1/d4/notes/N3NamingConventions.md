# JAVA NAMING CONVENTIONS (BASICS)

## 1) WHAT ARE NAMING CONVENTIONS?
Naming conventions are guidelines for how we name things in our code (like variables).
They help make your code more readable, consistent, and easier to maintain.

## 2) WHY DO WE USE NAMING CONVENTIONS?
- **Readability**: Names become clearer and easier to read.
- **Consistency**: Code looks uniform, so you (and others) can follow it more easily.
- **Maintainability**: Consistent naming makes it simpler to manage and update your code as it grows.

## 3) COMMON NAMING STYLE FOR VARIABLES
The most commonly used style for naming variables in Java is **camelCase**:

- **camelCase**:
  - The **first** word is all lowercase.
  - Each **subsequent** word starts with a capital letter.

Examples:
- `studentAge`
- `numberOfDogs`
- `totalPrice`
- `isRaining`

Use **camelCase** when naming your variables.
It starts with a lowercase letter, making it easy to spot variable names when reading code.

## 4) PASCAL CASE FOR CLASS NAMES
While we haven’t covered classes in detail yet, it’s worth mentioning that **PascalCase** is typically used for **class names** in Java:

- **PascalCase**: Each word starts with a capital letter.

Examples (Class Names):
- `StudentDetails`
- `BankAccount`
- `HelloWorld`

> **Note**: We do **not** use PascalCase for variables; it’s usually reserved for class names in Java.

## 5) COMMON MISTAKES

### Mistake #1: Beginning Variable Names with a Digit
Bad Example:

    int 1stStudent = 10; // Invalid

Good Example:

    int firstStudent = 10; // Valid

### Mistake #2: Using Spaces in Variable Names
Bad Example:

    int student Age = 20; // Invalid

Good Example:

    int studentAge = 20; // Valid

### Mistake #3: Using Disallowed Characters
Variable names may include letters, digits, underscore `_`, or dollar sign `$`.
Special characters like `@`, `#`, or `!` are **not** allowed.

Bad Example:

    int student#Age = 21; // Invalid

Good Example:

    int student_Age = 21; // Valid (though underscores are uncommon)

### Mistake #4: Using Java Keywords as Variable Names
Bad Example:

    int class = 5; // Invalid, "class" is a keyword

Good Example:

    int classNumber = 5; // Valid

### Mistake #5: Starting Variable Names with Uppercase Letters
Bad Example:

    int StudentAge = 20; // Looks like a class name

Good Example:

    int studentAge = 20;

### Mistake #6: Inconsistent Naming (Mixing Styles)
Mixing **camelCase** and **PascalCase** for variables can be confusing.
Stick to **camelCase** for variables and **PascalCase** for class names.
