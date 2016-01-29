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

    @org.junit.Test
    public void testMain() throws Exception {

    }


    @Test
    public void testCheckCase() throws Exception {

    }
    @Test
    public void testBuildHello() throws Exception {
        try {
            String result = hello.buildHello("Scott");
            assertEquals("Hello, Scott!", result);
        }
        catch (Exception e) {
            fail("Error: " + e);
        }
        finally {
            System.out.println("Test complete");
        }
    }
    @Test
    public void testPrintHello() throws Exception {
        try {
            String[] name = new String[1];
            name[0] = "Scott";
            hello.main(name);
            assertEquals("Hello, Scott!", outContent.toString());

            outContent.reset();

            String[] nameTwo = new String[1];
            nameTwo[0] = "";
            hello.main(nameTwo);
            assertEquals("", outContent.toString());
        }
        catch (Exception e) {
            fail("Error: " + e);
        }
        finally {
            System.out.println("Test complete");
        }
    }


}