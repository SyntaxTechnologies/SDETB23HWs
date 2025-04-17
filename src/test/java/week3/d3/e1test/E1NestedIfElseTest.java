package week3.d3.e1test;

import org.junit.jupiter.api.AfterEach;
import org.example.week3.d3.e1.E1NestedIfElse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E1NestedIfElseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testValidMonth() {
        String simulatedInput = "1\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        E1NestedIfElse.main(new String[]{});
        String expectedOutput = "You are eligible to ride the roller coaster." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }


}
