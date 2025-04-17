# Roller Coaster Ride Eligibility Checker

## Objective
Learn how to use nested `if else` conditions in Java to check if a person is eligible to ride a roller coaster based on their age and height.

## Instructions

In this exercise, you will write a Java program that checks if a person can ride a roller coaster. The program will use two variables: `age` and `height`. **For this exercise, use the following values:**
- `int age = 14;`
- `int height = 125;`

The program should follow these steps:

1. **Check Age Eligibility**
    - Use an `if else` statement to check if `age` is **greater than or equal to 12**.
        - **If** `age` is less than 12, print:  
          `"You are not old enough to ride the roller coaster."`
        - if it is greater than or equal to 12, proceed to the next step.

2. **Nested Height Check**
    - If the person is old enough (i.e., `age` is at least 12), use a nested `if` statement to check if `height` is **greater than or equal to 120**.
        - **If** `height` is greater than or equal to 120, print:  
          `"You are eligible to ride the roller coaster."`
        - **Else**, print:  
          `"You are old enough, but not tall enough to ride the roller coaster."`

## Expected Output
With the given values (`age = 14` and `height = 125`), the expected output is:
```
You are eligible to ride the roller coaster.
```
