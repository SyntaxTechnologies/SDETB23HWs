# Checking if a String Equals "Java"

## Objective
Learn how to use simple if-else conditions to check if a string equals a specific value using the appropriate method for advanced data types.

## Instructions

**Checking if a String Equals "Java"**

In this project, you will write a small program that assigns a string to a variable, checks if it equals "Java", and then prints the result.

### Understanding the `equals` Method in Simple Terms
- The `==` operator works well for comparing simple (primitive) data types like numbers.
- Since a string is not a primitive data type but an advanced (non-primitive) data type, using `==` will not correctly compare the text.
- Instead, we use the `equals` method which is designed to compare the content of advanced data types like strings.
- **How to use it:** Write your string variable, then a dot, then `equals(`, followed by another string enclosed in double quotes, and finally a closing parenthesis. For example:  
  `language.equals("Java")`

**For you to do:**

1. **Declare a Variable**
   - Declare a string variable called `language`.
   - Assign the value `"Java"` to `language`.

2. **Check if the String Equals "Java"**
   - Use a simple if-else condition to check if `language` equals `"Java"` using the `equals` method.
   - If `language` equals `"Java"`, print: `The programming language is Java.`
   - If `language` does not equal `"Java"`, print: `The programming language is not Java.`


## Example Output
```
The programming language is Java.
```

## Tips
- Ensure your variables are declared and assigned exactly as instructed.
- Use the `equals` method to compare strings because it checks the actual content.
- Remember: Use `==` for primitive data types and `equals` for non-primitive data types like strings.
- Follow the syntax exactly: `variableName.equals("value")`.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, ensure that you are using the `equals` method to compare the strings, not the `==` operator.

By following these steps, you should be able to successfully complete the exercise and understand how to use the `equals` method to compare strings in Java. Happy coding!