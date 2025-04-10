package week2.d3.e4test;

import org.example.week2.d3.e4.E4RelationalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E4RelationalOperatorsTest {

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
    void testShoppingCartCalculation() {
        E4RelationalOperators.main(new String[]{});
        String expectedOutput = "true" + System.lineSeparator()+
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator() +
                "true" + System.lineSeparator() ;


        String failureMessage = "The output does not match the expected values.\n";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
