# USING `else if` STATEMENTS IN JAVA

## 1) WHAT IS AN `else if` STATEMENT?
An `else if` statement lets your program **choose between multiple options** based on different conditions. It is used after an `if` statement to check another condition **only if** the previous `if` (or `else if`) condition was false.

- The program checks the first `if` condition.
- If that condition is **false**, it checks the next `else if` condition.
- The code block for the **first true** condition is executed.
- You can add an optional `else` block at the end for a default action if none of the conditions are true.

## 2) WHY DO WE NEED `else if` STATEMENTS?
Sometimes you have **more than two possibilities**. Instead of writing separate `if` statements—which might all run—you can chain conditions with `else if` so that **only one** block of code is executed. This makes your code:
1. **Clearer**: It’s easier to follow the decision-making process.
2. **Efficient**: Once a true condition is found, the rest are ignored.

For example, you might want to display different messages depending on a test score: "Excellent" for very high scores, "Good" for average scores, and "Needs Improvement" for lower scores.

## 3) HOW DO WE USE `else if` STATEMENTS? (EXAMPLES)

### Example #1: Number Classification
```java
int number = 10;
if (number > 0) {
    System.out.println("The number is positive.");
} else if (number < 0) {
    System.out.println("The number is negative.");
} else {
    System.out.println("The number is zero.");
}
```
**Output:**
- If `number` is positive, it prints: "The number is positive."
- If `number` is negative, it prints: "The number is negative."
- If `number` is zero, it prints: "The number is zero."

### Example #2: Grade Evaluation
```java
int score = 85;
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
} else if (score >= 70) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: F");
}
```
**Output:**
- For a score of 85, the program prints: "Grade: B" because the first condition (`score >= 90`) is false, and the second condition (`score >= 80`) is true.

### Example #3: Temperature Check
```java
int temperature = 45;
if (temperature < 32) {
    System.out.println("It's freezing!");
} else if (temperature < 60) {
    System.out.println("It's a bit chilly.");
} else {
    System.out.println("The weather is nice.");
}
```
**Output:**
- For a temperature of 45, it prints: "It's a bit chilly." The program checks the first condition (freezing) and, since it’s false, moves to the next condition.

## 4) COMMON MISTAKES

### Mistake #1: Using Multiple `if` Statements Instead of `else if`
Using separate `if` statements might cause more than one block to run if conditions overlap.
```java
int score = 75;
if (score >= 90) {
    System.out.println("Grade: A");
}
if (score >= 80) {
    System.out.println("Grade: B");
}
// Both conditions could run if score meets both, which is not what we want.
```
**Better Approach:**
```java
if (score >= 90) {
    System.out.println("Grade: A");
} else if (score >= 80) {
    System.out.println("Grade: B");
}
```
Only one block runs—once a true condition is found, the others are skipped.

### Mistake #2: Incorrect Order of Conditions
The order of conditions matters because they are checked from top to bottom.
```java
int temperature = 30;
if (temperature < 60) {
    System.out.println("Cool");
} else if (temperature < 32) { // This block never runs because temperatures below 32 are also below 60.
    System.out.println("Freezing");
}
```
**Correct Order:**
```java
if (temperature < 32) {
    System.out.println("Freezing");
} else if (temperature < 60) {
    System.out.println("Cool");
} else {
    System.out.println("Warm");
}
```

### Mistake #3: Forgetting to Include an `else` Block (When Needed)
Sometimes you expect one of several conditions to be true. Without an `else` block, if none of the conditions are met, nothing happens.
```java
int number = 0;
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
}
// For number = 0, nothing is printed.
```
**Tip:** Add an `else` block if you want to handle all cases:
```java
if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

> **Note**: When using `else if`, the program checks conditions **in order** from top to bottom. Once it finds a condition that is true, it runs that block and skips checking the remaining conditions.

