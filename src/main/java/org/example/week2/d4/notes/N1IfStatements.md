# SIMPLE `if` STATEMENTS IN JAVA

## 1) WHAT IS AN `if` STATEMENT?
An `if` statement lets your program **make a decision** based on whether a condition is true or false.
- If the condition is **true**, the code inside the `if` block runs.
- If the condition is **false**, the code inside the `if` block is **skipped**.

(We’re focusing **only** on `if` statements here—no `else` or `else if` yet.)

## 2) WHY DO WE NEED `if` STATEMENTS?
1. **Conditional Logic**: We often need to do something **only if** a particular condition holds true.
2. **Control Flow**: It lets us decide which parts of our code should run under certain circumstances.

For example, if a test score is above 50, we print `"You passed!"`; otherwise, we skip that message.

## 3) HOW DO WE USE `if` STATEMENTS? (EXAMPLES)

### Example #1: Checking a Score
    int score = 75;
    if (score > 50) {
        System.out.println("You passed!");
    }
    System.out.println("Test finished.");

Output:
- "You passed!"
- "Test finished."

(Here, since `score` is 75—which is greater than 50—the message "You passed!" is printed.)

### Example #2: Printing a Message Based on a Condition
    int temperature = 30;
    if (temperature < 40) {
        System.out.println("It's cold outside.");
    }
    System.out.println("Weather check complete.");

Output:
- "It's cold outside."
- "Weather check complete."

(The line inside the `if` runs because 30 is less than 40.)

### Example #3: Storing the Condition, Then Using `if`
    int age = 18;
    boolean isAdult = (age >= 18);
    if (isAdult) {
        System.out.println("You are an adult!");
    }
    System.out.println("Age check complete.");

Output:
- "You are an adult!"
- "Age check complete."

(We store the result of `(age >= 18)` in `isAdult`. If `isAdult` is `true`, the message prints.)

> **Note**: You don’t have to store the condition in a boolean. You could write `if (age >= 18)` directly.

## 4) COMMON MISTAKES

### Mistake #1: Using `=` Instead of `==` for Comparison
    int x = 10;
    if (x = 5) {            // Wrong: this tries to assign 5 to x, not compare
        System.out.println("x is 5");
    }

    if (x == 5) {           // Correct: compares x to 5
        System.out.println("x is 5");
    }

### Mistake #2: Forgetting the Curly Braces
    // Bad Example (could lead to confusion if more lines are added):
    int score = 80;
    if (score > 50)
        System.out.println("Passed!");

    // Good Example:
    int score2 = 80;
    if (score2 > 50) {
        System.out.println("Passed!");
        // More lines can safely be added here
    }

### Mistake #3: Mixing Up `>` and `>=`
    int age2 = 18;
    if (age2 > 18) {
        System.out.println("You're an adult.");
    }
    // This won't print for age2 = 18 because '>' means strictly greater than.

    if (age2 >= 18) {
        System.out.println("You're an adult now!");
    }
    // This prints because 'age2' is 18 or more.

### Mistake #4: Not Realizing the Code Runs Only When Condition is True
    int items = 0;
    if (items > 0) {
        System.out.println("Items in stock");
    }
    System.out.println("Check complete");

    // If items is 0, "Items in stock" won't print.
    // "Check complete" will always print after the if-statement.
