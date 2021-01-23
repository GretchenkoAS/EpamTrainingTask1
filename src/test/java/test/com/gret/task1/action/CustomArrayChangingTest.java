package test.com.gret.task1.action;

import com.gret.task1.action.ArrayChanging;
import com.gret.task1.entity.CustomArray;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class CustomArrayChangingTest {
    static Logger logger = LogManager.getLogger();
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
        int[] actual = new int[4];
        for(int i = 0; i < customArray.getLength(); i++){
            actual[i] = customArray.getElement(i);
        }
        int[] expected = {1, 2, 3, 4};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void replaceNegativeElementNegativeTest() throws ArrayException {
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElement(customArray);
        int[] actual = new int[4];
        for(int i = 0; i < customArray.getLength(); i++){
            actual[i] = customArray.getElement(i);
        }
        int[] expected = {1, 2, 3, 3};
        assertTrue("Arrays are equal", !java.util.Arrays.equals(actual, expected));
    }


}
