# SINGLE `=` VS DOUBLE `==` IN JAVA

## 1) THE SINGLE `=` (ASSIGNMENT OPERATOR)
- The single equals sign `=` **assigns** a value to a variable.
- It says: “Take what’s on the right side and store it in the variable on the left side.”
- **Example**:
    - `int x = 10;` means “store the value 10 in x.”

## 2) THE DOUBLE `==` (EQUALITY COMPARISON)
- The double equals sign `==` **compares** two values for **equality**.
- It returns a boolean result: `true` or `false`.
- **Example**:
    - `System.out.println(x == 10);` checks if `x` is equal to 10 and prints `true` or `false`.
    - If `x` is 10, this prints `true`; otherwise, it prints `false`.

## 3) EXAMPLES

### Example #1: Basic Assignment vs. Comparison
- **Assignment**: `int y = 5;`
    - This sets `y` to 5.
- **Comparison**: `System.out.println(y == 5);`
    - This prints `true` if `y` is 5, otherwise `false`.

### Example #2: Changing a Variable, Then Checking
- First: `int age = 25;`
- Update: `age = 30;` // age is now 30
- Check: `System.out.println(age == 30);` // prints `true`

## 4) COMMON MISTAKES

### Mistake #1: Using `=` Instead of `==` for Comparison
- **Bad Example**:
    - `System.out.println(x = 10);`
    - This tries to assign `10` to `x` and then print it, which doesn't work as intended for a comparison.
- **Good Example**:
    - `System.out.println(x == 10);`
    - Correctly checks if `x` is equal to 10.

### Mistake #2: Confusing the Meaning of Each Operator
- **`=`** changes a variable’s value.
- **`==`** checks a variable’s value.

### Mistake #3: Forgetting That `==` Produces a Boolean
- `System.out.println(x == 10);` will print either `true` or `false`.
- You can also store it:
    - `boolean isTen = (x == 10);`

### Mistake #4: Using `==` with Strings
- `String` comparison is not reliably done with `==`, because `==` checks if the two strings are the **same object** in memory.
- **(Just for awareness)**: We typically use `.equals()` to compare the text content of strings, e.g. `"Hello".equals(greeting)`.

