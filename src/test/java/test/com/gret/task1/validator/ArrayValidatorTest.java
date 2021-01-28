package test.com.gret.task1.validator;

import com.gret.task1.validator.ArrayValidator;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayValidatorTest {

    @Test
    public void parseLineToIntArrayPositiveTest() {
        String line = "1, 2, 3, 4, 5";
        String delimiter = ", ";
        assertTrue(ArrayValidator.isStringArray(line, delimiter));
    }

    @Test
    public void parseLineToIntArrayNegativeTest() {
        String line = "1  2 3   d";
        String delimiter = " ";
        assertFalse(ArrayValidator.isStringArray(line, delimiter));
    }

}
