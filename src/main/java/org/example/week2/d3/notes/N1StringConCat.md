# STRING CONCATENATION IN JAVA

## 1) WHAT IS STRING CONCATENATION?
String concatenation is the process of **joining two or more strings** (pieces of text) together to form a single, longer string. In Java, the most common way to concatenate strings is by using the **`+` operator**.

For example, if you have:

    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    // fullName becomes "John Doe"

---

## 2) WHY DO WE NEED STRING CONCATENATION?
- **Combining Text**: Often we need to build messages or sentences by combining multiple pieces of text.
- **Displaying Calculations**: You can show results of arithmetic operations in a more readable way.  
 

Without concatenation, we would have to print or manage each piece of text separately, making our code less clear and more cumbersome.

---

## 3) HOW DO WE PERFORM STRING CONCATENATION? (EXAMPLES)

### Example #1: Simple Concatenation

    String greeting = "Hello";
    String name = "Alice";
    String message = greeting + " " + name;
    // message becomes "Hello Alice"

### Example #2: Concatenating Text with a Number

    int age = 25;
    String info = "I am " + age + " years old.";
    // info becomes "I am 25 years old."

---

## COMMON MISTAKES

### Mistake #1: Unintended String Concatenation Instead of Arithmetic

    // Bad Example:
    String message = "Sum: " + 10 + 5;
    // message ends up being "Sum: 105"

    // Good Example:
    String message2 = "Sum: " + (10 + 5);
    // message2 becomes "Sum: 15"

### Mistake #2: Forgetting Spaces Between Words

    // Bad Example:
    String greeting = "Hello" + "John";
    // Results in "HelloJohn"

    // Good Example:
    String greetingWithSpace = "Hello " + "John";
    // Results in "Hello John"
