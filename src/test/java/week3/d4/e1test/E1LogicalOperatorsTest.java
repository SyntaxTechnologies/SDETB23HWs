package week3.d4.e1test;

import org.example.week3.d4.e1.E1LogicalOperators;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E1LogicalOperatorsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final String lineSeparator = System.lineSeparator();

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }



    @Test
    void testEligible() {
        // Test when needsLoan is true and creditScore is 750 (>=700)
        E1LogicalOperators.main(new String[]{"true", "750"});

        String expectedOutput = "The eligibility is Eligible" + lineSeparator;
        String failureMessage = "The output does not match for a user with sufficient credit score.";
        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }



}