# JAVA DATA TYPES EXPLAINED

## 1) WHAT ARE DATA TYPES?
In Java, a data type tells the program what kind of data (number, text, etc.) you want to store in a variable and how that data will be used.

## 2) WHY DO WE NEED DATA TYPES?
- They define how much memory the variable needs.
- They determine what operations you can perform on the data.
- They help prevent errors by ensuring we put valid data in each variable.

## 3) PRIMITIVE VS. NON-PRIMITIVE DATA TYPES
Broadly, Java has two categories of data types:

1. **Primitive Data Types**
   - These are the most basic data types.
   - They are not objects and do not belong to any class.
   - They store simple values directly (numbers, characters, true/false).

2. **Non-Primitive Data Types**
   - Also known as reference types (e.g., `String`, `Arrays`, `Classes`).
   - They are built from primitive types or other reference types.
   - Instead of storing a simple value directly, they hold a reference (an address) to where the data is located in memory.

## 4) PRIMITIVE DATA TYPES AND THEIR USE CASES
There are 8 primitive data types in Java:

1. **byte**
   - **Size**: 1 byte
   - **Range**: -128 to 127
   - **Use Case**: Useful for raw data streams or large arrays where the range of numbers is small.

2. **short**
   - **Size**: 2 bytes
   - **Range**: -32,768 to 32,767
   - **Use Case**: Similar to `byte`, but can hold a larger range. Rarely used, but can help optimize memory.

3. **int**
   - **Size**: 4 bytes
   - **Range**: -2,147,483,648 to 2,147,483,647
   - **Use Case**: The most commonly used integer type for general numeric operations without decimals.

4. **long**
   - **Size**: 8 bytes
   - **Range**: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
   - **Use Case**: Needed when the range of `int` is too small (e.g., large calculations, timestamps).

5. **float**
   - **Size**: 4 bytes
   - **Range**: ~1.4e-45 to ~3.4e+38 (approx.)
   - **Use Case**: For decimal numbers with single precision. Often used in graphics or scientific calculations where slight imprecision is acceptable.

6. **double**
   - **Size**: 8 bytes
   - **Range**: ~4.9e-324 to ~1.8e+308 (approx.)
   - **Use Case**: For decimal numbers with double precision. Used more often than `float` due to higher accuracy.

7. **boolean**
   - **Size**: 1 bit (commonly stored as a byte in many implementations)
   - **Values**: `true` or `false`
   - **Use Case**: For logical conditions (e.g., if something is true or false).

8. **char**
   - **Size**: 2 bytes (stores Unicode characters)
   - **Range**: `'\u0000'` to `'\uffff'`
   - **Use Case**: For storing a single character (letters, digits, symbols).

## 5) NON-PRIMITIVE DATA TYPES
> We’ll discuss these in detail later—no need to worry too much right now.

**Examples**:
- **String**: Holds sequences of characters (e.g., "Hello World").
- **Arrays**: Hold multiple values of the same type.
- **Classes and Objects**: We create them to structure data and code.

Non-primitive types:
- Are created from classes (built-in or user-defined).
- Store references (addresses) rather than direct values.

## 6) EXAMPLES OF USING DATA TYPES
Here are some variable declarations to show how we typically use them (primitive and non-primitive):

    // Primitive data types
    byte  smallNumber   = 10;
    short mediumNumber  = 32000;
    int   age           = 25;
    long  bigNumber     = 100000L;
    float piFloat       = 3.14F;
    double price        = 99.99;
    boolean isJavaFun   = true;
    char  initial       = 'A';

    // Non-primitive data type (String)
    String greeting     = "Hello, World!";

**Remember**:
- Use **int** for most whole numbers; switch to **long** if they might exceed the `int` range.
- Use **double** for decimal numbers unless there’s a strong reason to use **float**.
- Use **boolean** for true/false conditions.
- Use **char** for a single character.
- Use **String** for text (words, sentences, etc.).

## 7) COMMON MISTAKES

1. **Using `int` when the range might be exceeded**
   - If a value can be larger than `int` allows, use `long`.
   - For example, storing population counts or timestamps can exceed `int`.

2. **Forgetting decimal types for precise values**
   - If you need decimals (like 3.14), don’t use an `int`. Use `float` or (preferably) `double`.

3. **Misunderstanding `boolean`**
   - Attempting to store numbers in a `boolean` or treat true/false as 1/0. In Java, boolean cannot hold numeric values.

4. **Attempting to store multiple characters in `char`**
   - `char` can only store a single character (e.g., `'A'`). For multiple characters, use `String`.

5. **Using `float` instead of `double` inadvertently**
   - `float` is rarely used unless memory is critical. Often beginners use `float` incorrectly instead of `double`.

6. **Not adding the `F` or `L` suffix**
   - When declaring a `float`, you need `F` (e.g., `3.14F`).
   - When declaring a `long`, it’s a good practice to use `L` (e.g., `100000L`) to avoid confusion with `int`.
