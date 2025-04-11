package week2.d4.e5Test;

import org.example.week2.d4.e5.E5IfElseStatements;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5IfElseStatementsTest {

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
    void testBooleanCheck() {
        // Simulate the program with the boolean value true
        E5IfElseStatements.main(new String[]{});
        String expectedOutput = "Java is fun!" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
