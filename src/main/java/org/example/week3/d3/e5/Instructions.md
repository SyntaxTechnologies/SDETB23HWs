# Car Rental Eligibility Checker

## Objective
Learn how to use the Scanner class and nested if-else conditions in Java to determine if a person is eligible to rent a car based on their age and whether they have a valid driver's license.

## Instructions

In this exercise, you will write a simple program that asks the user for:
- Their age (as an integer)
- Whether they have a valid driver's license (as a String, e.g., "yes" or "no")

The program should follow these steps:

1. **Create a Scanner Object**
   - Set up a Scanner to read input from the console.

2. **Capture Input Information**
   - Ask the user: "Please enter your age:" and store the answer in a variable called `age`.
   - Ask the user: "Do you have a valid driver's license? (yes/no):" and store the answer in a variable called `licenseStatus`.

3. **Check Car Rental Eligibility**
   - Use an `if-else` statement to check if `age` is greater than or equal to 21.
      - **If** `age` is 21 or older:
         - Use a nested `if-else` statement to check if `licenseStatus` equals "yes".
            - **If** it is "yes", print:  
              `"You are eligible to rent a car."`
            - **Else**, print:  
              `"You are not eligible to rent a car because you don't have a valid driver's license."`
      - **Else** (if the `age` is less than 21):
         - Print:  
           `"You are not eligible to rent a car because you are too young."`

## Expected Output

For example:

```
Example Output: for age 25 and license status "yes"
Please enter your age:
25
Do you have a valid driver's license? (yes/no):
yes
You are eligible to rent a car.
```

```
Example Output: for age 25 and license status "no"
Please enter your age:
25
Do you have a valid driver's license? (yes/no):
no
You are not eligible to rent a car because you don't have a valid driver's license.
```

```
Example Output: for age 18 (any license status)
Please enter your age:
18
Do you have a valid driver's license? (yes/no):
yes
You are not eligible to rent a car because you are too young.
```

## Tips
- **Data Types:**  
  Use an `int` variable for the age and a `String` variable for the driver's license status.
- **Nested Conditions:**  
  First check if the age is sufficient (21 or older), and only then check the license status.
- **Keep It Simple:**  
  Follow each step carefully and test your program to ensure it behaves as expected.

---
