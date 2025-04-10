package week2.d3.e3test;

import org.example.week2.d3.e3.E3CompoundOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E3CompoundOperatorsTest {

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
    void testCalculateCost() {
        E3CompoundOperators.main(new String[]{});
        String expectedOutput = "15" + System.lineSeparator() +
                "17" + System.lineSeparator() +
                "15" + System.lineSeparator() +
                "8" + System.lineSeparator() +
                "2" + System.lineSeparator();

        String failureMessage = "The output does not match the expected value";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
