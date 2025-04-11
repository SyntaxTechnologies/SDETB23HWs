# Checking Even or Odd Number

## Objective
Learn how to use simple if-else conditions to check if a number is even or odd, and understand how the modulus operator works in Java.

## What are Even and Odd Numbers?
- **Even Numbers**: Numbers that can be divided by 2 without leaving a remainder (e.g., 2, 4, 6, 8).
- **Odd Numbers**: Numbers that, when divided by 2, leave a remainder of 1 (e.g., 1, 3, 5, 7).

## How the Modulus Operator Helps
- The modulus operator `%` calculates the remainder of a division.
- When you divide a number by 2:
   - If the remainder is 0 (e.g., `10 % 2` equals 0), the number is even.
   - If the remainder is 1 (e.g., `7 % 2` equals 1), the number is odd.

## Instructions

**Checking Even or Odd Number**

In this project, you will write a small program that assigns a number to a variable, checks if it is even or odd using an if-else statement, and then prints the result.

**For you to do:**

1. **Declare a Variable**
   - Declare an integer variable called `number`.
   - Assign the value `10` to `number`.

2. **Check if the Number is Even or Odd**
   - Use a simple if-else condition to check if `number` is even.
   - Use the modulus operator `%` to determine if the number is even or odd.
   - If `number % 2` equals `0`, then print: `The number is even.`
   - Otherwise, print: `The number is odd.`

## Example Output
```
The number is even.
```

## Tips
- Ensure your variable is declared and assigned correctly.
- Remember that even numbers give a remainder of 0 when divided by 2.
- Use the modulus operator `%` to perform the even/odd check in your condition.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, verify that your if-else condition is correctly checking the result of `number % 2`.

By following these steps, you should be able to successfully complete the exercise and understand how to use simple if-else conditions along with the modulus operator to determine if a number is even or odd in Java. Happy coding!