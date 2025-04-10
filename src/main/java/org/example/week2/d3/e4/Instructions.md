# Relational Operators Exercise
## Objective
Learn how to use relational operators in Java with simple, real-life examples.

## Instructions
1. **Create Variables**
   - Declare and initialize the following simple variables:
      - `age` with the value 18.
      - `temperature` with the value 30.
      - `score` with the value 75.
   - Example:
     ```java
     int age = 18;
     int temperature = 30;
     int score = 75;
     ```

2. **Use Relational Operators with Direct Comparisons**
   - Directly compare the variables with literal values:
      - Check if `age` is at least 18:
        ```java
        System.out.println(age >= 18); // Expected output: true
        ```
      - Check if `temperature` is below 35:
        ```java
        System.out.println(temperature < 35); // Expected output: true
        ```
      - Check if `score` is exactly 75:
        ```java
        System.out.println(score == 75); // Expected output: true
        ```
      - Check if `score` is not 100:
        ```java
        System.out.println(score != 100); // Expected output: true
        ```
      - Check if `age` is less than 20:
        ```java
        System.out.println(age < 20); // Expected output: true
        ```

3. **Run Your Program**
   - Run your program to see the boolean outputs (`true` or `false`) for each comparison.

## Expected Output
```
true
true
true
true
true
```

## Tips
- Relational operators compare values and return a boolean (`true` or `false`).
- Use these operators directly with variables and literal values for clarity.
- Experiment by changing the variable values to see how the outputs change.

## Additional Information
- **Relational Operators**: They allow you to compare two values. For example, `>=` checks if the left value is greater than or equal to the right value.
- **Boolean Results**: Each comparison returns `true` if the condition is met, otherwise it returns `false`.

## Troubleshooting
- Ensure that variables are declared with the correct data types (e.g., `int` for numbers).
- Verify that relational operators are used correctly and that the syntax is proper.
- If the program doesn't compile, check for common syntax errors like missing semicolons or parentheses.

By following these steps, you should be able to complete the exercise and understand how relational operators work in Java. Happy coding!