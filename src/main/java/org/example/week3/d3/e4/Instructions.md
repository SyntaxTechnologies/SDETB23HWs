# Coffee Drink Recommendation Checker

## Objective
Learn how to use the Scanner class and nested if-else conditions in Java to recommend a coffee drink based on your coffee budget and taste preference.

## Instructions

In this exercise, you will write a simple program that asks the user for:
- Their coffee budget (as a double), for example, 5.00
- Their taste preference (as a String), which could be "strong" or any other input

The program should follow these steps:

1. **Create a Scanner Object**
    - Set up a Scanner to read input from the console.

2. **Capture Input Information**
    - Ask the user: "Please enter your coffee budget:" and store the answer in a variable called `budget`.
    - Ask the user: "Do you prefer your coffee strong?" and store the answer in a variable called `preference`.

3. **Recommend a Coffee Drink**
    - First, use an `if-else` statement to check if `budget` is greater than or equal to 5.00.
        - **If** `budget` is 5.00 or more:
            - Use a nested `if-else` statement to check if `preference` equals "strong".
                - **If** `preference` is "strong", print:  
                  `"You should try an Espresso!"`
                - **Else**, print:  
                  `"You should try a Latte!"`
        - **Else** (if the `budget` is less than 5.00):
            - Print:  
              `"You might enjoy a simple cup of Instant Coffee!"`

## Expected Output

For example:

```
Example Output: for a budget of 6.0 and preference "strong"
Please enter your coffee budget:
6.0
Do you prefer your coffee strong?
strong
You should try an Espresso!
```

```
Example Output: for a budget of 6.0 and preference other than "strong"
Please enter your coffee budget:
6.0
Do you prefer your coffee strong?
no
You should try a Latte!
```

```
Example Output: for a budget of 4.0 (any preference)
Please enter your coffee budget:
4.0
Do you prefer your coffee strong?
(any input)
You might enjoy a simple cup of Instant Coffee!
```

## Tips
- **Budget Input:**  
  Use a `double` variable for the budget since it represents money.
- **Taste Preference:**  
  Use a `String` variable to capture whether the user likes their coffee strong.
- **Nested Conditions:**  
  First, check if the budget is sufficient. Then, if it is, check if the user prefers strong coffee. If not, recommend a Latte.
- **Keep It Simple:**  
  Follow the steps one by one and test your program to ensure it works as expected.

---