package week2.d5.e2test;
import org.example.week2.d5.e2.E2ElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E2ElseIfTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        // Redirect System.out to capture outputs
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(originalIn);
    }



    @Test
    void testTemperature() {
        E2ElseIf.main(new String[]{});

        // Define expected output
        String expectedOutput = "It's warm outside."+System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "Invalid Temperature.");
    }


}
