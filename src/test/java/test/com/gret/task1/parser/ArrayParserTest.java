package test.com.gret.task1.parser;

import com.gret.task1.exeption.ArrayException;
import com.gret.task1.parser.ArrayParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ArrayParserTest {
    ArrayParser parser;

    @BeforeClass
    public void setUp() {
        parser = new ArrayParser();
    }

    @AfterClass
    public void tearDown() {
        parser = null;
    }

    @Test
    public void parseLineToIntArrayPositiveTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArray("1 2 3 4");
        int[] expected = {1, 2, 3, 4};
        assertEquals(actual, expected);
    }

    @Test
    public void parseLineToIntArrayNegativeTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArray("1 2 3 4");
        int[] expected = {1, 2, 3, 3};
        assertNotEquals(actual, expected);
    }

    @Test
    public void parseLineToIntArrayStreamPositiveTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArrayStream("1 2 3 4");
        int[] expected = {1, 2, 3, 4};
        assertEquals(actual, expected);
    }

    @Test
    public void parseLineToIntArrayStreamNegativeTest() throws ArrayException {
        int[] actual = parser.parseLineToIntArrayStream("1 2 3 4");
        int[] expected = {1, 2, 3, 3};
        assertNotEquals(actual, expected);
    }
}
