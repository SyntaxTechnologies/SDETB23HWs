# Loan Eligibility Checker

## Objective
Learn how to use the logical && operator in Java to determine loan eligibility based on two simple conditions: whether the person needs a loan and if their credit score is at least 700.

## Instructions

Assume you have two variables:
- `boolean needsLoan` (true if the person needs a loan, false otherwise)
- `int creditScore` (the person's credit score)

Your program should do the following:

1. **Set Up the Variables**
   - For example:
     ```java
     boolean needsLoan = true;
     int creditScore = 750;
     ```

2. **Determine Loan Eligibility**
   - Use a single if-else statement with the && operator to check:
      - **If** `needsLoan` is true **and** `creditScore` is 700 or higher, print:
        ```
        The eligibility is Eligible
        ```
      - **Else**, print:
        ```
        The eligibility is Not eligible
        ```

## Expected Output

For example:

- If `needsLoan` is true and `creditScore` is 750:
  ```
  The eligibility is Eligible
  ```

- If `needsLoan` is false or `creditScore` is less than 700:
  ```
  The eligibility is Not eligible
  ```

## Tips
- **Logical && Operator:**  
  The && operator combines two conditions and returns true only if both conditions are true.
- **Keep It Simple:**  
  Use one if-else statement to make your decision.
- **Experiment:**  
  Try different values for `needsLoan` and `creditScore` to see how the result changes.

Happy coding!