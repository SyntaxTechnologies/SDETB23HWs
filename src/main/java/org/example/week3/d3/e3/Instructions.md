# Scanner Input Number Printer

## Objective
Learn how to use the Scanner class in Java to read a number from the user and print that number to the console—just like asking someone for their favorite number and then telling them what they chose.

## Instructions

In this exercise, you will write a simple Java program that does the following:
- Imports the Scanner class so your program can read user input.
- Creates a Scanner object to "listen" to what the user types.
- Prompts the user with a friendly message asking for a number.
- Reads the number entered by the user.
- Prints out the number with a message confirming what was entered.

For example, if a user enters `42`, your program should display:
```
You entered: 42
```

## Tips
- **Importing the Scanner:**  
  Always start your program with `import java.util.Scanner;` at the top. This tells Java you want to use the Scanner tool.
- **Creating the Scanner Object:**  
  When you write `Scanner input = new Scanner(System.in);`, think of it as setting up a helper named "input" who listens to what the user types on the keyboard.
- **Reading the Number:**  
  Use `input.nextInt();` to capture a number from the user, since it reads whole numbers.
- **Keep It Friendly and Simple:**  
  Imagine you’re at a fun event where someone asks you your lucky number. Your program should ask politely and then repeat back the number you provided.

Follow these steps carefully, and try writing the code yourself by using these guidelines rather than copying everything directly. Happy coding!