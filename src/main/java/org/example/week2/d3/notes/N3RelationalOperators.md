# RELATIONAL OPERATORS IN JAVA

## 1) WHAT ARE RELATIONAL OPERATORS?
Relational operators **compare two values** (numbers, characters, etc.) and **return a boolean result** (`true` or `false`). In Java, the common relational operators are:
- `<`  (Less Than)
- `>`  (Greater Than)
- `<=` (Less Than or Equal To)
- `>=` (Greater Than or Equal To)
- `==` (Equal To)
- `!=` (Not Equal To)

## 2) WHY DO WE NEED RELATIONAL OPERATORS?
1. **Comparison**: We often need to check if one value is bigger, smaller, or equal to another.
2. **Decisions**: Even though we haven’t discussed `if` statements, these operators allow us to see if a condition is `true` or `false`.
3. **Validation**: They help ensure data falls within acceptable ranges or confirm that two pieces of data match.

## 3) HOW DO WE USE RELATIONAL OPERATORS? (EXAMPLES)

### Example #1: Checking if One Number is Less Than Another
    int x = 5;
    int y = 10;
    System.out.println(x < y);
    // Prints: true (because 5 is less than 10)

### Example #2: Greater Than or Equal To
    int a = 7;
    int b = 7;
    System.out.println(a >= b);
    // Prints: true (7 is equal to 7, so >= returns true)

### Example #3: Equality (==) vs. Not Equal (!=)
    int num1 = 3;
    int num2 = 4;
    System.out.println(num1 == num2);    // Prints: false (3 is not equal to 4)
    System.out.println(num1 != num2);    // Prints: true  (3 is indeed not equal to 4)

### Example #4: Combining with Arithmetic
    int apples = 5;
    int oranges = 2 + 3; // equals 5
    System.out.println(apples == oranges);
    // Prints: true (both are 5)

### (Optional) Storing the Result
    You can also **store** the result of the comparison in a `boolean` variable if you want to use it later:
    int score = 85;
    boolean passed = score >= 50;
    System.out.println(passed);
    // Prints: true (since 85 is greater than or equal to 50)

## COMMON MISTAKES

### Mistake #1: Using a Single '=' Instead of '=='
    // Bad Example:
    boolean check = (x = 10);
    // This is actually an assignment, not a comparison.
    // It tries to assign 10 to x, which won't work in this context.

    // Good Example:
    boolean checkCorrect = (x == 10);
    // This correctly compares if x is equal to 10.

### Mistake #2: Confusing '>' or '<' with '>=' or '<='
    int score = 70;
    System.out.println(score > 70);
    // Prints: false (70 is not greater than 70)

    System.out.println(score >= 70);
    // Prints: true  (70 is equal to 70)

### Mistake #3: Using '==' to Compare Strings
- When comparing **text** (Strings), `==` checks if they are the **same object** in memory, not if the text content is the same.
- For example:
  System.out.println("Hello" == "Hello");
  might print `true` in a simple scenario, but usually we use `.equals()` to compare actual text content.

### Mistake #4: Not Realizing the Result is a Boolean
    // The result of a comparison is true or false,
    // so you can print it directly, or store it in a boolean variable.

    int age = 18;
    System.out.println(age >= 18);
    // Prints: true (if age is 18 or more)
