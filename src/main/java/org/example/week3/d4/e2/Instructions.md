# Personal Budgeting Helper

## Objective
Learn how to use the Scanner class in Java to capture numerical input from the user and use a simple logical && operator to analyze monthly expenses.

## Instructions

In this exercise, you will write a small program that helps a user manage their personal budget by comparing two sets of monthly expenses.

**For you to do:**

1. **Create a Scanner Object**
   - Create a `Scanner` object to read input from the console.

2. **Capture Monthly Expenses**
   - Print "Please enter your monthly rent expense".
   - Capture the user's input for the rent expense and store it in a variable called `rentExpense`.
   - Print "Please enter your monthly food expense".
   - Capture the user's input for the food expense and store it in a variable called `foodExpense`.
   - Print "Please enter your monthly transportation expense".
   - Capture the user's input for the transportation expense and store it in a variable called `transportationExpense`.
   - Print "Please enter your monthly entertainment expense".
   - Capture the user's input for the entertainment expense and store it in a variable called `entertainmentExpense`.

3. **Analyze Expenses Using the && Operator**
   - Use a simple if-else statement with the && operator to compare expenses:
      - **If** `rentExpense` is greater than `foodExpense` **and** `transportationExpense` is greater than `entertainmentExpense`, output:
        ```
        You are prioritizing essentials well.
        ```
      - **Else**, output:
        ```
        You need to rethink your spending priorities.
        ```

## Expected Output

```
Example Output: for rent=1200, food=600, transportation=300, entertainment=200
Please enter your monthly rent expense
1200
Please enter your monthly food expense
600
Please enter your monthly transportation expense
300
Please enter your monthly entertainment expense
200
Output: You are prioritizing essentials well.
```

```
Example Output: for rent=1200, food=800, transportation=300, entertainment=400
Please enter your monthly rent expense
1200
Please enter your monthly food expense
800
Please enter your monthly transportation expense
300
Please enter your monthly entertainment expense
400
Output: You need to rethink your spending priorities.
```

```
Example Output: for rent=1000, food=1200, transportation=200, entertainment=300
Please enter your monthly rent expense
1000
Please enter your monthly food expense
1200
Please enter your monthly transportation expense
200
Please enter your monthly entertainment expense
300
Output: You need to rethink your spending priorities.
```

## Tips
- **Data Types:**  
  Use numerical variables (like `double` or `int`) for expenses.
- **Logical Operators:**  
  Use the && operator to combine conditions. For example:
- **Keep It Simple:**  
  Focus on comparing two pairs of expenses using a single if-else statement.

---


