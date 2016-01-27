package hello;

import static org.junit.Assert.*;

/**
 * Created by Scott Shuffler on 1/25/16.
 */

public class helloTest {

    @org.junit.Test
    public void testMain() throws Exception {
        try {
            String[] name = new String[10];
            name[0] = "Scott";
            hello.main(name);
        }
        catch (Exception e) {
            fail("Uh oh: " + e);
        }
        finally {
            System.out.println("Test complete");
        }
    }
}