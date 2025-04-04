# INTRODUCTION TO VARIABLES

## 1) WHAT IS A VARIABLE?
A variable is like a **labeled box** in your computer's memory where you can store a piece of data.  
For example, if you have a variable named `age`, it can hold the number representing someone’s age.

Think of it this way:
- You have a box (the variable).
- You put a specific value in it (e.g., `25`).
- You label the box as `age`.

In Java, a variable needs:
- A **type** (which defines what kind of data it can hold, such as a number or text).
- A **name** (so you know how to refer to it in your code).

## 2) WHY DO WE NEED VARIABLES?
We use variables because we often need to work with data that can change or be reused throughout a program.

- If you want to display someone's age, you store it in a variable and use that variable wherever needed.
- If the age changes, you just update the variable's value in one place, instead of typing it everywhere again.

Without variables, you’d have to manually insert the data every time, making your code repetitive and harder to maintain.

## 3) HOW DO VARIABLES WORK? (EXAMPLES)

In Java, you generally **declare** (create) a variable by specifying its type and name, then **assign** a value. For example:

    int age;       // Declares a variable named 'age' to hold an integer
    age = 25;      // Assigns the value 25 to 'age'

You can also do this in **one line**:

    int numberOfStudents = 30; // Declares and assigns 30

Another example is storing text data:

    String greeting = "Hello world"; // Stores the text in 'greeting'

**Key points**:
- Use `int` for integer values (no decimal point).
- Use `String` (note the uppercase 'S') for text.

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
