package week2.d3.e5test;

import org.example.week2.d3.e5.E5SingleDoubleEqual;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E5SingleDoubleEqualTest {

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
    void testPizzaParty() {
        E5SingleDoubleEqual.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator() +
                "false" + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
