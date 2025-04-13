# INTRODUCTION TO VARIABLES

## 1) WHAT IS A VARIABLE?
A variable is like a **labeled box** in your computer's memory where you can store a piece of data.  
For example, if you have a variable named `age`, it can hold the number representing someone’s age. Watch below video to understand the concept of variables in Java.

[What Are Variables](https://www.youtube.com/watch?v=ghCbURMWBD8&t=1s)

Think of it this way:
- You have a box (the variable).
- You put a specific value in it (e.g., `25`).
- You label the box as `age`.

In Java, a variable needs:
- A **type** (which defines what kind of data it can hold, such as a number or text).
- A **name** (so you know how to refer to it in your code).

## 2) WHY DO WE NEED VARIABLES?

**Variables** are like labeled containers that store pieces of information in your program. Here’s why they’re helpful:

1. **Organization**: Instead of juggling numbers or text strings scattered across your code, variables give you a clear, named spot to store a value. This makes your code easier to read and maintain.

2. **Easy Updates**: When you want to change a piece of information—like a username, a score, or a price—you only have to change it in one place (the variable’s value). Everywhere else in your program that uses that variable instantly gets the updated value.

3. **Tracking Data**: Computers process tons of data. Variables help keep track of what each piece of data represents, so you can easily reference or modify it later.

4. **Better Control**: Since computers rely on managing large amounts of data, having labels (variables) to identify each piece of data helps you control how information is processed and displayed.

In short, **variables** keep information organized and accessible, making it simpler to write, debug, and update your code as it grows.

## 3) HOW DO VARIABLES WORK? (EXAMPLES)

In Java, you generally **declare** (create) a variable by specifying its type and name, then **assign** a value. Here are several examples covering different types and usage:

### Basic Variable Examples

- **Integer:**
  ```java
  int age = 25;  // Declares a variable named 'age' to hold an integer
  System.out.println(age);
  ```

- **Double:**
  ```java
  double price = 9.99;  // Declares a variable for a number with decimals
  System.out.println(price);
  ```

- **Long:**
  ```java
  long distance = 123456789L;  // Declares a variable for a very large number
  System.out.println(distance);
  ```

- **Float:**
  ```java
  float weight = 68.5f;  // Declares a variable for a decimal number with less precision
  System.out.println(weight);
  ```

- **Char:**
  ```java
  char grade = 'A';  // Declares a variable to hold a single character
  System.out.println(grade);
  ```

- **Byte:**
  ```java
  byte smallNumber = 100;  // Declares a variable for a small integer value
  System.out.println(smallNumber);
  ```

- **Short:**
  ```java
  short temperature = -5;  // Declares a variable suitable for small integers like temperatures
  System.out.println(temperature);
  ```

- **Boolean:**
  ```java
  boolean isPassed = true;  // Declares a variable that can only be true or false
  System.out.println(isPassed);
  ```

- **String:**
  ```java
  String greeting = "Hello world";  // Declares a variable to hold text
  System.out.println(greeting);
  ```

### Multiple Variable Declarations

- **Declaring multiple variables on one line (without initialization):**
  ```java
  int a, b, c;  // Declares variables a, b, and c as integers
  a = 5;
  b = 10;
  c = 15;
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  ```

- **Declaring and initializing multiple variables on one line:**
  ```java
  int x = 10, y = 20, z = 30;  // Declares x, y, and z as integers with their values
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
  ```

- **Declaring a variable and initializing it later:**
  ```java
  double rating;  // Declare variable without a value
  rating = 4.5;   // Later, assign the value 4.5 to 'rating'
  System.out.println(rating);
  ```

**Key points:**
- Use `int` for whole numbers.
- Use `double` or `float` for numbers with decimals.
- Use `long` for very large integers.
- Use `char` to store a single character.
- Use `boolean` for true/false values.
- Use `String` for text.

## REMEMBER
1. Variables are **containers** for values.
2. You give each variable a **type** and a **name**.
3. You can **change** the data stored in a variable anytime.
4. Variables help you **reuse** and **modify** data easily.

## COMMON MISTAKES

### Mistake #1: Not Declaring the Variable Type
    // Bad Example:
    age = 25; // This won't compile because 'age' is not declared.

    // Good Example:
    int age = 25; // Properly declared and assigned

### Mistake #2: Trying to Assign the Wrong Type of Data
    // Bad Example:
    int age = "Twenty"; // Invalid, age is an int, not a String.

    // Good Example:
    int age = 20; // Matches the variable type

### Mistake #3: Forgetting to Initialize Variables Before Use
    // Bad Example:
    int numberOfStudents;
    System.out.println(numberOfStudents); // Error, variable not initialized

    // Good Example:
    int numberOfStudents = 30;
    System.out.println(numberOfStudents); // Works fine

### Mistake #4: Mixing Up Uppercase/Lowercase in Type Names
    // Bad Example:
    String greeting = "Hello"; // Correct
    string anotherGreeting = "Hi"; // Error, 'string' is not a valid type in Java

    // Good Example:
    String anotherGreeting = "Hi"; // 'String' has an uppercase 'S'