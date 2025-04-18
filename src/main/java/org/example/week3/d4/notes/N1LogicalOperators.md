# LOGICAL OPERATORS IN JAVA

## 1) WHAT ARE LOGICAL OPERATORS?
Logical operators allow you to combine and modify boolean values in your conditions. They enable your program to check multiple criteria at once. The main logical operators are:
- **&& (AND):** Returns true if all conditions are true.
- **|| (OR):** Returns true if at least one condition is true.
- **! (NOT):** Reverses the value of a condition.

## 2) WHY DO WE NEED LOGICAL OPERATORS?
Logical operators are essential because they help us:
- **Combine Conditions:** They allow you to evaluate more than one condition at a time.
- **Control Program Flow:** They make it possible to make decisions based on multiple factors.
- **Improve Clarity:** Breaking complex conditions into simpler parts makes your code easier to understand.

For example, you might need to check if a user is an adult **and** has a valid ID at the same level before granting access.

## 3) HOW DO WE USE LOGICAL OPERATORS? (EXAMPLES)

### Example #1: Using AND (&&)
```java
int age = 20;
boolean hasID = true;
if (age >= 18 && hasID) {
    System.out.println("Access granted.");
} else {
    System.out.println("Access denied.");
}
```
**Output:**
- For `age = 20` and `hasID = true`, it prints: "Access granted."

### Example #2: Using OR (||)
```java
int temperature = 85;
if (temperature < 32 || temperature > 100) {
    System.out.println("Extreme temperature alert!");
} else {
    System.out.println("Temperature is moderate.");
}
```
**Output:**
- For `temperature = 85`, it prints: "Temperature is moderate."

### Example #3: Using NOT (!)
```java
boolean isRaining = false;
if (!isRaining) {
    System.out.println("It's a good day for a picnic!");
} else {
    System.out.println("Better stay indoors.");
}
```
**Output:**
- For `isRaining = false`, it prints: "It's a good day for a picnic!"

## 4) COMMON MISTAKES

### Mistake #1: Using Bitwise Operators Instead of Logical Operators
**Incorrect Example:**
```java
if (age >= 18 & hasID) {
    System.out.println("Access granted.");
}
```
*Issue*: A single '&' is a bitwise operator, not a logical operator.

**Corrected Example:**
```java
if (age >= 18 && hasID) {
    System.out.println("Access granted.");
}
```

### Mistake #2: Misunderstanding Operator Precedence
**Incorrect Example:**
```java
if (age >= 18 || hasPermission && isAdmin) {
    System.out.println("Access granted.");
}
```
*Issue*: Without parentheses, it's unclear how the conditions are grouped.

**Corrected Example:**
```java
if ((age >= 18 || hasPermission) && isAdmin) {
    System.out.println("Access granted.");
}
```
*Tip*: Use parentheses to clearly indicate the intended grouping.

### Mistake #3: Overcomplicating Conditions
**Incorrect Example:**
```java
if (!isRaining || isSunny && temperature > 70) {
    System.out.println("Let's go outside!");
}
```
*Issue*: The condition may be hard to read without proper grouping.

**Corrected Example:**
```java
if (!isRaining || (isSunny && temperature > 70)) {
    System.out.println("Let's go outside!");
}
```
*Tip*: Simplify and group conditions to improve readability.

> **Note**: Logical operators help build clear and concise conditions. Practice these examples and always use parentheses when needed to ensure your expressions are evaluated as you intend.