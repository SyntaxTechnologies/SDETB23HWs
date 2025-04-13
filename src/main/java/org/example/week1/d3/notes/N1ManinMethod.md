# INTRODUCTION FOR BEGINNERS

## 1) WHAT IS A CLASS?
A **class** in Java is like a **file** where you write your code. Imagine it as a container or a notebook where you store all the instructions you want your computer to follow. You put your code in the class, just like you would write down your ideas or a story in a notebook.

## 2) WHAT IS THE MAIN METHOD?
Inside that file (class), you need a special part called the **main method**. Think of the main method as the "start" button of your program. When you run your code, the computer looks for the main method to know where to begin. Its declaration always looks like this:
```java
public static void main(String[] args)
```
Everything you put inside the main method gets executed when you run your program.

## 3) WHAT IS "SYSTEM.OUT.PRINTLN()"?
`System.out.println()` is a command that tells your computer to **display a message** on the screen. It's used for printing out text. For example, if you want to see the message "Hello, world!" when you run your program, you include it in the main method like this:
```java
public class MyClass {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

**Key points:**
- A **class** is like a file where you write your code.
- The **main method** is the starting point of your program.
- **System.out.println()** prints messages to the screen.

With these basics, you're ready to write and run your first Java program!