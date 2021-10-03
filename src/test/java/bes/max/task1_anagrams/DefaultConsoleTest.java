package bes.max.task1_anagrams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DefaultConsoleTest {

    Console consoleForTest = new DefaultConsole();

    @Test
    void consolePrintGivenString() {
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        consoleForTest.print("asd");
        assertEquals(out.toString(), ("asd" + System.lineSeparator()));
    }

    @Test
    void consoleReadGivenString() {
        String input = "Text for test";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("Text for test", consoleForTest.read());
    }
}
