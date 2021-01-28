package test.com.gret.task1.action;

import com.gret.task1.action.ArrayChanging;
import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class ArrayChangingTest {
    CustomArray customArray;

    @BeforeClass
    public void setUp() throws ArrayException{
        int[] arr = { 1, -2, 3, -4 };
        customArray = new CustomArray(arr);
    }

    @AfterClass
    public void tearDown() {
        customArray = null;
    }

    @Test
    public void replaceNegativeElementPositiveTest() throws ArrayException {
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElement(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 4};
        assertEquals(actual, expected);
    }

    @Test
    public void replaceNegativeElementNegativeTest() throws ArrayException {
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElement(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 3};
        assertNotEquals(actual, expected);
    }

    @Test
    public void replaceNegativeElementStreamPositiveTest() throws ArrayException {
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElementStream(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 4};
        assertEquals(actual, expected);
    }

    @Test
    public void replaceNegativeElementStreamNegativeTest() throws ArrayException {
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElementStream(customArray);
        int[] actual = customArray.getArray();
        int[] expected = {1, 2, 3, 3};
        assertNotEquals(actual, expected);
    }

}
