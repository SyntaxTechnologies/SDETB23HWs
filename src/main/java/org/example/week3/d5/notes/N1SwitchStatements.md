# SWITCH STATEMENTS IN JAVA

## 1) WHAT ARE SWITCH STATEMENTS?
A switch statement is a control flow statement that simplifies the process of selecting one of many code blocks to execute. Instead of using multiple if-else conditions, a switch statement tests a single variable against a list of constant values. When a match is found, the code block associated with that case is executed.

## 2) WHY DO WE NEED SWITCH STATEMENTS?
Switch statements are useful because they:
- **Simplify Code:** They make your code cleaner and more readable when you have many possible conditions based on one variable.
- **Improve Efficiency:** For a known set of constant values, switch statements can be more efficient than multiple if-else comparisons.
- **Enhance Maintainability:** Grouping related cases together makes it easier to update and manage the logic.

For example, instead of writing several if-else conditions to determine the day of the week from a number, a switch statement neatly maps each number to its corresponding day.

## 3) HOW DO WE USE SWITCH STATEMENTS? (EXAMPLES)

### Example #1: Using Switch with Integer Values
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    default:
        System.out.println("Weekend or Invalid day");
}
```
**Output:**
- For `day = 3`, it prints: "Wednesday"

### Example #2: Using Switch with Character Values
```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Excellent!");
        break;
    case 'B':
        System.out.println("Well done");
        break;
    case 'C':
        System.out.println("Good");
        break;
    default:
        System.out.println("Grade not recognized");
}
```
**Output:**
- For `grade = 'B'`, it prints: "Well done"

### Example #3: Using Switch with Strings
```java
String fruit = "Apple";
switch (fruit) {
    case "Apple":
        System.out.println("Red fruit");
        break;
    case "Banana":
        System.out.println("Yellow fruit");
        break;
    case "Grapes":
        System.out.println("Purple fruit");
        break;
    default:
        System.out.println("Unknown fruit");
}
```
**Output:**
- For `fruit = "Apple"`, it prints: "Red fruit"

## 4) COMMON MISTAKES

### Mistake #1: Forgetting the `break` Statement
**Incorrect Example:**
```java
int number = 2;
switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    default:
        System.out.println("Default");
}
```
*Issue*: Without `break` statements, once a match is found, the execution falls through to subsequent cases, causing multiple outputs.

**Corrected Example:**
```java
int number = 2;
switch (number) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    default:
        System.out.println("Default");
}
```

### Mistake #2: Omitting the `default` Case
*Issue*: The `default` case handles unexpected values. Not including it may lead to unhandled scenarios if none of the cases match.

**Tip**: Always include a `default` case to manage any unexpected or out-of-range values.

### Mistake #3: Using Non-Constant Expressions in Case Labels
*Issue*: Case labels must be compile-time constants. Using variables or expressions that aren’t constant will cause a compilation error.

**Problematic Example:**
```java
     int a = 2;
     int b = 3;
        switch (a) {
        case 1 + b:  // Although this evaluates to a constant, ensure the expression is a compile-time constant.
        System.out.println("Two");
        break;
        default:
        System.out.println("Default");
        }
```
*Tip*: Always use literal values or compile-time constant expressions in your case labels.

## 5) LIMITATIONS OF SWITCH STATEMENTS

- **Limited Data Types:**  
  Switch statements only work with primitive data types like `int`, `char`, `byte`, `short`, and `String` objects. However, boolean data types (`true`, `false`) and floating point types (`float`, `double`) are not supported directly.

  **Example:**
  ```java
  double value = 3.14;
  // This will cause a compilation error: cannot switch on a double
  switch (value) {
      case 3.14:
          System.out.println("Pi");
          break;
      default:
          System.out.println("Not Pi");
  }
  ```

- **No Range or Interval Matching:**  
  Switch statements do not support range-based conditions. You cannot use them to check if a value falls within a certain range.

  **Example:**
  ```java
  int score = 85;
        switch (score) {  
            case score>=80 && score<=89: // This is not valid syntax in Java
                System.out.println("B grade");
                break;
            default:
                System.out.println("Other grade");
        }
  ```

- **No Relational or Logical Operators Allowed:**  
  In a switch statement, case labels must be compile-time constant values. This means you cannot use relational operators (such as `>`, `<`, `>=`, `<=`) or logical operators (such as `&&`, `||`) in the case labels because they require runtime evaluation.

  **Incorrect Example:**
  ```java
  int score = 85;
  switch (score) {
      case score=>100:  // Compilation error: relational operators are not allowed in case labels
          System.out.println("High score");
          break;
      default:
          System.out.println("Score too low");
  }
  ```

  **Correct Approach:**
  When you need to perform comparisons using relational or logical operators, use if-else statements instead:
  ```java
  int score = 85;
  if (score=>100) {
      System.out.println("High score");
  } else {
      System.out.println("Score too low");
  }
  ```

&gt; **Note**: Switch statements in Java offer a clear and organized way to handle multiple fixed values, but they do not support relational or logical operators in case labels. For conditions that require comparisons, if-else statements are the appropriate choice.