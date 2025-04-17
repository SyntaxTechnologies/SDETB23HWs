# NESTED IF CONDITIONS IN JAVA

## 1) WHAT IS A NESTED IF CONDITION?
A nested if condition is an if statement placed inside another if statement. This structure allows your program to perform a secondary check only when the first condition is true. It helps in making decisions that require multiple layers of verification.

## 2) WHY DO WE NEED NESTED IF CONDITIONS?
Nested if conditions are useful when your decision-making process depends on a previous condition. Instead of combining all conditions into one statement, you break them down into manageable steps. This:
- **Enhances Clarity**: The decision process becomes easier to follow.
- **Improves Organization**: Each level of condition is isolated, making your code more readable.
- **Ensures Correct Execution**: The inner condition is evaluated only if the outer condition is met.

For example, you might first check if a number is positive, and then determine if it is even or odd.

## 3) HOW DO WE USE NESTED IF CONDITIONS? (EXAMPLES)

### Example #1: Number Evaluation
```java
int number = 10;
if (number > 0) {
    // The number is positive; now check if it's even or odd
    if (number % 2 == 0) {
        System.out.println("The number is positive and even.");
    } else {
        System.out.println("The number is positive and odd.");
    }
} else {
    System.out.println("The number is zero or negative.");
}
```
**Output:**
- For `number = 10`, it prints: "The number is positive and even."

### Example #2: Voting Eligibility Check
```java
int age = 20;
if (age >= 18) {
    // Eligible by age; now check if the person is registered to vote
    boolean isRegistered = true;
    if (isRegistered) {
        System.out.println("Eligible to vote.");
    } else {
        System.out.println("Not eligible to vote due to lack of registration.");
    }
} else {
    System.out.println("Not eligible to vote due to age.");
}
```
**Output:**
- For `age = 20` and `isRegistered = true`, it prints: "Eligible to vote."

### Example #3: Grade Evaluation
```java
int score = 85;
if (score >= 60) {
    // Student passed; now check if the score is excellent
    if (score >= 90) {
        System.out.println("Grade: Excellent");
    } else {
        System.out.println("Grade: Good");
    }
} else {
    System.out.println("Grade: Fail");
}
```
**Output:**
- For `score = 85`, it prints: "Grade: Good" because the student passed but did not reach the excellent threshold.

## 4) COMMON MISTAKES

### Mistake #1: Not Using Braces Properly
When braces `{}` are omitted, it can be unclear which `if` statement an `else` belongs to.

**Incorrect Example:**
```java
if (number > 0)
    if (number % 2 == 0)
        System.out.println("Positive and even.");
    else
        System.out.println("Positive and odd.");
```
*Issue*: The `else` may be mistakenly associated with the inner `if` rather than the outer one.

**Corrected Example:**
```java
if (number > 0) {
    if (number % 2 == 0) {
        System.out.println("Positive and even.");
    } else {
        System.out.println("Positive and odd.");
    }
}
```

### Mistake #2: Placing an `else` Block Without a Corresponding `if`
An `else` block must always follow an `if` or `else if` block. Placing it independently causes a syntax error.

**Incorrect Example:**
```java
// This will cause an error because there is no preceding if statement.
else {
    System.out.println("No condition met.");
}
```
**Correction**: Ensure that every `else` is paired with a preceding `if`:
```java
if (number > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Not positive");
}
```

### Mistake #3: Misplacing the `else` Block in Nested If Conditions
When nesting, it is common to accidentally attach the `else` to the wrong `if`.

**Incorrect Example:**
```java
if (score >= 60)
    if (score >= 90) {
         System.out.println("Excellent");
    } else {
         System.out.println("Good");
else {
    System.out.println("Fail");
}
```
*Issue*: The placement of `else` is ambiguous. It’s unclear if it belongs to the inner or outer `if`.

**Corrected Example:**
```java
if (score >= 60) {
    if (score >= 90) {
         System.out.println("Excellent");
    } else {
         System.out.println("Good");
    }
} else {
    System.out.println("Fail");
}
```
*Tip*: Always use braces to clarify the structure of nested if conditions.

> **Note**: In nested if conditions, always ensure that each `if` has a clearly associated `else` (if needed) by using proper indentation and braces. This prevents common mistakes and makes your decision-making process easier to follow.