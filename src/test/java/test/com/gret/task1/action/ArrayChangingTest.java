package test.com.gret.task1.action;

import com.gret.task1.action.ArrayChanging;
import com.gret.task1.builder.ArrayBuilder;
import com.gret.task1.entity.Array;
import com.gret.task1.exeption.ArrayException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class ArrayChangingTest {
    static Logger logger = LogManager.getLogger();
    ArrayBuilder arrayBuilder;
    Array array;

    @BeforeClass
    public void setUp() throws ArrayException{
        arrayBuilder = new ArrayBuilder(4);
        int[] arr = { 1, -2, 3, -4 };
        arrayBuilder.setArray(arr);
        array = arrayBuilder.build();
    }

    @AfterClass
    public void tearDown() {
        arrayBuilder = null;
        array = null;
    }

    @Test
    public void replaceNegativeElementPositiveTest() throws ArrayException {
        logger.info("Positive replace test");
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElement(array);
        int[] actual = new int[4];
        for(int i = 0; i < array.getLength(); i++){
            actual[i] = array.getElement(i);
        }
        int[] expected = {1, 2, 3, 4};
        assertTrue("Arrays are not equal", java.util.Arrays.equals(actual, expected));
    }

    @Test
    public void replaceNegativeElementNegativeTest() throws ArrayException {
        logger.info("Negative replace test");
        ArrayChanging arrayChanging = new ArrayChanging();
        arrayChanging.replaceNegativeElement(array);
        int[] actual = new int[4];
        for(int i = 0; i < array.getLength(); i++){
            actual[i] = array.getElement(i);
        }
        int[] expected = {1, 2, 3, 3};
        assertTrue("Arrays are equal", !java.util.Arrays.equals(actual, expected));
    }


}
