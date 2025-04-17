package week3.d3.e2test;

import org.junit.jupiter.api.Test;
import org.example.week3.d3.e2.E2NestedIfElse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E2NestedIfElseTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String lineSeparator = System.lineSeparator();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSunnyAndHot() {
        String input = "true" + lineSeparator + "90" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E2NestedIfElse.main(new String[]{});

        String expectedOutput = "You qualify for an age-based discount." + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

}
