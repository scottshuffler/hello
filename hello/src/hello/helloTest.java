package hello;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by Scott Shuffler.
 */

public class helloTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setErr(null);
    }

    @Test
    public void testCheckCase() throws Exception {
        String test = "Scott";
        String test1 = hello.checkCase("scOtt");
        String test2 = hello.checkCase("SCOTT");
        String test3 = hello.checkCase("sCOTT");
        assertEquals(test,test1);
        assertEquals(test,test2);
        assertEquals(test,test3);
    }

    @Test
    public void testBuildHello() throws Exception {
        String result = hello.buildHello("Scott");
        assertEquals("Hello, Scott. My name is Computer. How are you Scott?", result);
    }

    @Test
    public void testPrintHello() throws Exception {
        String[] name = new String[1];
        name[0] = "Scott";
        hello.main(name);
        assertEquals("Hello, Scott. My name is Computer. How are you Scott?", outContent.toString());
    }


}