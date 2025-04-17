package week3.d3.e4test;

import org.example.week3.d3.e4.E4NestedIfAndScanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E4NestedIfAndScannerTest {

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
    public void testCoffeeRecommendationStrong() {
        String input = "6.0" + lineSeparator + "strong" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E4NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your coffee budget:" + lineSeparator +
                "Do you prefer your coffee strong?" + lineSeparator +
                "You should try an Espresso!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCoffeeRecommendationLatte() {
        String input = "6.0" + lineSeparator + "mild" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E4NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your coffee budget:" + lineSeparator +
                "Do you prefer your coffee strong?" + lineSeparator +
                "You should try a Latte!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testCoffeeRecommendationInstant() {
        String input = "4.0" + lineSeparator + "any" + lineSeparator;
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E4NestedIfAndScanner.main(new String[]{});

        String expectedOutput = "Please enter your coffee budget:" + lineSeparator +
                "Do you prefer your coffee strong?" + lineSeparator +
                "You might enjoy a simple cup of Instant Coffee!" + lineSeparator;
        assertEquals(expectedOutput, outContent.toString());
    }
}