package week1.d3.e1test;

import org.example.week1.d3.e1.E1HelloWorld;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1HelloWorldTest {

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
        E1HelloWorld.main(new String[]{});
        String expectedOutput = "Hello, World!" + System.lineSeparator();
        String failureMessage = "The output does not match the expected output.\n" +
                "Please ensure your program prints 'Hello, World!' followed by a newline.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}