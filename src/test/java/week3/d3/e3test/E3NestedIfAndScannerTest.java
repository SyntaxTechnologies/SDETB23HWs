package week3.d3.e3test;

import org.junit.jupiter.api.Test;
import org.example.week3.d3.e3.E3NestedIfAndScanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class E3NestedIfAndScannerTest {

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
    public void testMaleAbove25() {
        String input = "42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        E3NestedIfAndScanner.main(new String[]{});


        boolean isPresent=outContent.toString().contains("You entered: 42");
        assertTrue(isPresent);
    }







}
