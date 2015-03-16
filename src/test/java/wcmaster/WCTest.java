package wcmaster;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;


public class WCTest {

    File manWc = new File("target/test-classes/man_wc");

    File wcHelp = new File("target/test-classes/wc_help");

    @Test
    public void testThatManWcHas62Lines() {

        int expectedLinesInManWc = 62;
        int actualLinesInManWc = 0; // File manWc
        assertEquals(expectedLinesInManWc, actualLinesInManWc);
    }

    @Test
    public void testThatManWcAndWcHelpHas3591Chars() {

        int expectedCharsInBoth = 3581;
        int actualCharsInBoth = 0; // File manWc, wcHelp
        assertEquals(expectedCharsInBoth, actualCharsInBoth);
    }

    @Test
    public void testWcHelp() {

        int expectedCharsInWcHelp = 1243;
        int expectedLinesInWcHelp = 23;
        int actualCharsInWcHelp = 0;
        int actualLinesInWcHelp = 0;

        assertEquals(expectedCharsInWcHelp, actualCharsInWcHelp);
        assertEquals(expectedLinesInWcHelp, actualLinesInWcHelp);
    }



}
