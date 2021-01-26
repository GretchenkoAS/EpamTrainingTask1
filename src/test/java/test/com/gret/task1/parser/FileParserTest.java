package test.com.gret.task1.parser;

import com.gret.task1.exeption.ArrayException;
import com.gret.task1.parser.FileParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertTrue;

public class FileParserTest {
    FileParser parser;

    @BeforeClass
    public void setUp() {
        parser = new FileParser();
    }

    @AfterClass
    public void tearDown() {
        parser = null;
    }

    @Test
    public void parseLineToIntArrayPositiveTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArray("1 2 3 4");
        int[] expected = {1, 2, 3, 4};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void parseLineToIntArrayNegativeTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArray("1 2 3 4");
        int[] expected = {1, 2, 3, 3};
        assertTrue("Arrays are not equal", !java.util.Arrays.equals(actual, expected));
    }
}
