# SCANNER CLASS IN JAVA: TAKING DIFFERENT TYPES OF INPUTS

## What is the Scanner Class?
The Scanner class is a built-in tool in Java that helps your program read input from the user or from files. It makes it easy to get different types of information while your program is running.

## Understanding Object Creation with Scanner
When you see this line:
```java
Scanner input = new Scanner(System.in);
```
here’s what it means in simple terms:
- **Scanner**: This is the name of the tool that helps you read input.
- **input**: This is the name you give to your Scanner tool—like naming a gadget that listens to what you type.
- **new Scanner(System.in)**: This creates a new Scanner tool that listens for input from the keyboard (`System.in`).

## Examples of Taking Different Types of Inputs

### 1. Reading an Integer
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter an integer:");
int number = input.nextInt(); // Reads a whole number from the user
System.out.println("You entered: " + number);
```
*Explanation:*
- The program asks the user to enter a whole number.
- `input.nextInt()` waits for the user to type a number and stores it in the variable `number`.

### 2. Reading a Double
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter a decimal number:");
double decimalNumber = input.nextDouble(); // Reads a decimal number
System.out.println("You entered: " + decimalNumber);
```
*Explanation:*
- The program asks the user to enter a number with a decimal point.
- `input.nextDouble()` reads the decimal number and stores it in `decimalNumber`.

### 3. Reading a Boolean
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter true or false:");
boolean flag = input.nextBoolean(); // Reads a true or false value
System.out.println("You entered: " + flag);
```
*Explanation:*
- The program asks the user to type either `true` or `false`.
- `input.nextBoolean()` reads this value and saves it in the variable `flag`.

### 4. Reading a String
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter your full name:");
String fullName = input.nextLine(); // Reads a full line of text
System.out.println("Hello, " + fullName + "!");
```
*Explanation:*
- The program asks for the user’s full name.
- `input.nextLine()` reads everything the user types until they press Enter and stores it in `fullName`.

### 5. Reading a Character
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter a single character:");
String line = input.nextLine(); // Reads a full line of text
char character = line.charAt(0); // Takes the first character of that line
System.out.println("You entered: " + character);
```
*Explanation:*
- The program asks for a single character.
- It first reads the entire line with `nextLine()` and then takes the first character using `charAt(0)`.

## Common Mistakes and How to Fix Them

### Mistake #1: Forgetting to Import the Scanner Class
**Incorrect Example:**
```java
Scanner input = new Scanner(System.in);
```
*Issue:* Without importing, Java doesn't recognize the Scanner class.

**Correction:**
```java
import java.util.Scanner; // This line must be at the top of your file.
Scanner input = new Scanner(System.in);
```

### Mistake #2: Not Closing the Scanner
**Incorrect Example:**
```java
Scanner input = new Scanner(System.in);
// Use the scanner for input...
// Forgetting to close it.
```
*Issue:* Leaving the scanner open can use up system resources.

**Correction:**
```java
Scanner input = new Scanner(System.in);
// Use the scanner for input...
input.close(); // Always close your scanner when done.
```

### Mistake #3: Mixing nextLine() with Other Methods
**Incorrect Example:**
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter your age:");
int age = input.nextInt();  // Reads the integer
System.out.println("Enter your name:");
String name = input.nextLine();  // May capture an empty string due to leftover newline
System.out.println("Your name is: " + name);
```
*Issue:* After using `nextInt()`, a newline character remains in the input.  
**Correction:**
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter your age:");
int age = input.nextInt();
input.nextLine(); // Consume the leftover newline
System.out.println("Enter your name:");
String name = input.nextLine();
System.out.println("Your name is: " + name);
```

### Mistake #4: Using next() Instead of nextLine() for Full Sentences
**Incorrect Example:**
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter your full address:");
String address = input.next(); // This only reads the first word
System.out.println("Your address is: " + address);
```
*Issue:* `next()` reads only the first word of the input.  
**Correction:**
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.println("Enter your full address:");
String address = input.nextLine(); // This reads the entire line
System.out.println("Your address is: " + address);
```

> **Note:** The Scanner class is a simple yet powerful way to capture user input in Java. Practice these examples, and be mindful of common mistakes, to become comfortable with reading different types of input.