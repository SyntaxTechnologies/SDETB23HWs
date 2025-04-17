package week3.d3.e5test;

import org.example.week3.d3.e5.E5NestedIfAndScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E5NestedIfAndScannerTest {

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
    public void testEligibleRental() {
        // Test for age 25 with license status "yes"
        String input = "25" + lineSeparator + "yes" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your age:" + lineSeparator +
                "Do you have a valid driver's license? (yes/no):" + lineSeparator +
                "You are eligible to rent a car." + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testNoLicense() {
        // Test for age 25 with license status "no"
        String input = "25" + lineSeparator + "no" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your age:" + lineSeparator +
                "Do you have a valid driver's license? (yes/no):" + lineSeparator +
                "You are not eligible to rent a car because you don't have a valid driver's license." + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testTooYoung() {
        // Test for age 18 (too young), regardless of license status
        String input = "18" + lineSeparator + "yes" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E5NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your age:" + lineSeparator +
                "Do you have a valid driver's license? (yes/no):" + lineSeparator +
                "You are not eligible to rent a car because you are too young." + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}