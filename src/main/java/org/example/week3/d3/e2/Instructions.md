# Movie Ticket Discount Eligibility Checker

## Objective
Learn how to use nested `if else` conditions in Java to determine if a person qualifies for a movie ticket discount based on their age and student status.

## Instructions

In this exercise, you will write a Java program that checks if a person qualifies for a discount on a movie ticket. The program will use two variables with different data types:
- `int age = 16;` (an integer representing the person's age)
- `boolean isStudent = true;` (a boolean indicating if the person is a student)

The program should follow these steps:

1. **Check Age Eligibility for Discount**
    - Use an `if else` statement to check if `age` is **less than 18**.
        - **If** `age` is less than 18, print:  
          `"You qualify for an age-based discount."`
        - **Else**, proceed to the next step.

2. **Nested Student Status Check**
    - If the person is not under 18, use a nested `if` statement to check if `isStudent` is **true**.
        - **If** `isStudent` is true, print:  
          `"You qualify for a student discount."`
        - **Else**, print:  
          `"You do not qualify for a discount."`

## Expected Output
With the given values (`age = 16`, `isStudent = true`), the expected output is:
```
You qualify for an age-based discount.
```

## Tips
- **Different Data Types:**
    - `int` is used for whole numbers (like age).
    - `boolean` is used for true/false values (like student status).
- **Nested Conditions:**  
  Use nested `if else` conditions to check one requirement after another in a clear, step-by-step manner.
- **Keep It Simple:**  
  Follow the steps one by one and test your program to ensure it behaves as expected.