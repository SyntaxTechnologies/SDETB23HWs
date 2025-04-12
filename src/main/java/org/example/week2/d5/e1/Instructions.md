# Weekly Activity Planner

## Objective
Learn how to use `if-else-if` conditions in Java to select and print an activity based on the day of the week. This exercise reinforces the use of multiple conditional checks using only basic Java concepts: variables, primitive data types, relational operators, and if-else-if conditions.

## Instructions

In this exercise, you will write a Java program that assigns a day number (from 1 to 7) to a variable representing a day of the week, then uses an `if-else-if` structure to print the planned activity for that day.

### Steps:

1. **Assign a Day Value**
   - Declare a variable `day` (of type `int`) and assign it a value of 3 to it.
2. **Set Up Day Activity with Else-if Conditions**
   - Use an `if-else-if` structure to determine the activity for each day:
      - **If** `day` equals 1, print:  
        `"Monday: Attend classes."`
      - **Else if** `day` equals 2, print:  
        `"Tuesday: Library visit."`
      - **Else if** `day` equals 3, print:  
        `"Wednesday: Group study session."`
      - **Else if** `day` equals 4, print:  
        `"Thursday: Lab work."`
      - **Else if** `day` equals 5, print:  
        `"Friday: Sports day."`
      - **Else if** `day` equals 6, print:  
        `"Saturday: Free day for hobbies."`
      - **Else if** `day` equals 7, print:  
        `"Sunday: Family time."`
        - **Else**, print:  
            `"Invalid day number. Please enter a number between 1 and 7."`
3. **Print the Day and Activity**
   - Print the day number and the corresponding activity in the format:  
     `"Day <day>: <activity>"`

## Expected Output
For example, if `day` is set to `3`, the output should be:
```
Wednesday: Group study session.
```
*Note:* The output will change based on the day value you assign.

## Tips
- Declare and assign your variable correctly.
- Ensure your `if-else-if` conditions cover all possible values from 1 to 7.

## Troubleshooting
- Verify that your variable declaration and assignment are correct.
- Check that each condition's code block is properly enclosed in curly braces `{}`.
- Ensure the conditions are in the proper sequence so that only one condition's block executes.

