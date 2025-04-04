package week1.d3.e2test;

import org.example.week1.d3.e2.E2HelloWorld;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2HelloWorldTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testHelloWorldOutput() {
        E2HelloWorld.main(new String[]{});
        String expectedOutput = "Hello, World!" + System.lineSeparator() +
                "Welcome to Java!" + System.lineSeparator();
        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints two lines:\n" +
                "'Hello, World!' on the first line and 'Welcome to Java!' on the second.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}