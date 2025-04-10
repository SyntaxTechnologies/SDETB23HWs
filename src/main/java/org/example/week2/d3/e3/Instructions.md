# Compound Operators Exercise
## Objective
Learn how to use compound operators in Java: addition assignment (+=), subtraction assignment (-=), multiplication assignment (*=), division assignment (/=), and modulus assignment (%=).

## Instructions
1. **Create Variables**
   - Declare and initialize five separate integer variables:
      - `addOp` with the value 10.
      - `subOp` with the value 20.
      - `mulOp` with the value 5.
      - `divOp` with the value 40.
      - `modOp` with the value 17.
   - Example:
     ```java
     int addOp = 10;
     int subOp = 20;
     int mulOp = 5;
     int divOp = 40;
     int modOp = 17;
     ```

2. **Use Compound Operators**
   - Use the `+=` operator to add 5 to variable `addOp` and print the result.
   - Use the `-=` operator to subtract 3 from variable `subOp` and print the result.
   - Use the `*=` operator to multiply variable `mulOp` by 3 and print the result.
   - Use the `/=` operator to divide variable `divOp` by 5 and print the result.
   - Use the `%=` operator to calculate the remainder of variable `modOp` when divided by 5 and print the result.
   - Example code:
     ```java
     addOp += 5;  // addOp becomes 15
     System.out.println(addOp);
     
     subOp -= 3;  // subOp becomes 17
     System.out.println(subOp);
     
     mulOp *= 3;  // mulOp becomes 15
     System.out.println(mulOp);
     
     divOp /= 5;  // divOp becomes 8
     System.out.println(divOp);
     
     modOp %= 5;  // modOp becomes 2 (because 17 % 5 equals 2)
     System.out.println(modOp);
     ```

3. **Run Your Program**
   - Run your program to see the outputs after each compound operation.

## Expected Output
```
15
17
15
8
2
```

## Tips
- Compound operators combine arithmetic operations with assignment in one step.
- Print the value after each operation to observe how the variable changes.

## Additional Information
- **Compound Operators**: They combine an arithmetic operation with assignment. For example, `addOp += 5` is equivalent to `addOp = addOp + 5`.
- **Other Operators**: Similarly, `-=` subtracts and assigns, `*=` multiplies and assigns, `/=` divides and assigns, and `%=` computes the modulus and assigns.

## Troubleshooting
- Ensure that variables are declared correctly with the appropriate data types.
- Verify that compound operators are used with the correct syntax.
- If the program doesn't compile, check for syntax errors such as missing semicolons or typographical mistakes.

By following these steps, you should be able to successfully complete the exercise and understand how compound operators work in Java. Happy coding!