package week2.d5.e1Test;

import org.example.week2.d5.e1.E1ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1ElseIfTest {

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
    void testWithinBudget() {
        // Simulate the program with expenses within budget
        E1ElseIf.main(new String[]{});
        String expectedOutput = "Wednesday: Group study session." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
