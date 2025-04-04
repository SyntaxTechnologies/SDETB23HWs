# ARITHMETIC OPERATORS IN JAVA

## 1) WHAT ARE ARITHMETIC OPERATORS?
Arithmetic operators are symbols in Java that allow us to perform basic mathematical operations on numerical values. These operations are:

1. `+` (Addition)
2. `-` (Subtraction)
3. `*` (Multiplication)
4. `/` (Division)
5. `%` (Modulo or Remainder)

---

## 2) WHY DO WE NEED ARITHMETIC OPERATORS?
We use arithmetic operators to do math in our programs. This is important because:
- We often need to calculate totals (for example, total expenses or total items).
- We subtract values to find differences (for example, remaining budget).
- We multiply values (for example, calculating bills or amounts).
- We divide values (for example, splitting a quantity equally or finding averages).
- We find remainders using the modulo operator (for example, leftover items after dividing).

---

## 3) HOW DO WE USE ARITHMETIC OPERATORS?

Below are examples that demonstrate each operator in simple, real-life scenarios. We’ll use `int` for whole numbers and `double` when decimals are needed.

### A) ADDITION (+)

- **Real-Life Scenario #1: Adding two grocery items’ prices**
    ```java
    int applePrice = 50;   // Price in cents (example)
    int breadPrice = 40;
    int totalCost = applePrice + breadPrice;
    // totalCost = 90
    ```

- **Real-Life Scenario #2: Summing up the goals of two football players**
    ```java
    int goalsPlayerOne = 15;
    int goalsPlayerTwo = 10;
    int totalGoals = goalsPlayerOne + goalsPlayerTwo;
    // totalGoals = 25
    ```

### B) SUBTRACTION (-)

- **Real-Life Scenario #1: Calculating remaining seats in a theater**
    ```java
    int totalSeats = 100;
    int seatsTaken = 30;
    int seatsLeft = totalSeats - seatsTaken;
    // seatsLeft = 70
    ```

- **Real-Life Scenario #2: Finding how much money is left after a purchase**
    ```java
    int currentMoney = 500;
    int costOfItem = 120;
    int moneyLeft = currentMoney - costOfItem;
    // moneyLeft = 380
    ```

### C) MULTIPLICATION (*)

- **Real-Life Scenario #1: Calculating the total bill for multiple items**
    ```java
    int pricePerItem = 20;
    int quantity = 4;
    int totalBill = pricePerItem * quantity;
    // totalBill = 80
    ```

- **Real-Life Scenario #2: Finding the area of a rectangle**
    ```java
    int length = 5;  // maybe in meters
    int width = 3;
    int area = length * width;
    // area = 15
    ```

### D) DIVISION (/)

- **Real-Life Scenario #1: Splitting a total cost among friends**
    ```java
    double totalCost = 200.0;
    double numberOfFriends = 4.0;
    double costPerFriend = totalCost / numberOfFriends;
    // costPerFriend = 50.0
    ```

- **Real-Life Scenario #2: Finding average marks**
    ```java
    double totalPoints = 450.0;
    double numberOfTests = 5.0;
    double averageMarks = totalPoints / numberOfTests;
    // averageMarks = 90.0
    ```

### E) MODULO (%)

- **Real-Life Scenario #1: Checking leftover candies after distributing them equally**
    ```java
    int totalCandies = 23;
    int children = 5;
    int leftoverCandies = totalCandies % children;
    // leftoverCandies = 3 (23 / 5 leaves remainder 3)
    ```

- **Real-Life Scenario #2: Determining if a number is even or odd**
    ```java
    int number = 10;
    int remainder = number % 2;
    // remainder = 0 means the number is even
    // remainder != 0 means the number is odd
    // Here, remainder = 0, so 10 is even.
    ```

---

## 4) COMMON MISTAKES

1. **Integer Division vs. Double Division**
  - Using two `int` variables for division but expecting a decimal result.  
    For example:
    ```java
    int x = 5, y = 2;
    double result = x / y; // This is 2, not 2.5
    ```
    To fix this, make at least one operand a `double`:
    ```java
    double resultCorrect = 5.0 / 2; // resultCorrect = 2.5
    ```

2. **Forgetting Operator Precedence**
  - For instance, `3 + 2 * 4` is `3 + 8 = 11`, not `(3 + 2) * 4 = 20`.
  - Java follows standard precedence rules (multiplication and division are done before addition and subtraction unless parentheses change the order).

3. **Mixing Up Modulo (%)**
  - Some beginners confuse `%` with division or try to use it to get a fraction.
  - Remember `%` gives the remainder after division, not the quotient.

4. **Data Type Mismatch**
  - Trying to store a decimal in an `int`.
  - Or expecting a decimal but using an `int` operation by accident.

5. **Using Negative Values Incorrectly**
  - Subtracting a negative number can be confusing (e.g., `a - (-b)` is actually `a + b`).
  - Always pay attention to signs when doing subtraction.
